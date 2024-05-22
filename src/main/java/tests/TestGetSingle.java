package tests;
import api.GetSingleRequest;
import org.testng.Assert;
import org.testng.annotations.Test;
import api.ResponseReader;
import org.apache.http.HttpResponse;

import org.testng.annotations.Test;
import java.io.IOException;
public class TestGetSingle {
    @Test
    public static void getSingleEmployees() throws IOException {

        HttpResponse httpResponse = GetSingleRequest.getEmployee();
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        Assert.assertEquals(statusCode, 200, "Status code is not 200");
        String responseBody = ResponseReader.convertStreamToString(httpResponse.getEntity().getContent());
        Assert.assertTrue(responseBody.contains("Successfully! Record has been fetched."));
        System.out.println("Response body: " + responseBody);
    }

}


