package com.example.io;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUrlDemo {
    private static final String DUMMY_URL = "https://postman-echo.com/get";

    public static void main(String[] args) {
        try {

            URL addressUrl = new URL("http://www.google.com");
            HttpURLConnection connection = (HttpURLConnection) addressUrl.openConnection();

            // Display request method
            System.out.println("Request method is: " + connection.getRequestMethod());

            // Display response code
            System.out.println("Response code is: " + connection.getResponseCode());

            // Display response message
            System.out.println("Response message is: " + connection.getResponseMessage());

            // Get a list of the header fields and a set of the header keys
            // Map<String, List<String>> headerFields = connection.getHeaderFields();
            // headerFields.forEach((k, v) -> {
            // System.out.println("Key: " + k + "\nValue: " + v);
            // });

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DUMMY_URL)).build();

            // Synchronous response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            // Asynchronous response
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)
                    .thenAccept(System.out::println).join();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
