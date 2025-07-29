from google.protobuf import struct_pb2 as _struct_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ClientCapabilities(_message.Message):
    __slots__ = ("experimental", "elicitation", "roots", "sampling")
    class ExperimentalEntry(_message.Message):
        __slots__ = ("key", "value")
        KEY_FIELD_NUMBER: _ClassVar[int]
        VALUE_FIELD_NUMBER: _ClassVar[int]
        key: str
        value: _struct_pb2.Struct
        def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    class Roots(_message.Message):
        __slots__ = ("list_changed",)
        LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
        list_changed: bool
        def __init__(self, list_changed: bool = ...) -> None: ...
    EXPERIMENTAL_FIELD_NUMBER: _ClassVar[int]
    ELICITATION_FIELD_NUMBER: _ClassVar[int]
    ROOTS_FIELD_NUMBER: _ClassVar[int]
    SAMPLING_FIELD_NUMBER: _ClassVar[int]
    experimental: _containers.MessageMap[str, _struct_pb2.Struct]
    elicitation: _struct_pb2.Struct
    roots: ClientCapabilities.Roots
    sampling: _struct_pb2.Struct
    def __init__(self, experimental: _Optional[_Mapping[str, _struct_pb2.Struct]] = ..., elicitation: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., roots: _Optional[_Union[ClientCapabilities.Roots, _Mapping]] = ..., sampling: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
