package api;
import java.io.IOException;
import java.io.InputStream;
import helpers.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import tests.TestPost;
public class DeleteRequest {
    private static String updateUrl = "https://dummy.restapiexample.com/api/v1/delete/";

    public static HttpResponse deleteEmployee() throws IOException {
        HttpDelete httpDelete = new HttpDelete(updateUrl + TestPost.getId());
        httpDelete.setHeader("Content-type", "application/json");
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpResponse httpResponse = httpClient.execute(httpDelete);

        return httpResponse;
    }
}
