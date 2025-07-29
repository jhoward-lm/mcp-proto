from google.protobuf import struct_pb2 as _struct_pb2
from mcp.server.v1 import capabilities_pb2 as _capabilities_pb2
from mcp.server.v1 import common_pb2 as _common_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class BlobResourceContents(_message.Message):
    __slots__ = ("uri", "mime_type", "_meta", "blob")
    URI_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    BLOB_FIELD_NUMBER: _ClassVar[int]
    uri: str
    mime_type: str
    _meta: _struct_pb2.Struct
    blob: str
    def __init__(self, uri: _Optional[str] = ..., mime_type: _Optional[str] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., blob: _Optional[str] = ...) -> None: ...

class CallToolResult(_message.Message):
    __slots__ = ("content", "structured_content", "is_error")
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    STRUCTURED_CONTENT_FIELD_NUMBER: _ClassVar[int]
    IS_ERROR_FIELD_NUMBER: _ClassVar[int]
    content: _containers.RepeatedCompositeFieldContainer[_struct_pb2.Struct]
    structured_content: _struct_pb2.Struct
    is_error: bool
    def __init__(self, content: _Optional[_Iterable[_Union[_struct_pb2.Struct, _Mapping]]] = ..., structured_content: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., is_error: bool = ...) -> None: ...

class CompleteResult(_message.Message):
    __slots__ = ("values", "total", "has_more")
    VALUES_FIELD_NUMBER: _ClassVar[int]
    TOTAL_FIELD_NUMBER: _ClassVar[int]
    HAS_MORE_FIELD_NUMBER: _ClassVar[int]
    values: _containers.RepeatedScalarFieldContainer[str]
    total: int
    has_more: bool
    def __init__(self, values: _Optional[_Iterable[str]] = ..., total: _Optional[int] = ..., has_more: bool = ...) -> None: ...

