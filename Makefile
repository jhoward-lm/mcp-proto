MAKEFILE ?= ${abspath ${firstword ${MAKEFILE_LIST}}}

# ANSI color escape codes
BOLD   := \033[1m
CYAN   := \033[38;5;51m
GREEN  := \033[38;5;46m
YELLOW := \033[38;5;226m
RESET  := \033[0m

THIRD_PARTY := ${PWD}/.third_party
TOOLS_BIN   := ${PWD}/.bin
PATH        := ${TOOLS_BIN}:${PATH}
GOPATH      ?= ${shell go env GOPATH}

GIT_REMOTE := ${shell git config remote.origin.url}
GIT_REMOTE ?= undefined

# Default system architecture
OS      ?= linux
ARCH    ?= amd64
EXE_EXT :=

BUF_VERSION              := 1.56.0
PROTOC_GO_GRPC_VERSION   := 1.5.1
PROTOC_GO_VERSION        := 1.36.6
PROTOC_JAVA_GRPC_VERSION := 1.74.0
PROTOC_VERSION           := 31.1

BUF_FILENAME              := buf-${shell uname -s}-${shell uname -m}
BUF_DOWNLOAD_URL          := https://github.com/bufbuild/buf/releases/download/v${BUF_VERSION}/${BUF_FILENAME}
PROTOC_FILENAME           := protoc-${PROTOC_VERSION}
PROTOC_JAVA_GRPC_FILENAME := protoc-gen-grpc-java-${PROTOC_JAVA_GRPC_VERSION}

ifeq (${OS},Windows_NT)
	OS      := windows
	EXE_EXT := .exe

	PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -${OS}, ${PROTOC_JAVA_GRPC_FILENAME}}

	ifeq (${PROCESSOR_ARCHITECTURE},x86)
		ARCH := i386
		PROTOC_FILENAME := ${addsuffix -win32, ${PROTOC_FILENAME}}
		PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -x86_32, ${PROTOC_JAVA_GRPC_FILENAME}}
	else
		PROTOC_FILENAME := ${addsuffix -win64, ${PROTOC_FILENAME}}
		PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -x86_64, ${PROTOC_JAVA_GRPC_FILENAME}}
	endif
else
	uname_s := ${shell uname -s}
	uname_p := ${shell uname -p}

	ifeq (${uname_s},Darwin)
		OS := macos
		PROTOC_FILENAME           := ${addsuffix -osx, ${PROTOC_FILENAME}}
		PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -osx, ${PROTOC_JAVA_GRPC_FILENAME}}
	else
		PROTOC_FILENAME           := ${addsuffix -linux, ${PROTOC_FILENAME}}
		PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -linux, ${PROTOC_JAVA_GRPC_FILENAME}}
	endif

	ifeq (${uname_p},arm)
		ARCH := arm64
		PROTOC_FILENAME           := ${addsuffix -aarch_64, ${PROTOC_FILENAME}}
		PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -aarch_64, ${PROTOC_JAVA_GRPC_FILENAME}}
	else
		PROTOC_FILENAME           := ${addsuffix -x86_64, ${PROTOC_FILENAME}}
		PROTOC_JAVA_GRPC_FILENAME := ${addsuffix -x86_64, ${PROTOC_FILENAME}}
	endif
endif

PROTOC_FILENAME               := ${addsuffix .zip, ${PROTOC_FILENAME}}
PROTOC_DOWNLOAD_URL           := https://github.com/protocolbuffers/protobuf/releases/download/v${PROTOC_VERSION}/${PROTOC_FILENAME}
PROTOC_JAVA_GRPC_FILENAME     := ${addsuffix .exe, ${PROTOC_JAVA_GRPC_FILENAME}}
PROTOC_JAVA_GRPC_DOWNLOAD_URL := https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${PROTOC_JAVA_GRPC_VERSION}/${PROTOC_JAVA_GRPC_FILENAME}

#@ Tools
help: # Display this help
	@awk 'BEGIN {FS = ":.*#"; printf "\n${YELLOW}Usage: make <target>${RESET}\n"} \
	  /^[a-zA-Z_0-9-]+:.*?#/ { printf "  ${CYAN}%-20s${RESET} %s\n", $$1, $$2 } \
	  /^#@/ { printf "\n${BOLD}%s${RESET}\n", substr($$0, 4) }' ${MAKEFILE_LIST} && echo

.PHONY: clean
clean: # Clean the working directory
	@${RM} -r gen{go,java,python}
	@find ${PWD} -name "*.log" -exec ${RM} {} \;

TOOL_NAMES := buf protoc \
  protoc-gen-buf-breaking protoc-gen-buf-lint \
  protoc-gen-go protoc-gen-go-grpc \
  protoc-gen-grpc-java

TOOL_PATHS := ${addprefix ${TOOLS_BIN}/, ${addsuffix ${EXE_EXT}, ${TOOL_NAMES}}}

.PHONY: install
install: tools proto-libs # Install development tools and dependencies

.PHONY: tools
tools: ${TOOLS_BIN} ${THIRD_PARTY} ${TOOL_PATHS}

