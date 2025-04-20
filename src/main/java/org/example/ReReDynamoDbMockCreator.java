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
import org.rere.external.aws.serializers.DynamoDbResponseSerde;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;
import software.amazon.awssdk.services.dynamodb.model.ListTablesRequest;
import software.amazon.awssdk.services.dynamodb.model.ListTablesResponse;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.PutItemResponse;

public class ReReDynamoDbMockCreator {
    private static final PrimitiveSerde defaultSerde = new PrimitiveSerde();

    public static ListTablesResponse environmentNode1() throws Exception {
        // ListTablesResponse(TableNames=[Movies])
        return (ListTablesResponse) new DynamoDbResponseSerde().deserialize("rO0ABXNyAEJvcmcucmVyZS5leHRlcm5hbC5hd3Muc2VyaWFsaXplcnMuRHluYW1vRGJSZXNwb25zZVNlcmRlJERhdGFIb2xkZXJrQE1ZuVJ0ygIAAkwACWNsYXNzTmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAAW10AA9MamF2YS91dGlsL01hcDt4cHQAQXNvZnR3YXJlLmFtYXpvbi5hd3NzZGsuc2VydmljZXMuZHluYW1vZGIubW9kZWwuTGlzdFRhYmxlc1Jlc3BvbnNlc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAF0AAp0YWJsZU5hbWVzc3IAJmphdmEudXRpbC5Db2xsZWN0aW9ucyRVbm1vZGlmaWFibGVMaXN0/A8lMbXsjhACAAFMAARsaXN0dAAQTGphdmEvdXRpbC9MaXN0O3hyACxqYXZhLnV0aWwuQ29sbGVjdGlvbnMkVW5tb2RpZmlhYmxlQ29sbGVjdGlvbhlCAIDLXvceAgABTAABY3QAFkxqYXZhL3V0aWwvQ29sbGVjdGlvbjt4cHNyABNqYXZhLnV0aWwuQXJyYXlMaXN0eIHSHZnHYZ0DAAFJAARzaXpleHAAAAABdwQAAAABdAAGTW92aWVzeHEAfgAOeA==");
    }

    public static PutItemResponse environmentNode2() throws Exception {
        // PutItemResponse()
        return (PutItemResponse) new DynamoDbResponseSerde().deserialize("rO0ABXNyAEJvcmcucmVyZS5leHRlcm5hbC5hd3Muc2VyaWFsaXplcnMuRHluYW1vRGJSZXNwb25zZVNlcmRlJERhdGFIb2xkZXJrQE1ZuVJ0ygIAAkwACWNsYXNzTmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAAW10AA9MamF2YS91dGlsL01hcDt4cHQAPnNvZnR3YXJlLmFtYXpvbi5hd3NzZGsuc2VydmljZXMuZHluYW1vZGIubW9kZWwuUHV0SXRlbVJlc3BvbnNlc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAF0AAphdHRyaWJ1dGVzc3IAO3NvZnR3YXJlLmFtYXpvbi5hd3NzZGsuY29yZS51dGlsLkRlZmF1bHRTZGtBdXRvQ29uc3RydWN0TWFwAAAAAAAAAAECAAFMAARpbXBscQB+AAJ4cHNyAB5qYXZhLnV0aWwuQ29sbGVjdGlvbnMkRW1wdHlNYXBZNhSFWtzn0AIAAHhweA==");
    }

