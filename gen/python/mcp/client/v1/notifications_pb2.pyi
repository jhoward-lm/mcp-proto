from mcp.client.v1 import common_pb2 as _common_pb2
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class CancelledNotification(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("request_id", "reason")
        REQUEST_ID_FIELD_NUMBER: _ClassVar[int]
        REASON_FIELD_NUMBER: _ClassVar[int]
        request_id: _common_pb2.RequestId
        reason: str
        def __init__(self, request_id: _Optional[_Union[_common_pb2.RequestId, _Mapping]] = ..., reason: _Optional[str] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: CancelledNotification.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[CancelledNotification.Params, _Mapping]] = ...) -> None: ...

class InitializedNotification(_message.Message):
    __slots__ = ("method",)
    METHOD_FIELD_NUMBER: _ClassVar[int]
    method: str
    def __init__(self, method: _Optional[str] = ...) -> None: ...

class ProgressNotification(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("progress_token", "progress", "total", "message")
        PROGRESS_TOKEN_FIELD_NUMBER: _ClassVar[int]
        PROGRESS_FIELD_NUMBER: _ClassVar[int]
        TOTAL_FIELD_NUMBER: _ClassVar[int]
        MESSAGE_FIELD_NUMBER: _ClassVar[int]
        progress_token: _common_pb2.ProgressToken
        progress: float
        total: float
        message: str
        def __init__(self, progress_token: _Optional[_Union[_common_pb2.ProgressToken, _Mapping]] = ..., progress: _Optional[float] = ..., total: _Optional[float] = ..., message: _Optional[str] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ProgressNotification.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ProgressNotification.Params, _Mapping]] = ...) -> None: ...

class RootsListChangedNotification(_message.Message):
    __slots__ = ("method",)
    METHOD_FIELD_NUMBER: _ClassVar[int]
    method: str
    def __init__(self, method: _Optional[str] = ...) -> None: ...
