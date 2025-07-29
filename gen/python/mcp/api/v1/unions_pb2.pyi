from mcp.client.v1 import notifications_pb2 as _notifications_pb2
from mcp.client.v1 import requests_pb2 as _requests_pb2
from mcp.client.v1 import results_pb2 as _results_pb2
from mcp.server.v1 import common_pb2 as _common_pb2
from mcp.server.v1 import notifications_pb2 as _notifications_pb2_1
from mcp.server.v1 import requests_pb2 as _requests_pb2_1
from mcp.server.v1 import results_pb2 as _results_pb2_1
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from typing import ClassVar as _ClassVar, Mapping as _Mapping, Optional as _Optional, Union as _Union

DESCRIPTOR: _descriptor.FileDescriptor

class ClientNotification(_message.Message):
    __slots__ = ("cancelled", "progress", "initialized", "roots_list_changed")
    CANCELLED_FIELD_NUMBER: _ClassVar[int]
    PROGRESS_FIELD_NUMBER: _ClassVar[int]
    INITIALIZED_FIELD_NUMBER: _ClassVar[int]
    ROOTS_LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
    cancelled: _notifications_pb2.CancelledNotification
    progress: _notifications_pb2.ProgressNotification
    initialized: _notifications_pb2.InitializedNotification
    roots_list_changed: _notifications_pb2.RootsListChangedNotification
    def __init__(self, cancelled: _Optional[_Union[_notifications_pb2.CancelledNotification, _Mapping]] = ..., progress: _Optional[_Union[_notifications_pb2.ProgressNotification, _Mapping]] = ..., initialized: _Optional[_Union[_notifications_pb2.InitializedNotification, _Mapping]] = ..., roots_list_changed: _Optional[_Union[_notifications_pb2.RootsListChangedNotification, _Mapping]] = ...) -> None: ...

class ClientRequest(_message.Message):
    __slots__ = ("call_tool", "complete", "get_prompt", "initialize", "list_prompts", "list_resource_templates", "list_resources", "list_tools", "ping", "read_resource", "set_level", "subscribe", "unsubscribe")
    CALL_TOOL_FIELD_NUMBER: _ClassVar[int]
    COMPLETE_FIELD_NUMBER: _ClassVar[int]
    GET_PROMPT_FIELD_NUMBER: _ClassVar[int]
    INITIALIZE_FIELD_NUMBER: _ClassVar[int]
    LIST_PROMPTS_FIELD_NUMBER: _ClassVar[int]
    LIST_RESOURCE_TEMPLATES_FIELD_NUMBER: _ClassVar[int]
    LIST_RESOURCES_FIELD_NUMBER: _ClassVar[int]
    LIST_TOOLS_FIELD_NUMBER: _ClassVar[int]
    PING_FIELD_NUMBER: _ClassVar[int]
    READ_RESOURCE_FIELD_NUMBER: _ClassVar[int]
    SET_LEVEL_FIELD_NUMBER: _ClassVar[int]
    SUBSCRIBE_FIELD_NUMBER: _ClassVar[int]
    UNSUBSCRIBE_FIELD_NUMBER: _ClassVar[int]
    call_tool: _requests_pb2.CallToolRequest
    complete: _requests_pb2.CompleteRequest
    get_prompt: _requests_pb2.GetPromptRequest
    initialize: _requests_pb2.InitializeRequest
    list_prompts: _requests_pb2.ListPromptsRequest
    list_resource_templates: _requests_pb2.ListResourceTemplatesRequest
    list_resources: _requests_pb2.ListResourcesRequest
    list_tools: _requests_pb2.ListToolsRequest
    ping: _requests_pb2.PingRequest
    read_resource: _requests_pb2.ReadResourceRequest
    set_level: _requests_pb2.SetLevelRequest
    subscribe: _requests_pb2.SubscribeRequest
    unsubscribe: _requests_pb2.UnsubscribeRequest
    def __init__(self, call_tool: _Optional[_Union[_requests_pb2.CallToolRequest, _Mapping]] = ..., complete: _Optional[_Union[_requests_pb2.CompleteRequest, _Mapping]] = ..., get_prompt: _Optional[_Union[_requests_pb2.GetPromptRequest, _Mapping]] = ..., initialize: _Optional[_Union[_requests_pb2.InitializeRequest, _Mapping]] = ..., list_prompts: _Optional[_Union[_requests_pb2.ListPromptsRequest, _Mapping]] = ..., list_resource_templates: _Optional[_Union[_requests_pb2.ListResourceTemplatesRequest, _Mapping]] = ..., list_resources: _Optional[_Union[_requests_pb2.ListResourcesRequest, _Mapping]] = ..., list_tools: _Optional[_Union[_requests_pb2.ListToolsRequest, _Mapping]] = ..., ping: _Optional[_Union[_requests_pb2.PingRequest, _Mapping]] = ..., read_resource: _Optional[_Union[_requests_pb2.ReadResourceRequest, _Mapping]] = ..., set_level: _Optional[_Union[_requests_pb2.SetLevelRequest, _Mapping]] = ..., subscribe: _Optional[_Union[_requests_pb2.SubscribeRequest, _Mapping]] = ..., unsubscribe: _Optional[_Union[_requests_pb2.UnsubscribeRequest, _Mapping]] = ...) -> None: ...