.PHONY: proto-libs
proto-libs: ${THIRD_PARTY} ${THIRD_PARTY}/buf/validate/validate.proto ${THIRD_PARTY}/google/api/*.proto ${THIRD_PARTY}/google/protobuf/*.proto

define download_protos
	@printf "Downloading ${CYAN}${1}${RESET} third-party protos..."
	@curl --fail --silent --show-error --location \
	  --url https://github.com/${1}/archive/refs/heads/${2}.tar.gz | \
	  tar xz --directory ${THIRD_PARTY} --strip-components=${3} ${4}
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"
endef

${THIRD_PARTY}:
	@printf "Creating third-party proto libs directory: ${CYAN}${THIRD_PARTY}${RESET}..."
	@mkdir -p ${THIRD_PARTY}
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

${THIRD_PARTY}/buf/validate/validate.proto:
	${call download_protos,bufbuild/protovalidate,main,3,protovalidate-main/proto/protovalidate/buf/validate/validate.proto}

${THIRD_PARTY}/google/api/*.proto:
	${call download_protos,googleapis/googleapis,master,1,googleapis-master/google/api}

${THIRD_PARTY}/google/protobuf/*.proto:
	${call download_protos,protocolbuffers/protobuf,main,2,protobuf-main/src/google/protobuf}

${TOOLS_BIN}:
	@printf "Creating tools directory: ${CYAN}${TOOLS_BIN}${RESET}..."
	@mkdir -p ${TOOLS_BIN}
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

${TOOLS_BIN}/buf${EXE_EXT} ${TOOLS_BIN}/protoc-gen-buf-breaking${EXE_EXT} ${TOOLS_BIN}/protoc-gen-buf-lint${EXE_EXT}:
	@printf "Installing ${CYAN}buf${RESET} CLI..."

	@if [[ $${OS} == "windows" ]]; then \
	  curl --fail --silent --show-error --location \
	  	--url "${BUF_DOWNLOAD_URL}.zip" --remote-name; \
	  unzip -d ${TOOLS_BIN} -X -j ${BUF_FILENAME}.zip \
	    buf/bin/buf${EXE_EXT} \
		buf/bin/protoc-gen-buf-breaking${EXE_EXT} \
		buf/bin/protoc-gen-buf-lint${EXE_EXT}; \
	  rm ${BUF_FILENAME}.zip; \
	else \
	  curl --fail --silent --show-error --location \
	  	--url "${BUF_DOWNLOAD_URL}.tar.gz" | \
	  	tar xz --directory ${TOOLS_BIN} --strip-components=2 buf/bin; \
	fi

	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"; \

${TOOLS_BIN}/protoc${EXE_EXT}:
	@printf "Installing ${CYAN}protoc${RESET} compiler..."
	@curl --fail --silent --show-error --location --url "${PROTOC_DOWNLOAD_URL}" --remote-name
	@printf "${YELLOW}\n"
	@unzip -d ${TOOLS_BIN} -X -j ${PROTOC_FILENAME} bin/protoc${EXE_EXT}
	@printf "${RESET}"
	@chmod u+w ${TOOLS_BIN}/protoc
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"
	@${RM} ${PROTOC_FILENAME}

${TOOLS_BIN}/protoc-gen-go${EXE_EXT}:
	@printf "Installing ${CYAN}protoc-gen-go${RESET} compiler plugin..."
	@GOBIN=${TOOLS_BIN} go install google.golang.org/protobuf/cmd/protoc-gen-go@v${PROTOC_GO_VERSION}
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

${TOOLS_BIN}/protoc-gen-go-grpc${EXE_EXT}:
	@printf "Installing ${CYAN}protoc-gen-go-grpc${RESET} compiler plugin..."
	@GOBIN=${TOOLS_BIN} go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v${PROTOC_GO_GRPC_VERSION}
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

${TOOLS_BIN}/protoc-gen-grpc-java${EXE_EXT}:
	@printf "Installing ${CYAN}protoc-gen-grpc-java${RESET} compiler plugin..."
	@curl --fail --silent --show-error --location \
	  --url "${PROTOC_JAVA_GRPC_DOWNLOAD_URL}" \
	  --output ${TOOLS_BIN}/protoc-gen-grpc-java${EXE_EXT}
	@chmod +x ${TOOLS_BIN}/protoc-gen-grpc-java${EXE_EXT}
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

#@ Build
.PHONY: build
build: install # Build protobuf files into a Buf image
	@printf "Building image of protos with ${CYAN}buf${RESET}..."
	@buf build --output image.binpb --as-file-descriptor-set
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

.PHONY: format
format: install # Check for breaking changes in protocol buffer definitions
	@printf "Formatting protos with ${CYAN}buf${RESET}..."
	@buf format --write
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

.PHONY: generate
generate: install # Build protobuf autogenerated code
	@printf "Generating code from protos with ${CYAN}buf${RESET}..."
	@buf generate --clean
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

.PHONY: generate-grpc
generate-grpc: # Build gRPC autogenerated code
	@printf "Generating gRPC service code from protos with ${CYAN}buf${RESET}..."
	@buf generate --template buf.gen.grpc.yaml
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"

.PHONY: lint
lint: install # Check for breaking changes in protocol buffer definitions
	@printf "Linting protos with ${CYAN}buf${RESET}..."
	@buf format --diff --exit-code
	@buf lint
	@buf breaking --against .git#branch=main
	@printf "${BOLD}${GREEN}DONE${RESET}\n\n"
