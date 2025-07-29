from google.protobuf import struct_pb2 as _struct_pb2
from mcp.server.v1 import common_pb2 as _common_pb2
from mcp.server.v1 import content_pb2 as _content_pb2
from google.protobuf.internal import containers as _containers
from google.protobuf.internal import enum_type_wrapper as _enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Iterable as _Iterable, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class BooleanSchema(_message.Message):
    __slots__ = ("type", "title", "description", "default")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    DEFAULT_FIELD_NUMBER: _ClassVar[int]
    type: str
    title: str
    description: str
    default: bool
    def __init__(self, type: _Optional[str] = ..., title: _Optional[str] = ..., description: _Optional[str] = ..., default: bool = ...) -> None: ...

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
        ARGUMENT_FIELD_NUMBER: _ClassVar[int]
        CONTEXT_FIELD_NUMBER: _ClassVar[int]
        PROMPT_REF_FIELD_NUMBER: _ClassVar[int]
        RESOURCE_REF_FIELD_NUMBER: _ClassVar[int]
        argument: CompleteRequest.Params.Argument
        context: CompleteRequest.Params.Context
        prompt_ref: _content_pb2.PromptReference
        resource_ref: _content_pb2.ResourceTemplateReference
        def __init__(self, argument: _Optional[_Union[CompleteRequest.Params.Argument, _Mapping]] = ..., context: _Optional[_Union[CompleteRequest.Params.Context, _Mapping]] = ..., prompt_ref: _Optional[_Union[_content_pb2.PromptReference, _Mapping]] = ..., resource_ref: _Optional[_Union[_content_pb2.ResourceTemplateReference, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: CompleteRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[CompleteRequest.Params, _Mapping]] = ...) -> None: ...

class CreateMessageRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("messages", "model_preferences", "system_prompt", "include_context", "temperature", "max_tokens", "stop_sequences", "metadata")
        class IncludeContext(int, metaclass=_enum_type_wrapper.EnumTypeWrapper):
            __slots__ = ()
            INCLUDE_CONTEXT_UNSPECIFIED: _ClassVar[CreateMessageRequest.Params.IncludeContext]
            INCLUDE_CONTEXT_ALL_SERVERS: _ClassVar[CreateMessageRequest.Params.IncludeContext]
            INCLUDE_CONTEXT_NONE: _ClassVar[CreateMessageRequest.Params.IncludeContext]
            INCLUDE_CONTEXT_THIS_SERVER: _ClassVar[CreateMessageRequest.Params.IncludeContext]
        INCLUDE_CONTEXT_UNSPECIFIED: CreateMessageRequest.Params.IncludeContext
        INCLUDE_CONTEXT_ALL_SERVERS: CreateMessageRequest.Params.IncludeContext
        INCLUDE_CONTEXT_NONE: CreateMessageRequest.Params.IncludeContext
        INCLUDE_CONTEXT_THIS_SERVER: CreateMessageRequest.Params.IncludeContext
        class Message(_message.Message):
            __slots__ = ("role", "content")
            ROLE_FIELD_NUMBER: _ClassVar[int]
            CONTENT_FIELD_NUMBER: _ClassVar[int]
            role: _common_pb2.Role
            content: _struct_pb2.Struct
            def __init__(self, role: _Optional[_Union[_common_pb2.Role, str]] = ..., content: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
        class ModelPreferences(_message.Message):
            __slots__ = ("cost_priority", "hints", "intelligence_priority", "speed_priority")
            class ModelHint(_message.Message):
                __slots__ = ("name",)
                NAME_FIELD_NUMBER: _ClassVar[int]
                name: str
                def __init__(self, name: _Optional[str] = ...) -> None: ...
            COST_PRIORITY_FIELD_NUMBER: _ClassVar[int]
            HINTS_FIELD_NUMBER: _ClassVar[int]
            INTELLIGENCE_PRIORITY_FIELD_NUMBER: _ClassVar[int]
            SPEED_PRIORITY_FIELD_NUMBER: _ClassVar[int]
            cost_priority: float
            hints: _containers.RepeatedCompositeFieldContainer[CreateMessageRequest.Params.ModelPreferences.ModelHint]
            intelligence_priority: float
            speed_priority: float
            def __init__(self, cost_priority: _Optional[float] = ..., hints: _Optional[_Iterable[_Union[CreateMessageRequest.Params.ModelPreferences.ModelHint, _Mapping]]] = ..., intelligence_priority: _Optional[float] = ..., speed_priority: _Optional[float] = ...) -> None: ...
        MESSAGES_FIELD_NUMBER: _ClassVar[int]
        MODEL_PREFERENCES_FIELD_NUMBER: _ClassVar[int]
        SYSTEM_PROMPT_FIELD_NUMBER: _ClassVar[int]
        INCLUDE_CONTEXT_FIELD_NUMBER: _ClassVar[int]
        TEMPERATURE_FIELD_NUMBER: _ClassVar[int]
        MAX_TOKENS_FIELD_NUMBER: _ClassVar[int]
        STOP_SEQUENCES_FIELD_NUMBER: _ClassVar[int]
        METADATA_FIELD_NUMBER: _ClassVar[int]
        messages: _containers.RepeatedCompositeFieldContainer[CreateMessageRequest.Params.Message]
        model_preferences: CreateMessageRequest.Params.ModelPreferences
        system_prompt: str
        include_context: CreateMessageRequest.Params.IncludeContext
        temperature: float
        max_tokens: int
        stop_sequences: _containers.RepeatedScalarFieldContainer[str]
        metadata: _struct_pb2.Struct
        def __init__(self, messages: _Optional[_Iterable[_Union[CreateMessageRequest.Params.Message, _Mapping]]] = ..., model_preferences: _Optional[_Union[CreateMessageRequest.Params.ModelPreferences, _Mapping]] = ..., system_prompt: _Optional[str] = ..., include_context: _Optional[_Union[CreateMessageRequest.Params.IncludeContext, str]] = ..., temperature: _Optional[float] = ..., max_tokens: _Optional[int] = ..., stop_sequences: _Optional[_Iterable[str]] = ..., metadata: _Optional[_Union[_struct_pb2.Struct, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: CreateMessageRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[CreateMessageRequest.Params, _Mapping]] = ...) -> None: ...

class ElicitRequest(_message.Message):
    __slots__ = ("method", "params")
    class Params(_message.Message):
        __slots__ = ("message", "requested_schema")
        class RequestedSchema(_message.Message):
            __slots__ = ("type", "properties", "required")
            class PropertiesEntry(_message.Message):
                __slots__ = ("key", "value")
                KEY_FIELD_NUMBER: _ClassVar[int]
                VALUE_FIELD_NUMBER: _ClassVar[int]
                key: str
                value: PrimitiveSchemaDefinition
                def __init__(self, key: _Optional[str] = ..., value: _Optional[_Union[PrimitiveSchemaDefinition, _Mapping]] = ...) -> None: ...
            TYPE_FIELD_NUMBER: _ClassVar[int]
            PROPERTIES_FIELD_NUMBER: _ClassVar[int]
            REQUIRED_FIELD_NUMBER: _ClassVar[int]
            type: str
            properties: _containers.MessageMap[str, PrimitiveSchemaDefinition]
            required: _containers.RepeatedScalarFieldContainer[str]
            def __init__(self, type: _Optional[str] = ..., properties: _Optional[_Mapping[str, PrimitiveSchemaDefinition]] = ..., required: _Optional[_Iterable[str]] = ...) -> None: ...
        MESSAGE_FIELD_NUMBER: _ClassVar[int]
        REQUESTED_SCHEMA_FIELD_NUMBER: _ClassVar[int]
        message: str
        requested_schema: ElicitRequest.Params.RequestedSchema
        def __init__(self, message: _Optional[str] = ..., requested_schema: _Optional[_Union[ElicitRequest.Params.RequestedSchema, _Mapping]] = ...) -> None: ...
    METHOD_FIELD_NUMBER: _ClassVar[int]
    PARAMS_FIELD_NUMBER: _ClassVar[int]
    method: str
    params: ElicitRequest.Params
    def __init__(self, method: _Optional[str] = ..., params: _Optional[_Union[ElicitRequest.Params, _Mapping]] = ...) -> None: ...

class EnumSchema(_message.Message):
    __slots__ = ("type", "title", "description", "enum", "enum_names")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    ENUM_FIELD_NUMBER: _ClassVar[int]
    ENUM_NAMES_FIELD_NUMBER: _ClassVar[int]
    type: str
    title: str
    description: str
    enum: _containers.RepeatedScalarFieldContainer[str]
    enum_names: _containers.RepeatedScalarFieldContainer[str]
    def __init__(self, type: _Optional[str] = ..., title: _Optional[str] = ..., description: _Optional[str] = ..., enum: _Optional[_Iterable[str]] = ..., enum_names: _Optional[_Iterable[str]] = ...) -> None: ...

class ListRootsRequest(_message.Message):
    __slots__ = ("method",)
    METHOD_FIELD_NUMBER: _ClassVar[int]
    method: str
    def __init__(self, method: _Optional[str] = ...) -> None: ...

class NumberSchema(_message.Message):
    __slots__ = ("type", "title", "description", "minimum", "maximum")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    MINIMUM_FIELD_NUMBER: _ClassVar[int]
    MAXIMUM_FIELD_NUMBER: _ClassVar[int]
    type: str
    title: str
    description: str
    minimum: float
    maximum: float
    def __init__(self, type: _Optional[str] = ..., title: _Optional[str] = ..., description: _Optional[str] = ..., minimum: _Optional[float] = ..., maximum: _Optional[float] = ...) -> None: ...

class PingRequest(_message.Message):
    __slots__ = ("method",)
    METHOD_FIELD_NUMBER: _ClassVar[int]
    method: str
    def __init__(self, method: _Optional[str] = ...) -> None: ...

class PrimitiveSchemaDefinition(_message.Message):
    __slots__ = ("boolean_schema", "enum_schema", "number_schema", "string_schema")
    BOOLEAN_SCHEMA_FIELD_NUMBER: _ClassVar[int]
    ENUM_SCHEMA_FIELD_NUMBER: _ClassVar[int]
    NUMBER_SCHEMA_FIELD_NUMBER: _ClassVar[int]
    STRING_SCHEMA_FIELD_NUMBER: _ClassVar[int]
    boolean_schema: BooleanSchema
    enum_schema: EnumSchema
    number_schema: NumberSchema
    string_schema: StringSchema
    def __init__(self, boolean_schema: _Optional[_Union[BooleanSchema, _Mapping]] = ..., enum_schema: _Optional[_Union[EnumSchema, _Mapping]] = ..., number_schema: _Optional[_Union[NumberSchema, _Mapping]] = ..., string_schema: _Optional[_Union[StringSchema, _Mapping]] = ...) -> None: ...

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

class StringSchema(_message.Message):
    __slots__ = ("type", "title", "description", "min_length", "max_length", "format")
    TYPE_FIELD_NUMBER: _ClassVar[int]
    TITLE_FIELD_NUMBER: _ClassVar[int]
    DESCRIPTION_FIELD_NUMBER: _ClassVar[int]
    MIN_LENGTH_FIELD_NUMBER: _ClassVar[int]
    MAX_LENGTH_FIELD_NUMBER: _ClassVar[int]
    FORMAT_FIELD_NUMBER: _ClassVar[int]
    type: str
    title: str
    description: str
    min_length: int
    max_length: int
    format: str
    def __init__(self, type: _Optional[str] = ..., title: _Optional[str] = ..., description: _Optional[str] = ..., min_length: _Optional[int] = ..., max_length: _Optional[int] = ..., format: _Optional[str] = ...) -> None: ...