class ClientResult(_message.Message):
    __slots__ = ("empty", "create_message", "elicit", "list_roots")
    EMPTY_FIELD_NUMBER: _ClassVar[int]
    CREATE_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    ELICIT_FIELD_NUMBER: _ClassVar[int]
    LIST_ROOTS_FIELD_NUMBER: _ClassVar[int]
    empty: _results_pb2.EmptyResult
    create_message: _results_pb2.CreateMessageResult
    elicit: _results_pb2.ElicitResult
    list_roots: _results_pb2.ListRootsResult
    def __init__(self, empty: _Optional[_Union[_results_pb2.EmptyResult, _Mapping]] = ..., create_message: _Optional[_Union[_results_pb2.CreateMessageResult, _Mapping]] = ..., elicit: _Optional[_Union[_results_pb2.ElicitResult, _Mapping]] = ..., list_roots: _Optional[_Union[_results_pb2.ListRootsResult, _Mapping]] = ...) -> None: ...

class ServerNotification(_message.Message):
    __slots__ = ("cancelled", "progress", "logging_message", "prompt_list_changed", "resource_list_changed", "resource_updated", "tool_list_changed")
    CANCELLED_FIELD_NUMBER: _ClassVar[int]
    PROGRESS_FIELD_NUMBER: _ClassVar[int]
    LOGGING_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    PROMPT_LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
    RESOURCE_UPDATED_FIELD_NUMBER: _ClassVar[int]
    TOOL_LIST_CHANGED_FIELD_NUMBER: _ClassVar[int]
    cancelled: _notifications_pb2_1.CancelledNotification
    progress: _notifications_pb2_1.ProgressNotification
    logging_message: _notifications_pb2_1.LoggingMessageNotification
    prompt_list_changed: _notifications_pb2_1.PromptListChangedNotification
    resource_list_changed: _notifications_pb2_1.ResourceListChangedNotification
    resource_updated: _notifications_pb2_1.ResourceUpdatedNotification
    tool_list_changed: _notifications_pb2_1.ToolListChangedNotification
    def __init__(self, cancelled: _Optional[_Union[_notifications_pb2_1.CancelledNotification, _Mapping]] = ..., progress: _Optional[_Union[_notifications_pb2_1.ProgressNotification, _Mapping]] = ..., logging_message: _Optional[_Union[_notifications_pb2_1.LoggingMessageNotification, _Mapping]] = ..., prompt_list_changed: _Optional[_Union[_notifications_pb2_1.PromptListChangedNotification, _Mapping]] = ..., resource_list_changed: _Optional[_Union[_notifications_pb2_1.ResourceListChangedNotification, _Mapping]] = ..., resource_updated: _Optional[_Union[_notifications_pb2_1.ResourceUpdatedNotification, _Mapping]] = ..., tool_list_changed: _Optional[_Union[_notifications_pb2_1.ToolListChangedNotification, _Mapping]] = ...) -> None: ...

