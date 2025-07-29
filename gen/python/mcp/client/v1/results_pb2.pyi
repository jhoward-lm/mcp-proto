from google.protobuf import struct_pb2 as _struct_pb2
from mcp.client.v1 import common_pb2 as _common_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class CreateMessageResult(_message.Message):
    __slots__ = ("_meta", "role", "content", "model", "stop_reason")
    _META_FIELD_NUMBER: _ClassVar[int]
    ROLE_FIELD_NUMBER: _ClassVar[int]
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    MODEL_FIELD_NUMBER: _ClassVar[int]
    STOP_REASON_FIELD_NUMBER: _ClassVar[int]
    _meta: _struct_pb2.Struct
    role: _common_pb2.Role
    content: _struct_pb2.Struct
    model: str
    stop_reason: str
    def __init__(self, _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., role: _Optional[_Union[_common_pb2.Role, str]] = ..., content: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., model: _Optional[str] = ..., stop_reason: _Optional[str] = ...) -> None: ...

class ElicitResult(_message.Message):
    __slots__ = ("_meta", "action", "content")
    class ElicitAction(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
        __slots__ = ()
        ELICIT_ACTION_UNSPECIFIED: _ClassVar[ElicitResult.ElicitAction]
        ELICIT_ACTION_ACCEPT: _ClassVar[ElicitResult.ElicitAction]
        ELICIT_ACTION_DECLINE: _ClassVar[ElicitResult.ElicitAction]
        ELICIT_ACTION_CANCEL: _ClassVar[ElicitResult.ElicitAction]
    ELICIT_ACTION_UNSPECIFIED: ElicitResult.ElicitAction
    ELICIT_ACTION_ACCEPT: ElicitResult.ElicitAction
    ELICIT_ACTION_DECLINE: ElicitResult.ElicitAction
    ELICIT_ACTION_CANCEL: ElicitResult.ElicitAction
    _META_FIELD_NUMBER: _ClassVar[int]
    ACTION_FIELD_NUMBER: _ClassVar[int]
    CONTENT_FIELD_NUMBER: _ClassVar[int]
    _meta: _struct_pb2.Struct
    action: ElicitResult.ElicitAction
    content: _struct_pb2.Struct
    def __init__(self, _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., action: _Optional[_Union[ElicitResult.ElicitAction, str]] = ..., content: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class EmptyResult(_message.Message):
    __slots__ = ()
    def __init__(self) -> None: ...

class ListRootsResult(_message.Message):
    __slots__ = ("roots",)
    class Root(_message.Message):
        __slots__ = ("uri", "name", "_meta")
        URI_FIELD_NUMBER: _ClassVar[int]
        NAME_FIELD_NUMBER: _ClassVar[int]
        _META_FIELD_NUMBER: _ClassVar[int]
        uri: str
        name: str
        _meta: _struct_pb2.Struct
        def __init__(self, uri: _Optional[str] = ..., name: _Optional[str] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    ROOTS_FIELD_NUMBER: _ClassVar[int]
    roots: _containers.RepeatedCompositeFieldContainer[ListRootsResult.Root]
    def __init__(self, roots: _Optional[_Iterable[_Union[ListRootsResult.Root, _Mapping]]] = ...) -> None: ...
