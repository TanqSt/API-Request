package tests;

import api.PostRequests;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import api.ResponseReader;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestPost {

    private static String name;
    private static int salary;
    private static int age;
    private static String id;

    @Test
    public static void testSuccessfulPost() throws IOException {
        PostRequests postRequests = new PostRequests();
        postRequests.newEmployee("Ivan", 235000, 50);
        String responseCode = postRequests.getResponseCode();
        Assert.assertTrue(responseCode.contains("200"), responseCode);

    }
    public static String getId() {
        return id;
    }
    }


