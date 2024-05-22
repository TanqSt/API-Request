package tests;

import api.ResponseReader;
import api.PutRequest;
import org.apache.http.HttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;

public class TestPut {

    @Test

    public static void UpdateEmployee() throws IOException {
        HttpResponse httpResponse = PutRequest.updateEmployee();
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode, 200, "Status code is not 200");
        String responseBody = ResponseReader.convertStreamToString(httpResponse.getEntity().getContent());
        Assert.assertTrue(responseBody.contains("Successfully! Record has been updated."));
        System.out.println("Response body: " + responseBody);


    }
}
