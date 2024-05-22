package api;

import helpers.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.io.InputStream;

public class GetRequests {

    private static String urlString = "https://dummy.restapiexample.com/api/v1/employees";
    //private static String accessToken;
    private static String responseCode;
    private static String responseBody;

    public static HttpResponse getEmployees() throws IOException {
        HttpGet getUsers = new HttpGet(urlString);
        getUsers.setHeader("Content-type", "application/json");
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpResponse response = httpClient.execute(getUsers);

        return response;
    }
}
