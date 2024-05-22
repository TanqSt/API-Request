package api;
import helpers.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.IOException;
import java.io.InputStream;
public class GetSingleRequest {
    private static String urlGetSingle = "https://dummy.restapiexample.com/api/v1/employee/1";
    //private static String accessToken;
    private static String responseCode;
    private static String responseBody;

    public static  HttpResponse getEmployee() throws IOException {
        HttpGet getUser        = new HttpGet(urlGetSingle);
        getUser.setHeader("Content-type", "application/json");
        HttpClient httpClient    = HttpClientBuilder.create().build();
        HttpResponse response = httpClient.execute(getUser);

        return response;

    }

}
