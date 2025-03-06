/*
 * Copyright (c) 2025 <project contributors>
 * This program is made available under the terms of the MIT License.
 */
package org.example;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import java.lang.Exception;
import java.lang.RuntimeException;
import org.rere.core.serde.PrimitiveSerde;
import org.rere.external.aws.serializers.GetItemResponseSerde;
import org.rere.external.aws.serializers.ListTablesResponseSerde;
import org.rere.external.aws.serializers.PutItemResponseSerde;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;
import software.amazon.awssdk.services.dynamodb.model.ListTablesRequest;
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.PutItemResponse;

public class ReReDynamoDbMockCreator {
    private static final PrimitiveSerde defaultSerde = new PrimitiveSerde();

    public static GetItemResponse environmentNode1() throws Exception {
        // GetItemResponse(Item={title=AttributeValue(S=King Kong), year=AttributeValue(N=1933), info=AttributeValue(S=Not a lot of info)})
        return (GetItemResponse) new GetItemResponseSerde().deserialize("rO0ABXNyAEFvcmcucmVyZS5leHRlcm5hbC5hd3Muc2VyaWFsaXplcnMuR2V0SXRlbVJlc3BvbnNlU2VyZGUkRGF0YUhvbGRlcvaLNzJvjV6+AgACTAAQY29uc3VtZWRDYXBhY2l0eXQAQUxzb2Z0d2FyZS9hbWF6b24vYXdzc2RrL3NlcnZpY2VzL2R5bmFtb2RiL21vZGVsL0NvbnN1bWVkQ2FwYWNpdHk7TAAEaXRlbXQAD0xqYXZhL3V0aWwvTWFwO3hwcHNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAx3CAAAABAAAAADdAAEeWVhcnNyADZvcmcucmVyZS5leHRlcm5hbC5hd3MuZGF0YUhvbGRlcnMuQXR0cmlidXRlVmFsdWVIb2xkZXJ1RnaPaxSQuQIAC0wAAWJ0ACZMc29mdHdhcmUvYW1hem9uL2F3c3Nkay9jb3JlL1Nka0J5dGVzO0wABGJvb2x0ABNMamF2YS9sYW5nL0Jvb2xlYW47TAACYnN0ABBMamF2YS91dGlsL0xpc3Q7TAABbHEAfgAKTAABbXEAfgACTAABbnQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAAm5zcQB+AApMAANudWxxAH4ACUwAAXNxAH4AC0wAAnNzcQB+AApMAAR0eXBldABETHNvZnR3YXJlL2FtYXpvbi9hd3NzZGsvc2VydmljZXMvZHluYW1vZGIvbW9kZWwvQXR0cmlidXRlVmFsdWUkVHlwZTt4cHBwcHBwdAAEMTkzM3BwcHB+cgBCc29mdHdhcmUuYW1hem9uLmF3c3Nkay5zZXJ2aWNlcy5keW5hbW9kYi5tb2RlbC5BdHRyaWJ1dGVWYWx1ZSRUeXBlAAAAAAAAAAASAAB4cgAOamF2YS5sYW5nLkVudW0AAAAAAAAAABIAAHhwdAABTnQABXRpdGxlc3EAfgAHcHBwcHBwcHB0AAlLaW5nIEtvbmdwfnEAfgAPdAABU3QABGluZm9zcQB+AAdwcHBwcHBwcHQAEU5vdCBhIGxvdCBvZiBpbmZvcHEAfgAWeA==");
    }

    public static ListTablesResponse environmentNode2() throws Exception {
        // ListTablesResponse(TableNames=[Movies, SomeTable])
        return (ListTablesResponse) new ListTablesResponseSerde().deserialize("rO0ABXNyAERvcmcucmVyZS5leHRlcm5hbC5hd3Muc2VyaWFsaXplcnMuTGlzdFRhYmxlc1Jlc3BvbnNlU2VyZGUkRGF0YUhvbGRlcmvnLroHPfL0AgACTAAWbGFzdEV2YWx1YXRlZFRhYmxlTmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wACnRhYmxlTmFtZXN0ABBMamF2YS91dGlsL0xpc3Q7eHBwc3IAE2phdmEudXRpbC5BcnJheUxpc3R4gdIdmcdhnQMAAUkABHNpemV4cAAAAAJ3BAAAAAJ0AAZNb3ZpZXN0AAlTb21lVGFibGV4");
    }

    public static PutItemResponse environmentNode3() throws Exception {
        // PutItemResponse()
        return (PutItemResponse) new PutItemResponseSerde().deserialize("rO0ABXNyAEFvcmcucmVyZS5leHRlcm5hbC5hd3Muc2VyaWFsaXplcnMuUHV0SXRlbVJlc3BvbnNlU2VyZGUkRGF0YUhvbGRlcmnGBPdjutcxAgADTAAKYXR0cmlidXRlc3QAD0xqYXZhL3V0aWwvTWFwO0wAEGNvbnN1bWVkQ2FwYWNpdHl0AEFMc29mdHdhcmUvYW1hem9uL2F3c3Nkay9zZXJ2aWNlcy9keW5hbW9kYi9tb2RlbC9Db25zdW1lZENhcGFjaXR5O0wAFWl0ZW1Db2xsZWN0aW9uTWV0cmljc3QARkxzb2Z0d2FyZS9hbWF6b24vYXdzc2RrL3NlcnZpY2VzL2R5bmFtb2RiL21vZGVsL0l0ZW1Db2xsZWN0aW9uTWV0cmljczt4cHNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9hZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAB3CAAAABAAAAAAeHBw");
    }

    public static DynamoDbClient environmentNode0() throws Exception {
        DynamoDbClient mockObject = mock(DynamoDbClient.class);
        GetItemResponse local0 = environmentNode1();
        doReturn(local0).when(mockObject).getItem(any(GetItemRequest.class));
        ListTablesResponse local1 = environmentNode2();
        doReturn(local1).when(mockObject).listTables(any(ListTablesRequest.class));
        PutItemResponse local2 = environmentNode3();
        doReturn(local2).when(mockObject).putItem(any(PutItemRequest.class));
        doNothing().when(mockObject).close();
        return mockObject;
    }

    public static DynamoDbClient create() {
        try {
            return environmentNode0();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}