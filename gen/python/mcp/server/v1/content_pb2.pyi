from google.protobuf import struct_pb2 as _struct_pb2
from mcp.server.v1 import common_pb2 as _common_pb2
from mcp.server.v1 import results_pb2 as _results_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class Annotations(_message.Message):
    __slots__ = ("audience", "priority", "last_modified")
    AUDIENCE_FIELD_NUMBER: _ClassVar[int]
    PRIORITY_FIELD_NUMBER: _ClassVar[int]
    LAST_MODIFIED_FIELD_NUMBER: _ClassVar[int]
    audience: _containers.RepeatedScalarFieldContainer[_common_pb2.Role]
    priority: float
    last_modified: str
    def __init__(self, audience: _Optional[_Iterable[_Union[_common_pb2.Role, str]]] = ..., priority: _Optional[float] = ..., last_modified: _Optional[str] = ...) -> None: ...

class AudioContent(_message.Message):
    __slots__ = ("type", "data", "mime_type", "annotations", "_meta")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    DATA_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    type: str
    data: str
    mime_type: str
    annotations: Annotations
    _meta: _struct_pb2.Struct
    def __init__(self, type: _Optional[str] = ..., data: _Optional[str] = ..., mime_type: _Optional[str] = ..., annotations: _Optional[_Union[Annotations, _Mapping]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class ContentBlock(_message.Message):
    __slots__ = ("text", "image", "audio", "resource_link", "resource")
    TEXT_FIELD_NUMBER: _ClassVar[int]
    IMAGE_FIELD_NUMBER: _ClassVar[int]
    AUDIO_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_LINK_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_FIELD_NUMBER: _ClassVar[int]
    text: TextContent
    image: ImageContent
    audio: AudioContent
    resource_link: ResourceLink
    resource: EmbeddedResource
    def __init__(self, text: _Optional[_Union[TextContent, _Mapping]] = ..., image: _Optional[_Union[ImageContent, _Mapping]] = ..., audio: _Optional[_Union[AudioContent, _Mapping]] = ..., resource_link: _Optional[_Union[ResourceLink, _Mapping]] = ..., resource: _Optional[_Union[EmbeddedResource, _Mapping]] = ...) -> None: ...

class EmbeddedResource(_message.Message):
    __slots__ = ("type", "resource", "annotations", "_meta")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    type: str
    resource: _results_pb2.ResourceContentsUnion
    annotations: _struct_pb2.Struct
    _meta: _struct_pb2.Struct
    def __init__(self, type: _Optional[str] = ..., resource: _Optional[_Union[_results_pb2.ResourceContentsUnion, _Mapping]] = ..., annotations: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class ImageContent(_message.Message):
    __slots__ = ("type", "data", "mime_type", "annotations", "_meta")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    DATA_FIELD_NUMBER: _ClassVar[int]
    MIME_TYPE_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    type: str
    data: str
    mime_type: str
    annotations: Annotations
    _meta: _struct_pb2.Struct
    def __init__(self, type: _Optional[str] = ..., data: _Optional[str] = ..., mime_type: _Optional[str] = ..., annotations: _Optional[_Union[Annotations, _Mapping]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...

class PromptReference(_message.Message):
    __slots__ = ("type", "base")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    BASE_FIELD_NUMBER: _ClassVar[int]
    type: str
    base: _common_pb2.BaseMetadata
    def __init__(self, type: _Optional[str] = ..., base: _Optional[_Union[_common_pb2.BaseMetadata, _Mapping]] = ...) -> None: ...

class ResourceLink(_message.Message):
    __slots__ = ("type", "resource")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_FIELD_NUMBER: _ClassVar[int]
    type: str
    resource: _results_pb2.Resource
    def __init__(self, type: _Optional[str] = ..., resource: _Optional[_Union[_results_pb2.Resource, _Mapping]] = ...) -> None: ...

class ResourceTemplateReference(_message.Message):
    __slots__ = ("type", "uri")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    URI_FIELD_NUMBER: _ClassVar[int]
    type: str
    uri: str
    def __init__(self, type: _Optional[str] = ..., uri: _Optional[str] = ...) -> None: ...

class TextContent(_message.Message):
    __slots__ = ("type", "text", "annotations", "_meta")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    TEXT_FIELD_NUMBER: _ClassVar[int]
    ANNOTATIONS_FIELD_NUMBER: _ClassVar[int]
    _META_FIELD_NUMBER: _ClassVar[int]
    type: str
    text: str
    annotations: Annotations
    _meta: _struct_pb2.Struct
    def __init__(self, type: _Optional[str] = ..., text: _Optional[str] = ..., annotations: _Optional[_Union[Annotations, _Mapping]] = ..., _meta: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
