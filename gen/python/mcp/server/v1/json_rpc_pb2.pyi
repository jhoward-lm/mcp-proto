from google.protobuf import struct_pb2 as _struct_pb2
from mcp.server.v1 import common_pb2 as _common_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class JSONRPCError(_message.Message):
    __slots__ = ("jsonrpc", "id", "error")
    JSONRPC_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    ERROR_FIELD_NUMBER: _ClassVar[int]
    jsonrpc: str
    id: _common_pb2.RequestId
    error: _common_pb2.ErrorDetails
    def __init__(self, jsonrpc: _Optional[str] = ..., id: _Optional[_Union[_common_pb2.RequestId, _Mapping]] = ..., error: _Optional[_Union[_common_pb2.ErrorDetails, _Mapping]] = ...) -> None: ...

class JSONRPCMessage(_message.Message):
    __slots__ = ("request", "notification", "response", "error")
    REQUEST_FIELD_NUMBER: _ClassVar[int]
    NOTIFICATION_FIELD_NUMBER: _ClassVar[int]
    RESPONSE_FIELD_NUMBER: _ClassVar[int]
    ERROR_FIELD_NUMBER: _ClassVar[int]
    request: JSONRPCRequest
    notification: JSONRPCNotification
    response: JSONRPCResponse
    error: JSONRPCError
    def __init__(self, request: _Optional[_Union[JSONRPCRequest, _Mapping]] = ..., notification: _Optional[_Union[JSONRPCNotification, _Mapping]] = ..., response: _Optional[_Union[JSONRPCResponse, _Mapping]] = ..., error: _Optional[_Union[JSONRPCError, _Mapping]] = ...) -> None: ...

class JSONRPCNotification(_message.Message):
    __slots__ = ("jsonrpc", "method", "params")
    JSONRPC_FIELD_NUMBER: _ClassVar[int]
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    jsonrpc: str
    method: str
    params: _struct_pb2.Struct
    def __init__(self, jsonrpc: _Optional[str] = ..., method: _Optional[str] = ..., params: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class JSONRPCRequest(_message.Message):
    __slots__ = ("jsonrpc", "id", "method", "params")
    JSONRPC_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    jsonrpc: str
    id: _common_pb2.RequestId
    method: str
    params: _struct_pb2.Struct
    def __init__(self, jsonrpc: _Optional[str] = ..., id: _Optional[_Union[_common_pb2.RequestId, _Mapping]] = ..., method: _Optional[str] = ..., params: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class JSONRPCResponse(_message.Message):
    __slots__ = ("jsonrpc", "id", "result")
    JSONRPC_FIELD_NUMBER: _ClassVar[int]
    ID_FIELD_NUMBER: _ClassVar[int]
    RESULT_FIELD_NUMBER: _ClassVar[int]
    jsonrpc: str
    id: _common_pb2.RequestId
    result: _common_pb2.Result
    def __init__(self, jsonrpc: _Optional[str] = ..., id: _Optional[_Union[_common_pb2.RequestId, _Mapping]] = ..., result: _Optional[_Union[_common_pb2.Result, _Mapping]] = ...) -> None: ...