class GetPromptResult(_message.Message):
    __slots__ = ("description", "messages")
    class PromptMessage(_message.Message):
        __slots__ = ("role", "content")
        ROLE_FIELD_NUMBER: _ClassVar[int]
        CONTENT_FIELD_NUMBER: _ClassVar[int]
        role: _common_pb2.Role
        content: _struct_pb2.Struct
        def __init__(self, role: _Optional[_Union[_common_pb2.Role, str]] = ..., content: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    MESSAGES_FIELD_NUMBER: _ClassVar[int]
    description: str
    messages: _containers.RepeatedCompositeFieldContainer[GetPromptResult.PromptMessage]
    def __init__(self, description: _Optional[str] = ..., messages: _Optional[_Iterable[_Union[GetPromptResult.PromptMessage, _Mapping]]] = ...) -> None: ...

class InitializeResult(_message.Message):
    __slots__ = ("protocol_version", "capabilities", "server_info", "instructions")
    PROTOCOL_VERSION_FIELD_NUMBER: _ClassVar[int]
    CAPABILITIES_FIELD_NUMBER: _ClassVar[int]
    SERVER_INFO_FIELD_NUMBER: _ClassVar[int]
    INSTRUCTIONS_FIELD_NUMBER: _ClassVar[int]
    protocol_version: str
    capabilities: _capabilities_pb2.ServerCapabilities
    server_info: _common_pb2.Implementation
    instructions: str
    def __init__(self, protocol_version: _Optional[str] = ..., capabilities: _Optional[_Union[_capabilities_pb2.ServerCapabilities, _Mapping]] = ..., server_info: _Optional[_Union[_common_pb2.Implementation, _Mapping]] = ..., instructions: _Optional[str] = ...) -> None: ...

class ListPromptsResult(_message.Message):
    __slots__ = ("next_cursor", "prompts")
    class Prompt(_message.Message):
        __slots__ = ("base", "description", "arguments", "_meta")
        class Argument(_message.Message):
            __slots__ = ("base", "description", "required")
            BASE_FIELD_NUMBER: _ClassVar[int]
            DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
            REQUIRED_FIELD_NUMBER: _ClassVar[int]
            base: _common_pb2.BaseMetadata
            description: str
            required: bool
            def __init__(self, base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ..., description: _Optional[str] = ..., required: bool = ...) -> None: ...
        BASE_FIELD_NUMBER: _ClassVar[int]
        DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
        ARGUMENTS_FIELD_NUMBER: _ClassVar[int]
        _META_FIELD_NUMBER: _ClassVar[int]
        base: _common_pb2.BaseMetadata
        description: str
        arguments: _containers.RepeatedCompositeFieldContainer[ListPromptsResult.Prompt.Argument]
        _meta: _struct_pb2.Struct
        def __init__(self, base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ..., description: _Optional[str] = ..., arguments: _Optional[_Iterable[_Union[ListPromptsResult.Prompt.Argument, _Mapping]]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    NEXT_CURSOR_FIELD_NUMBER: _ClassVar[int]
    PROMPTS_FIELD_NUMBER: _ClassVar[int]
    next_cursor: _common_pb2.PaginatedResult
    prompts: _containers.RepeatedCompositeFieldContainer[ListPromptsResult.Prompt]
    def __init__(self, next_cursor: _Optional[_Union[_common_pb2.PaginatedResult, _Mapping]] = ..., prompts: _Optional[_Iterable[_Union[ListPromptsResult.Prompt, _Mapping]]] = ...) -> None: ...

class ListResourcesResult(_message.Message):
    __slots__ = ("next_cursor", "resources")
    NEXT_CURSOR_FIELD_NUMBER: _ClassVar[int]
    RESOURCES_FIELD_NUMBER: _ClassVar[int]
    next_cursor: _common_pb2.PaginatedResult
    resources: _containers.RepeatedCompositeFieldContainer[Resource]
    def __init__(self, next_cursor: _Optional[_Union[_common_pb2.PaginatedResult, _Mapping]] = ..., resources: _Optional[_Iterable[_Union[Resource, _Mapping]]] = ...) -> None: ...

class ListResourceTemplatesResult(_message.Message):
    __slots__ = ("next_cursor", "resource_templates")
    NEXT_CURSOR_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_TEMPLATES_FIELD_NUMBER: _ClassVar[int]
    next_cursor: _common_pb2.PaginatedResult
    resource_templates: _containers.RepeatedCompositeFieldContainer[ResourceTemplate]
    def __init__(self, next_cursor: _Optional[_Union[_common_pb2.PaginatedResult, _Mapping]] = ..., resource_templates: _Optional[_Iterable[_Union[ResourceTemplate, _Mapping]]] = ...) -> None: ...

class ListToolsResult(_message.Message):
    __slots__ = ("next_cursor", "tools")
    class Tool(_message.Message):
        __slots__ = ("base", "description", "input_schema", "output_schema", "annotations", "_meta")
        class Annotations(_message.Message):
            __slots__ = ("title", "destructive_hint", "idempotent_hint", "open_world_hint", "read_only_hint")
            TITLE_FIELD_NUMBER: _ClassVar[int]
            DESTRUCTIVE_HINT_FIELD_NUMBER: _ClassVar[int]
            IDEMPOTENT_HINT_FIELD_NUMBER: _ClassVar[int]
            OPEN_WORLD_HINT_FIELD_NUMBER: _ClassVar[int]
            READ_ONLY_HINT_FIELD_NUMBER: _ClassVar[int]
            title: str
            destructive_hint: bool
            idempotent_hint: bool
            open_world_hint: bool
            read_only_hint: bool
            def __init__(self, title: _Optional[str] = ..., destructive_hint: bool = ..., idempotent_hint: bool = ..., open_world_hint: bool = ..., read_only_hint: bool = ...) -> None: ...
        BASE_FIELD_NUMBER: _ClassVar[int]
        DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
        INPUT_SCHEMA_FIELD_NUMBER: _ClassVar[int]
        OUTPUT_SCHEMA_FIELD_NUMBER: _ClassVar[int]
        ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
        _META_FIELD_NUMBER: _ClassVar[int]
        base: _common_pb2.BaseMetadata
        description: str
        input_schema: _struct_pb2.Struct
        output_schema: _struct_pb2.Struct
        annotations: ListToolsResult.Tool.Annotations
        _meta: _struct_pb2.Struct
        def __init__(self, base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ..., description: _Optional[str] = ..., input_schema: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., output_schema: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., annotations: _Optional[_Union[ListToolsResult.Tool.Annotations, _Mapping]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    NEXT_CURSOR_FIELD_NUMBER: _ClassVar[int]
    TOOLS_FIELD_NUMBER: _ClassVar[int]
    next_cursor: _common_pb2.PaginatedResult
    tools: _containers.RepeatedCompositeFieldContainer[ListToolsResult.Tool]
    def __init__(self, next_cursor: _Optional[_Union[_common_pb2.PaginatedResult, _Mapping]] = ..., tools: _Optional[_Iterable[_Union[ListToolsResult.Tool, _Mapping]]] = ...) -> None: ...

class ReadResourceResult(_message.Message):
    __slots__ = ("contents",)
    CONTENTS_FIELD_NUMBER: _ClassVar[int]
    contents: _containers.RepeatedCompositeFieldContainer[ResourceContentsUnion]
    def __init__(self, contents: _Optional[_Iterable[_Union[ResourceContentsUnion, _Mapping]]] = ...) -> None: ...

class Resource(_message.Message):
    __slots__ = ("base", "uri", "description", "mime_type", "annotations", "size", "_meta")
    BASE_FIELD_NUMBER: _ClassVar[int]
    URI_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    SIZE_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    base: _common_pb2.BaseMetadata
    uri: str
    description: str
    mime_type: str
    annotations: _struct_pb2.Struct
    size: int
    _meta: _struct_pb2.Struct
    def __init__(self, base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ..., uri: _Optional[str] = ..., description: _Optional[str] = ..., mime_type: _Optional[str] = ..., annotations: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., size: _Optional[int] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class ResourceContentsUnion(_message.Message):
    __slots__ = ("text", "blob")
    TEXT_FIELD_NUMBER: _ClassVar[int]
    BLOB_FIELD_NUMBER: _ClassVar[int]
    text: TextResourceContents
    blob: BlobResourceContents
    def __init__(self, text: _Optional[_Union[TextResourceContents, _Mapping]] = ..., blob: _Optional[_Union[BlobResourceContents, _Mapping]] = ...) -> None: ...

class ResourceTemplate(_message.Message):
    __slots__ = ("base", "uri_template", "description", "mime_type", "annotations", "_meta")
    BASE_FIELD_NUMBER: _ClassVar[int]
    URI_TEMPLATE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    base: _common_pb2.BaseMetadata
    uri_template: str
    description: str
    mime_type: str
    annotations: _struct_pb2.Struct
    _meta: _struct_pb2.Struct
    def __init__(self, base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ..., uri_template: _Optional[str] = ..., description: _Optional[str] = ..., mime_type: _Optional[str] = ..., annotations: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class TextResourceContents(_message.Message):
    __slots__ = ("uri", "mime_type", "_meta", "text")
    URI_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    uri: str
    mime_type: str
    _meta: _struct_pb2.Struct
    text: str
    def __init__(self, uri: _Optional[str] = ..., mime_type: _Optional[str] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., text: _Optional[str] = ...) -> None: ...
