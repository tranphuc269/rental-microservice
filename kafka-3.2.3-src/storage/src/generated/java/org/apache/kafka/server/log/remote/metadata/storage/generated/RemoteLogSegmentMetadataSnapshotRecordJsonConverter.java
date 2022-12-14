/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// THIS CODE IS AUTOMATICALLY GENERATED.  DO NOT EDIT.

package  org.apache.kafka.server.log.remote.metadata.storage.generated;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ShortNode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.util.ArrayList;
import org.apache.kafka.common.Uuid;
import org.apache.kafka.common.protocol.MessageUtil;

import static  org.apache.kafka.server.log.remote.metadata.storage.generated.RemoteLogSegmentMetadataSnapshotRecord.*;

public class RemoteLogSegmentMetadataSnapshotRecordJsonConverter {
    public static RemoteLogSegmentMetadataSnapshotRecord read(JsonNode _node, short _version) {
        RemoteLogSegmentMetadataSnapshotRecord _object = new RemoteLogSegmentMetadataSnapshotRecord();
        JsonNode _segmentIdNode = _node.get("segmentId");
        if (_segmentIdNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'segmentId', which is mandatory in version " + _version);
        } else {
            if (!_segmentIdNode.isTextual()) {
                throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord expected a JSON string type, but got " + _node.getNodeType());
            }
            _object.segmentId = Uuid.fromString(_segmentIdNode.asText());
        }
        JsonNode _startOffsetNode = _node.get("startOffset");
        if (_startOffsetNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'startOffset', which is mandatory in version " + _version);
        } else {
            _object.startOffset = MessageUtil.jsonNodeToLong(_startOffsetNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        JsonNode _endOffsetNode = _node.get("endOffset");
        if (_endOffsetNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'endOffset', which is mandatory in version " + _version);
        } else {
            _object.endOffset = MessageUtil.jsonNodeToLong(_endOffsetNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        JsonNode _brokerIdNode = _node.get("brokerId");
        if (_brokerIdNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'brokerId', which is mandatory in version " + _version);
        } else {
            _object.brokerId = MessageUtil.jsonNodeToInt(_brokerIdNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        JsonNode _maxTimestampMsNode = _node.get("maxTimestampMs");
        if (_maxTimestampMsNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'maxTimestampMs', which is mandatory in version " + _version);
        } else {
            _object.maxTimestampMs = MessageUtil.jsonNodeToLong(_maxTimestampMsNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        JsonNode _eventTimestampMsNode = _node.get("eventTimestampMs");
        if (_eventTimestampMsNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'eventTimestampMs', which is mandatory in version " + _version);
        } else {
            _object.eventTimestampMs = MessageUtil.jsonNodeToLong(_eventTimestampMsNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        JsonNode _segmentLeaderEpochsNode = _node.get("segmentLeaderEpochs");
        if (_segmentLeaderEpochsNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'segmentLeaderEpochs', which is mandatory in version " + _version);
        } else {
            if (!_segmentLeaderEpochsNode.isArray()) {
                throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord expected a JSON array, but got " + _node.getNodeType());
            }
            ArrayList<SegmentLeaderEpochEntry> _collection = new ArrayList<SegmentLeaderEpochEntry>(_segmentLeaderEpochsNode.size());
            _object.segmentLeaderEpochs = _collection;
            for (JsonNode _element : _segmentLeaderEpochsNode) {
                _collection.add(SegmentLeaderEpochEntryJsonConverter.read(_element, _version));
            }
        }
        JsonNode _segmentSizeInBytesNode = _node.get("segmentSizeInBytes");
        if (_segmentSizeInBytesNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'segmentSizeInBytes', which is mandatory in version " + _version);
        } else {
            _object.segmentSizeInBytes = MessageUtil.jsonNodeToInt(_segmentSizeInBytesNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        JsonNode _remoteLogSegmentStateNode = _node.get("remoteLogSegmentState");
        if (_remoteLogSegmentStateNode == null) {
            throw new RuntimeException("RemoteLogSegmentMetadataSnapshotRecord: unable to locate field 'remoteLogSegmentState', which is mandatory in version " + _version);
        } else {
            _object.remoteLogSegmentState = MessageUtil.jsonNodeToByte(_remoteLogSegmentStateNode, "RemoteLogSegmentMetadataSnapshotRecord");
        }
        return _object;
    }
    public static JsonNode write(RemoteLogSegmentMetadataSnapshotRecord _object, short _version, boolean _serializeRecords) {
        ObjectNode _node = new ObjectNode(JsonNodeFactory.instance);
        _node.set("segmentId", new TextNode(_object.segmentId.toString()));
        _node.set("startOffset", new LongNode(_object.startOffset));
        _node.set("endOffset", new LongNode(_object.endOffset));
        _node.set("brokerId", new IntNode(_object.brokerId));
        _node.set("maxTimestampMs", new LongNode(_object.maxTimestampMs));
        _node.set("eventTimestampMs", new LongNode(_object.eventTimestampMs));
        ArrayNode _segmentLeaderEpochsArray = new ArrayNode(JsonNodeFactory.instance);
        for (SegmentLeaderEpochEntry _element : _object.segmentLeaderEpochs) {
            _segmentLeaderEpochsArray.add(SegmentLeaderEpochEntryJsonConverter.write(_element, _version, _serializeRecords));
        }
        _node.set("segmentLeaderEpochs", _segmentLeaderEpochsArray);
        _node.set("segmentSizeInBytes", new IntNode(_object.segmentSizeInBytes));
        _node.set("remoteLogSegmentState", new ShortNode(_object.remoteLogSegmentState));
        return _node;
    }
    public static JsonNode write(RemoteLogSegmentMetadataSnapshotRecord _object, short _version) {
        return write(_object, _version, true);
    }
    
    public static class SegmentLeaderEpochEntryJsonConverter {
        public static SegmentLeaderEpochEntry read(JsonNode _node, short _version) {
            SegmentLeaderEpochEntry _object = new SegmentLeaderEpochEntry();
            JsonNode _leaderEpochNode = _node.get("leaderEpoch");
            if (_leaderEpochNode == null) {
                throw new RuntimeException("SegmentLeaderEpochEntry: unable to locate field 'leaderEpoch', which is mandatory in version " + _version);
            } else {
                _object.leaderEpoch = MessageUtil.jsonNodeToInt(_leaderEpochNode, "SegmentLeaderEpochEntry");
            }
            JsonNode _offsetNode = _node.get("offset");
            if (_offsetNode == null) {
                throw new RuntimeException("SegmentLeaderEpochEntry: unable to locate field 'offset', which is mandatory in version " + _version);
            } else {
                _object.offset = MessageUtil.jsonNodeToLong(_offsetNode, "SegmentLeaderEpochEntry");
            }
            return _object;
        }
        public static JsonNode write(SegmentLeaderEpochEntry _object, short _version, boolean _serializeRecords) {
            ObjectNode _node = new ObjectNode(JsonNodeFactory.instance);
            _node.set("leaderEpoch", new IntNode(_object.leaderEpoch));
            _node.set("offset", new LongNode(_object.offset));
            return _node;
        }
        public static JsonNode write(SegmentLeaderEpochEntry _object, short _version) {
            return write(_object, _version, true);
        }
    }
}