class ServerRequest(_message.Message):
    __slots__ = ("create_message", "elicit", "list_roots", "ping")
    CREATE_MESSAGE_FIELD_NUMBER: _ClassVar[int]
    ELICIT_FIELD_NUMBER: _ClassVar[int]
    LIST_ROOTS_FIELD_NUMBER: _ClassVar[int]
    PING_FIELD_NUMBER: _ClassVar[int]
    create_message: _requests_pb2_1.CreateMessageRequest
    elicit: _requests_pb2_1.ElicitRequest
    list_roots: _requests_pb2_1.ListRootsRequest
    ping: _requests_pb2_1.PingRequest
    def __init__(self, create_message: _Optional[_Union[_requests_pb2_1.CreateMessageRequest, _Mapping]] = ..., elicit: _Optional[_Union[_requests_pb2_1.ElicitRequest, _Mapping]] = ..., list_roots: _Optional[_Union[_requests_pb2_1.ListRootsRequest, _Mapping]] = ..., ping: _Optional[_Union[_requests_pb2_1.PingRequest, _Mapping]] = ...) -> None: ...

class ServerResult(_message.Message):
    __slots__ = ("empty", "call_tool", "complete", "get_prompt", "initialize", "list_prompts", "list_resource_templates", "list_resources", "list_tools", "read_resource")
    EMPTY_FIELD_NUMBER: _ClassVar[int]
    CALL_TOOL_FIELD_NUMBER: _ClassVar[int]
    COMPLETE_FIELD_NUMBER: _ClassVar[int]
    GET_PROMPT_FIELD_NUMBER: _ClassVar[int]
    INITIALIZE_FIELD_NUMBER: _ClassVar[int]
    LIST_PROMPTS_FIELD_NUMBER: _ClassVar[int]
    LIST_RESOURCE_TEMPLATES_FIELD_NUMBER: _ClassVar[int]
    LIST_RESOURCES_FIELD_NUMBER: _ClassVar[int]
    LIST_TOOLS_FIELD_NUMBER: _ClassVar[int]
    READ_RESOURCE_FIELD_NUMBER: _ClassVar[int]
    empty: _common_pb2.EmptyResult
    call_tool: _results_pb2_1.CallToolResult
    complete: _results_pb2_1.CompleteResult
    get_prompt: _results_pb2_1.GetPromptResult
    initialize: _results_pb2_1.InitializeResult
    list_prompts: _results_pb2_1.ListPromptsResult
    list_resource_templates: _results_pb2_1.ListResourceTemplatesResult
    list_resources: _results_pb2_1.ListResourcesResult
    list_tools: _results_pb2_1.ListToolsResult
    read_resource: _results_pb2_1.ReadResourceResult
    def __init__(self, empty: _Optional[_Union[_common_pb2.EmptyResult, _Mapping]] = ..., call_tool: _Optional[_Union[_results_pb2_1.CallToolResult, _Mapping]] = ..., complete: _Optional[_Union[_results_pb2_1.CompleteResult, _Mapping]] = ..., get_prompt: _Optional[_Union[_results_pb2_1.GetPromptResult, _Mapping]] = ..., initialize: _Optional[_Union[_results_pb2_1.InitializeResult, _Mapping]] = ..., list_prompts: _Optional[_Union[_results_pb2_1.ListPromptsResult, _Mapping]] = ..., list_resource_templates: _Optional[_Union[_results_pb2_1.ListResourceTemplatesResult, _Mapping]] = ..., list_resources: _Optional[_Union[_results_pb2_1.ListResourcesResult, _Mapping]] = ..., list_tools: _Optional[_Union[_results_pb2_1.ListToolsResult, _Mapping]] = ..., read_resource: _Optional[_Union[_results_pb2_1.ReadResourceResult, _Mapping]] = ...) -> None: ...
