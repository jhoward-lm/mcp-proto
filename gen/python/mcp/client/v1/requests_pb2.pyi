from google.protobuf import struct_pb2 as _struct_pb2
from mcp.client.v1 import capabilities_pb2 as _capabilities_pb2
from mcp.client.v1 import common_pb2 as _common_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class CallToolRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("name", "arguments")
        NAME_FIELD_NUMBER: _ClassVar[int]
        ARGUMENTS_FIELD_NUMBER: _ClassVar[int]
        name: str
        arguments: _struct_pb2.Struct
        def __init__(self, name: _Optional[str] = ..., arguments: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: CallToolRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[CallToolRequest.Params, _Mapping]] = ...) -> None: ...

class CompleteRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("argument", "context", "prompt_ref", "resource_ref")
        class Argument(_message.Message):
            __slots__ = ("name", "value")
            NAME_FIELD_NUMBER: _ClassVar[int]
            VALUE_FIELD_NUMBER: _ClassVar[int]
            name: str
            value: str
            def __init__(self, name: _Optional[str] = ..., value: _Optional[str] = ...) -> None: ...
        class Context(_message.Message):
            __slots__ = ("arguments",)
            class ArgumentsEntry(_message.Message):
                __slots__ = ("key", "value")
                KEY_FIELD_NUMBER: _ClassVar[int]
                VALUE_FIELD_NUMBER: _ClassVar[int]
                key: str
                value: str
                def __init__(self, key: _Optional[str] = ..., value: _Optional[str] = ...) -> None: ...
            ARGUMENTS_FIELD_NUMBER: _ClassVar[int]
            arguments: _containers.ScalarMap[str, str]
            def __init__(self, arguments: _Optional[_Mapping[str, str]] = ...) -> None: ...
        class PromptReference(_message.Message):
            __slots__ = ("type", "base")
            TYPE_FIELD_NUMBER: _ClassVar[int]
            BASE_FIELD_NUMBER: _ClassVar[int]
            type: str
            base: _common_pb2.BaseMetadata
            def __init__(self, type: _Optional[str] = ..., base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ...) -> None: ...
        class ResourceTemplateReference(_message.Message):
            __slots__ = ("type", "uri")
            TYPE_FIELD_NUMBER: _ClassVar[int]
            URI_FIELD_NUMBER: _ClassVar[int]
            type: str
            uri: str
            def __init__(self, type: _Optional[str] = ..., uri: _Optional[str] = ...) -> None: ...
        ARGUMENT_FIELD_NUMBER: _ClassVar[int]
        CONTEXT_FIELD_NUMBER: _ClassVar[int]
        PROMPT_REF_FIELD_NUMBER: _ClassVar[int]
        RESOURCE_REF_FIELD_NUMBER: _ClassVar[int]
        argument: CompleteRequest.Params.Argument
        context: CompleteRequest.Params.Context
        prompt_ref: CompleteRequest.Params.PromptReference
        resource_ref: CompleteRequest.Params.ResourceTemplateReference
        def __init__(self, argument: _Optional[_Union[CompleteRequest.Params.Argument, _Mapping]] = ..., context: _Optional[_Union[CompleteRequest.Params.Context, _Mapping]] = ..., prompt_ref: _Optional[_Union[CompleteRequest.Params.PromptReference, _Mapping]] = ..., resource_ref: _Optional[_Union[CompleteRequest.Params.ResourceTemplateReference, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: CompleteRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[CompleteRequest.Params, _Mapping]] = ...) -> None: ...

class GetPromptRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("name", "arguments")
        class ArgumentsEntry(_message.Message):
            __slots__ = ("key", "value")
            KEY_FIELD_NUMBER: _ClassVar[int]
            VALUE_FIELD_NUMBER: _ClassVar[int]
            key: str
            value: str
            def __init__(self, key: _Optional[str] = ..., value: _Optional[str] = ...) -> None: ...
        NAME_FIELD_NUMBER: _ClassVar[int]
        ARGUMENTS_FIELD_NUMBER: _ClassVar[int]
        name: str
        arguments: _containers.ScalarMap[str, str]
        def __init__(self, name: _Optional[str] = ..., arguments: _Optional[_Mapping[str, str]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: GetPromptRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[GetPromptRequest.Params, _Mapping]] = ...) -> None: ...

class InitializeRequest(_message.Message):
    __slots__ = ("method", "protocol_version", "capabilities", "client_info")
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PROTOCOL_VERSION_FIELD_NUMBER: _ClassVar[int]
    CAPABILITIES_FIELD_NUMBER: _ClassVar[int]
    CLIENT_INFO_FIELD_NUMBER: _ClassVar[int]
    method: str
    protocol_version: str
    capabilities: _capabilities_pb2.ClientCapabilities
    client_info: _common_pb2.Implementation
    def __init__(self, method: _Optional[str] = ..., protocol_version: _Optional[str] = ..., capabilities: _Optional[_Union[_capabilities_pb2.ClientCapabilities, _Mapping]] = ..., client_info: _Optional[_Union[_common_pb2.Implementation, _Mapping]] = ...) -> None: ...

class ListPromptsRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("cursor",)
        CURSOR_FIELD_NUMBER: _ClassVar[int]
        cursor: _common_pb2.PaginatedRequestParams
        def __init__(self, cursor: _Optional[_Union[_common_pb2.PaginatedRequestParams, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ListPromptsRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ListPromptsRequest.Params, _Mapping]] = ...) -> None: ...

class ListResourcesRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("cursor",)
        CURSOR_FIELD_NUMBER: _ClassVar[int]
        cursor: _common_pb2.PaginatedRequestParams
        def __init__(self, cursor: _Optional[_Union[_common_pb2.PaginatedRequestParams, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ListResourcesRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ListResourcesRequest.Params, _Mapping]] = ...) -> None: ...

class ListResourceTemplatesRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("cursor",)
        CURSOR_FIELD_NUMBER: _ClassVar[int]
        cursor: _common_pb2.PaginatedRequestParams
        def __init__(self, cursor: _Optional[_Union[_common_pb2.PaginatedRequestParams, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ListResourceTemplatesRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ListResourceTemplatesRequest.Params, _Mapping]] = ...) -> None: ...

class ListToolsRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("cursor",)
        CURSOR_FIELD_NUMBER: _ClassVar[int]
        cursor: _common_pb2.PaginatedRequestParams
        def __init__(self, cursor: _Optional[_Union[_common_pb2.PaginatedRequestParams, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ListToolsRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ListToolsRequest.Params, _Mapping]] = ...) -> None: ...

class PingRequest(_message.Message):
    __slots__ = ("method",)
    METHOD_FIELD_NUMBER: _ClassVar[int]
    method: str
    def __init__(self, method: _Optional[str] = ...) -> None: ...

class ReadResourceRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("uri",)
        URI_FIELD_NUMBER: _ClassVar[int]
        uri: str
        def __init__(self, uri: _Optional[str] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ReadResourceRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ReadResourceRequest.Params, _Mapping]] = ...) -> None: ...

class SetLevelRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("level",)
        LEVEL_FIELD_NUMBER: _ClassVar[int]
        level: _common_pb2.LoggingLevel
        def __init__(self, level: _Optional[_Union[_common_pb2.LoggingLevel, str]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: SetLevelRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[SetLevelRequest.Params, _Mapping]] = ...) -> None: ...

class SubscribeRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("uri",)
        URI_FIELD_NUMBER: _ClassVar[int]
        uri: str
        def __init__(self, uri: _Optional[str] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: SubscribeRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[SubscribeRequest.Params, _Mapping]] = ...) -> None: ...

class UnsubscribeRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("uri",)
        URI_FIELD_NUMBER: _ClassVar[int]
        uri: str
        def __init__(self, uri: _Optional[str] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: UnsubscribeRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[UnsubscribeRequest.Params, _Mapping]] = ...) -> None: ...
