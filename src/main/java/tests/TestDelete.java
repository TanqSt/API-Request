package tests;

import api.ResponseReader;
import api.DeleteRequest;
import org.apache.http.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestDelete {
    @Test
    public static void deleteEmployee() throws IOException {
        HttpResponse httpResponse = DeleteRequest.deleteEmployee();
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode, 200, "Status code is not 200");
        String responseBody = ResponseReader.convertStreamToString(httpResponse.getEntity().getContent());
        Assert.assertTrue(responseBody.contains("Successfully! Record has been deleted"));
        System.out.println("Response body: " + responseBody);
    }
}
