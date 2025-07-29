from google.protobuf import descriptor_pb2 as _descriptor_pb2
from google.protobuf import struct_pb2 as _struct_pb2
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class LoggingLevel(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    LOGGING_LEVEL_UNSPECIFIED: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_ALERT: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_CRITICAL: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_DEBUG: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_NOTICE: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_INFO: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_WARNING: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_ERROR: _ClassVar[LoggingLevel]
    LOGGING_LEVEL_EMERGENCY: _ClassVar[LoggingLevel]

class Role(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
    __slots__ = ()
    ROLE_UNSPECIFIED: _ClassVar[Role]
    ROLE_USER: _ClassVar[Role]
    ROLE_ASSISTANT: _ClassVar[Role]
LOGGING_LEVEL_UNSPECIFIED: LoggingLevel
LOGGING_LEVEL_ALERT: LoggingLevel
LOGGING_LEVEL_CRITICAL: LoggingLevel
LOGGING_LEVEL_DEBUG: LoggingLevel
LOGGING_LEVEL_NOTICE: LoggingLevel
LOGGING_LEVEL_INFO: LoggingLevel
LOGGING_LEVEL_WARNING: LoggingLevel
LOGGING_LEVEL_ERROR: LoggingLevel
LOGGING_LEVEL_EMERGENCY: LoggingLevel
ROLE_UNSPECIFIED: Role
ROLE_USER: Role
ROLE_ASSISTANT: Role
STRING_NAME_FIELD_NUMBER: _ClassVar[int]
string_name: _descriptor.FieldDescriptor

class BaseMetadata(_message.Message):
    __slots__ = ("name", "title")
    NAME_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    name: str
    title: str
    def __init__(self, name: _Optional[str] = ..., title: _Optional[str] = ...) -> None: ...

class Cursor(_message.Message):
    __slots__ = ("value",)
    VALUE_FIELD_NUMBER: _ClassVar[int]
    value: str
    def __init__(self, value: _Optional[str] = ...) -> None: ...

class ErrorDetails(_message.Message):
    __slots__ = ("code", "message", "data")
    CODE_FIELD_NUMBER: _ClassVar[int]
    MESSAGE_FIELD_NUMBER: _ClassVar[int]
    DATA_FIELD_NUMBER: _ClassVar[int]
    code: int
    message: str
    data: _struct_pb2.Value
    def __init__(self, code: _Optional[int] = ..., message: _Optional[str] = ..., data: _Optional[_Union[_struct_pb2.Value, _Mapping]] = ...) -> None: ...

class Implementation(_message.Message):
    __slots__ = ("base", "version")
    BASE_FIELD_NUMBER: _ClassVar[int]
    VERSION_FIELD_NUMBER: _ClassVar[int]
    base: BaseMetadata
    version: str
    def __init__(self, base: _Optional[_Union[BaseMetadata, _Mapping]] = ..., version: _Optional[str] = ...) -> None: ...

class PaginatedRequestParams(_message.Message):
    __slots__ = ("cursor",)
    CURSOR_FIELD_NUMBER: _ClassVar[int]
    cursor: Cursor
    def __init__(self, cursor: _Optional[_Union[Cursor, _Mapping]] = ...) -> None: ...

class PaginatedResult(_message.Message):
    __slots__ = ("next_cursor",)
    NEXT_CURSOR_FIELD_NUMBER: _ClassVar[int]
    next_cursor: Cursor
    def __init__(self, next_cursor: _Optional[_Union[Cursor, _Mapping]] = ...) -> None: ...

class ProgressToken(_message.Message):
    __slots__ = ("number", "string")
    NUMBER_FIELD_NUMBER: _ClassVar[int]
    STRING_FIELD_NUMBER: _ClassVar[int]
    number: int
    string: str
    def __init__(self, number: _Optional[int] = ..., string: _Optional[str] = ...) -> None: ...

class RequestId(_message.Message):
    __slots__ = ("string_id", "int_id")
    STRING_ID_FIELD_NUMBER: _ClassVar[int]
    INT_ID_FIELD_NUMBER: _ClassVar[int]
    string_id: str
    int_id: int
    def __init__(self, string_id: _Optional[str] = ..., int_id: _Optional[int] = ...) -> None: ...

class Result(_message.Message):
    __slots__ = ("_meta", "data")
    _META_FIELD_NUMBER: _ClassVar[int]
    DATA_FIELD_NUMBER: _ClassVar[int]
    _meta: _struct_pb2.Struct
    data: _struct_pb2.Struct
    def __init__(self, _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., data: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
