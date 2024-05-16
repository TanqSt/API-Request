package api;

import java.io.IOException;
import java.io.InputStream;
import helpers.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class PostRequests {

    public static final String newEmpoyeeUrl = "https://dummy.restapiexample.com/create";
    private static String responseCode;
    private static String responseBody;
    //private static String accessToken;
    //private static String authMessage;

    public static void main(String[] args) {
        //String name = "Ivan";
        //int salary = 235000;
        //int age = 50;

        //try {
        //newEmployee(name, salary, age);
        //} catch (IOException e) {throw new RuntimeException(e);
        //}
        //printAccessToken();
    }

        public static void newEmployee (String name,int salary, int age) throws IOException {
            // Build the post request
            String postBody = "{\"name\":\"Ivan\",\"salary\":\"235000\",\"age\":\"50}";
            HttpPost postEmployee = new HttpPost(newEmpoyeeUrl);
            postEmployee.setEntity(new StringEntity(postBody));
            postEmployee.setHeader("Content-type", "application/json");
            HttpClient httpClient = HttpClientBuilder.create().build();
            // Execute the post request
            HttpResponse response = httpClient.execute(postEmployee);
            responseCode = response.getStatusLine().toString();
            // Fill in the response body
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // A Simple JSON Response Read
                InputStream instream = entity.getContent();
                responseBody = new ResponseReader().convertStreamToString(instream);
                instream.close();
            }
            // Extract and set the access token
            if (responseCode.contains("200") == true) {
                JsonParser json = new JsonParser();
                String authCode = json.getResponseCode(responseBody);
                //authMessage = json.getAuthMessage(responseBody);
                //if (authCode.equals("0")) {
                //accessToken = json.getAccessToken(responseBody);
            }
        }

    //}

    //public static String getAccessToken() {
        //return accessToken;
    //}

    public static String getResponseCode() {
        return responseCode;
    }

    public static String getResponseBody() {
        return responseCode;
    }

    //public static String getLoginMessage() {
       // return authMessage;
   // }

    //public static void printAccessToken() {
       // System.out.println(accessToken);
    //}

}
