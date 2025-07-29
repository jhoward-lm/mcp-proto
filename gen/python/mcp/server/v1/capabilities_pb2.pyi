from google.protobuf import struct_pb2 as _struct_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ServerCapabilities(_message.Message):
    __slots__ = ("completions", "experimental", "logging", "prompts", "resources", "tools")
    class ExperimentalEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: _struct_pb2.Struct
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    class Prompts(_message.Message):
        __slots__ = ("list_changed",)
        LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
        list_changed: bool
        def __init__(self, list_changed: bool = ...) -> None: ...
    class Resources(_message.Message):
        __slots__ = ("list_changed", "subscribe")
        LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
        SUBSCRIBE_FIELD_NUMBER: _ClassVar[int]
        list_changed: bool
        subscribe: bool
        def __init__(self, list_changed: bool = ..., subscribe: bool = ...) -> None: ...
    class Tools(_message.Message):
        __slots__ = ("list_changed",)
        LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
        list_changed: bool
        def __init__(self, list_changed: bool = ...) -> None: ...
    COMPLETIONS_FIELD_NUMBER: _ClassVar[int]
    EXPERIMENTAL_FIELD_NUMBER: _ClassVar[int]
    LOGGING_FIELD_NUMBER: _ClassVar[int]
    PROMPTS_FIELD_NUMBER: _ClassVar[int]
    RESOURCES_FIELD_NUMBER: _ClassVar[int]
    TOOLS_FIELD_NUMBER: _ClassVar[int]
    completions: _struct_pb2.Struct
    experimental: _containers.MessageMap[str, _struct_pb2.Struct]
    logging: _struct_pb2.Struct
    prompts: ServerCapabilities.Prompts
    resources: ServerCapabilities.Resources
    tools: ServerCapabilities.Tools
    def __init__(self, completions: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., experimental: _Optional[_Mapping[str, _struct_pb2.Struct]] = ..., logging: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., prompts: _Optional[_Union[ServerCapabilities.Prompts, _Mapping]] = ..., resources: _Optional[_Union[ServerCapabilities.Resources, _Mapping]] = ..., tools: _Optional[_Union[ServerCapabilities.Tools, _Mapping]] = ...) -> None: ...
