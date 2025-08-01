# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: mcp/client/v1/common.proto
# Protobuf Python Version: 5.29.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    29,
    3,
    '',
    'mcp/client/v1/common.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import descriptor_pb2 as google_dot_protobuf_dot_descriptor__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1amcp/client/v1/common.proto\x12\rmcp.client.v1\x1a google/protobuf/descriptor.proto\x1a\x1cgoogle/protobuf/struct.proto\"8\n\x0c\x42\x61seMetadata\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x14\n\x05title\x18\x02 \x01(\tR\x05title\"\x1e\n\x06\x43ursor\x12\x14\n\x05value\x18\x01 \x01(\tR\x05value\"h\n\x0c\x45rrorDetails\x12\x12\n\x04\x63ode\x18\x01 \x01(\x05R\x04\x63ode\x12\x18\n\x07message\x18\x02 \x01(\tR\x07message\x12*\n\x04\x64\x61ta\x18\x03 \x01(\x0b\x32\x16.google.protobuf.ValueR\x04\x64\x61ta\"[\n\x0eImplementation\x12/\n\x04\x62\x61se\x18\x01 \x01(\x0b\x32\x1b.mcp.client.v1.BaseMetadataR\x04\x62\x61se\x12\x18\n\x07version\x18\x02 \x01(\tR\x07version\"G\n\x16PaginatedRequestParams\x12-\n\x06\x63ursor\x18\x01 \x01(\x0b\x32\x15.mcp.client.v1.CursorR\x06\x63ursor\"I\n\x0fPaginatedResult\x12\x36\n\x0bnext_cursor\x18\x01 \x01(\x0b\x32\x15.mcp.client.v1.CursorR\nnextCursor\"L\n\rProgressToken\x12\x18\n\x06number\x18\x01 \x01(\x03H\x00R\x06number\x12\x18\n\x06string\x18\x02 \x01(\tH\x00R\x06stringB\x07\n\x05token\"L\n\tRequestId\x12\x1d\n\tstring_id\x18\x01 \x01(\tH\x00R\x08stringId\x12\x17\n\x06int_id\x18\x02 \x01(\x03H\x00R\x05intIdB\x07\n\x05value\"c\n\x06Result\x12,\n\x05_meta\x18\x01 \x01(\x0b\x32\x17.google.protobuf.StructR\x04Meta\x12+\n\x04\x64\x61ta\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructR\x04\x64\x61ta*\xe7\x02\n\x0cLoggingLevel\x12\x1d\n\x19LOGGING_LEVEL_UNSPECIFIED\x10\x00\x12#\n\x13LOGGING_LEVEL_ALERT\x10\x01\x1a\n\x82\xc6\xce/\x05\x61lert\x12)\n\x16LOGGING_LEVEL_CRITICAL\x10\x02\x1a\r\x82\xc6\xce/\x08\x63ritical\x12#\n\x13LOGGING_LEVEL_DEBUG\x10\x03\x1a\n\x82\xc6\xce/\x05\x64\x65\x62ug\x12%\n\x14LOGGING_LEVEL_NOTICE\x10\x04\x1a\x0b\x82\xc6\xce/\x06notice\x12!\n\x12LOGGING_LEVEL_INFO\x10\x05\x1a\t\x82\xc6\xce/\x04info\x12\'\n\x15LOGGING_LEVEL_WARNING\x10\x06\x1a\x0c\x82\xc6\xce/\x07warning\x12#\n\x13LOGGING_LEVEL_ERROR\x10\x07\x1a\n\x82\xc6\xce/\x05\x65rror\x12+\n\x17LOGGING_LEVEL_EMERGENCY\x10\x08\x1a\x0e\x82\xc6\xce/\temergency*Z\n\x04Role\x12\x14\n\x10ROLE_UNSPECIFIED\x10\x00\x12\x18\n\tROLE_USER\x10\x01\x1a\t\x82\xc6\xce/\x04user\x12\"\n\x0eROLE_ASSISTANT\x10\x02\x1a\x0e\x82\xc6\xce/\tassistant:E\n\x0bstring_name\x12!.google.protobuf.EnumValueOptions\x18\xe0\xe8\xf9\x05 \x01(\tR\nstringNameB\x8b\x01\n\x14org.mcp.client.modelB\x0b\x43ommonProtoH\x01P\x01Z\x0epkg/mcp/client\xa2\x02\x03MCX\xaa\x02\rMcp.Client.V1\xca\x02\rMcp\\Client\\V1\xe2\x02\x19Mcp\\Client\\V1\\GPBMetadata\xea\x02\x0fMcp::Client::V1b\x08\x65\x64itionsp\xe8\x07')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'mcp.client.v1.common_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024org.mcp.client.modelB\013CommonProtoH\001P\001Z\016pkg/mcp/client\242\002\003MCX\252\002\rMcp.Client.V1\312\002\rMcp\\Client\\V1\342\002\031Mcp\\Client\\V1\\GPBMetadata\352\002\017Mcp::Client::V1'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_ALERT"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_ALERT"]._serialized_options = b'\202\306\316/\005alert'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_CRITICAL"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_CRITICAL"]._serialized_options = b'\202\306\316/\010critical'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_DEBUG"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_DEBUG"]._serialized_options = b'\202\306\316/\005debug'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_NOTICE"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_NOTICE"]._serialized_options = b'\202\306\316/\006notice'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_INFO"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_INFO"]._serialized_options = b'\202\306\316/\004info'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_WARNING"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_WARNING"]._serialized_options = b'\202\306\316/\007warning'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_ERROR"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_ERROR"]._serialized_options = b'\202\306\316/\005error'
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_EMERGENCY"]._loaded_options = None
  _globals['_LOGGINGLEVEL'].values_by_name["LOGGING_LEVEL_EMERGENCY"]._serialized_options = b'\202\306\316/\temergency'
  _globals['_ROLE'].values_by_name["ROLE_USER"]._loaded_options = None
  _globals['_ROLE'].values_by_name["ROLE_USER"]._serialized_options = b'\202\306\316/\004user'
  _globals['_ROLE'].values_by_name["ROLE_ASSISTANT"]._loaded_options = None
  _globals['_ROLE'].values_by_name["ROLE_ASSISTANT"]._serialized_options = b'\202\306\316/\tassistant'
  _globals['_LOGGINGLEVEL']._serialized_start=804
  _globals['_LOGGINGLEVEL']._serialized_end=1163
  _globals['_ROLE']._serialized_start=1165
  _globals['_ROLE']._serialized_end=1255
  _globals['_BASEMETADATA']._serialized_start=109
  _globals['_BASEMETADATA']._serialized_end=165
  _globals['_CURSOR']._serialized_start=167
  _globals['_CURSOR']._serialized_end=197
  _globals['_ERRORDETAILS']._serialized_start=199
  _globals['_ERRORDETAILS']._serialized_end=303
  _globals['_IMPLEMENTATION']._serialized_start=305
  _globals['_IMPLEMENTATION']._serialized_end=396
  _globals['_PAGINATEDREQUESTPARAMS']._serialized_start=398
  _globals['_PAGINATEDREQUESTPARAMS']._serialized_end=469
  _globals['_PAGINATEDRESULT']._serialized_start=471
  _globals['_PAGINATEDRESULT']._serialized_end=544
  _globals['_PROGRESSTOKEN']._serialized_start=546
  _globals['_PROGRESSTOKEN']._serialized_end=622
  _globals['_REQUESTID']._serialized_start=624
  _globals['_REQUESTID']._serialized_end=700
  _globals['_RESULT']._serialized_start=702
  _globals['_RESULT']._serialized_end=801
# @@protoc_insertion_point(module_scope)