    public static GetItemResponse environmentNode3() throws Exception {
        // GetItemResponse(Item={title=AttributeValue(S=King Kong), year=AttributeValue(N=1933), info=AttributeValue(S=Not a lot of info)})
        return (GetItemResponse) new DynamoDbResponseSerde().deserialize("rO0ABXNyAEJvcmcucmVyZS5leHRlcm5hbC5hd3Muc2VyaWFsaXplcnMuRHluYW1vRGJSZXNwb25zZVNlcmRlJERhdGFIb2xkZXJrQE1ZuVJ0ygIAAkwACWNsYXNzTmFtZXQAEkxqYXZhL2xhbmcvU3RyaW5nO0wAAW10AA9MamF2YS91dGlsL01hcDt4cHQAPnNvZnR3YXJlLmFtYXpvbi5hd3NzZGsuc2VydmljZXMuZHluYW1vZGIubW9kZWwuR2V0SXRlbVJlc3BvbnNlc3IAEWphdmEudXRpbC5IYXNoTWFwBQfawcMWYNEDAAJGAApsb2FkRmFjdG9ySQAJdGhyZXNob2xkeHA/QAAAAAAADHcIAAAAEAAAAAF0AARpdGVtc3IAJWphdmEudXRpbC5Db2xsZWN0aW9ucyRVbm1vZGlmaWFibGVNYXDxpaj+dPUHQgIAAUwAAW1xAH4AAnhwc3IAF2phdmEudXRpbC5MaW5rZWRIYXNoTWFwNMBOXBBswPsCAAFaAAthY2Nlc3NPcmRlcnhxAH4ABT9AAAAAAAADdwgAAAAEAAAAA3QABXRpdGxlc3IAPXNvZnR3YXJlLmFtYXpvbi5hd3NzZGsuc2VydmljZXMuZHluYW1vZGIubW9kZWwuQXR0cmlidXRlVmFsdWUAAAAAAAAAAQIAC0wAAWJ0ACZMc29mdHdhcmUvYW1hem9uL2F3c3Nkay9jb3JlL1Nka0J5dGVzO0wABGJvb2x0ABNMamF2YS9sYW5nL0Jvb2xlYW47TAACYnN0ABBMamF2YS91dGlsL0xpc3Q7TAABbHEAfgAQTAABbXEAfgACTAABbnEAfgABTAACbnNxAH4AEEwAA251bHEAfgAPTAABc3EAfgABTAACc3NxAH4AEEwABHR5cGV0AERMc29mdHdhcmUvYW1hem9uL2F3c3Nkay9zZXJ2aWNlcy9keW5hbW9kYi9tb2RlbC9BdHRyaWJ1dGVWYWx1ZSRUeXBlO3hwcHBzcgA8c29mdHdhcmUuYW1hem9uLmF3c3Nkay5jb3JlLnV0aWwuRGVmYXVsdFNka0F1dG9Db25zdHJ1Y3RMaXN0AAAAAAAAAAECAAFMAARpbXBscQB+ABB4cHNyAB9qYXZhLnV0aWwuQ29sbGVjdGlvbnMkRW1wdHlMaXN0ergXtDynnt4CAAB4cHEAfgAUc3IAO3NvZnR3YXJlLmFtYXpvbi5hd3NzZGsuY29yZS51dGlsLkRlZmF1bHRTZGtBdXRvQ29uc3RydWN0TWFwAAAAAAAAAAECAAFMAARpbXBscQB+AAJ4cHNyAB5qYXZhLnV0aWwuQ29sbGVjdGlvbnMkRW1wdHlNYXBZNhSFWtzn0AIAAHhwcHEAfgAUcHQACUtpbmcgS29uZ3EAfgAUfnIAQnNvZnR3YXJlLmFtYXpvbi5hd3NzZGsuc2VydmljZXMuZHluYW1vZGIubW9kZWwuQXR0cmlidXRlVmFsdWUkVHlwZQAAAAAAAAAAEgAAeHIADmphdmEubGFuZy5FbnVtAAAAAAAAAAASAAB4cHQAAVN0AAR5ZWFyc3EAfgANcHBxAH4AFHEAfgAUcQB+ABh0AAQxOTMzcQB+ABRwcHEAfgAUfnEAfgAcdAABTnQABGluZm9zcQB+AA1wcHEAfgAUcQB+ABRxAH4AGHBxAH4AFHB0ABFOb3QgYSBsb3Qgb2YgaW5mb3EAfgAUcQB+AB54AHg=");
    }

    public static DynamoDbClient environmentNode0() throws Exception {
        DynamoDbClient mockObject = mock(DynamoDbClient.class);
        ListTablesResponse local0 = environmentNode1();
        doReturn(local0).when(mockObject).listTables(any(ListTablesRequest.class));
        PutItemResponse local1 = environmentNode2();
        doReturn(local1).when(mockObject).putItem(any(PutItemRequest.class));
        GetItemResponse local2 = environmentNode3();
        doReturn(local2).when(mockObject).getItem(any(GetItemRequest.class));
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
