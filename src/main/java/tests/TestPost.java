package tests;

import api.PostRequests;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestPost {

    private static String name;
    private static int salary;

    private static int age;
    //@BeforeTest
    //public static void credentials() {
        //name = "Ivan";
       // salary = 123456;
        //age=50;
    //}

    @Test
    public static void testSuccessfulPost() throws IOException {
        PostRequests postRequests = new PostRequests();
        postRequests.newEmployee("Ivan", 235000, 50);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);
        //String authMessage = postRequests.getLoginMessage();
        //Assert.assertTrue(authMessage.contains("success"), authMessage);
    }
    }
    //@Test
   // public static void testWrongPassword() throws IOException {
        //PostRequests postRequests = new PostRequests();
       // postRequests.login(email, "123450");
        //String responseCode = postRequests.getResponseCode();
        //Assert.assertTrue(responseCode.contains("200"), responseCode);
        //String authMessage = postRequests.getLoginMessage();
       // Assert.assertTrue(authMessage.contains("invalid"), authMessage);
    //}

    //@Test
    //public static void testWrongUsername() throws IOException {
        //PostRequests postRequests = new PostRequests();
        //postRequests.login("test@test.com", password);
        //String responseCode = postRequests.getResponseCode();
        //Assert.assertTrue(responseCode.contains("200"), responseCode);
       // String authMessage = postRequests.getLoginMessage();
        //Assert.assertTrue(authMessage.contains("invalid"), authMessage);
    //}

//}
