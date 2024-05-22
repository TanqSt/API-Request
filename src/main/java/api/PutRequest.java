package api;
import java.io.IOException;
import java.io.InputStream;
import helpers.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import tests.TestPost;


public class PutRequest {
    private static String putUrl = "https://dummy.restapiexample.com/api/v1/update/";

    public static HttpResponse updateEmployee() throws IOException {
        HttpPut putUser = new HttpPut(putUrl + TestPost.getId());
        putUser.setHeader("Content-type", "text/html; charset=UTF-8");
        HttpClient httpClient = HttpClientBuilder.create().build();
        String postBody = "{\"name\":\"Grigor\",\"salary\":\"123000\",\"age\":\"55\"}";
        StringEntity entity = new StringEntity(postBody);
        putUser.setEntity(entity);
        HttpResponse response = httpClient.execute(putUser);
        return response;


    }
}
