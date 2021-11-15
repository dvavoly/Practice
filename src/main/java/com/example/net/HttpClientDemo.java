package com.example.net;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {
    private static final URI TEST_URI = URI.create("https://www.twitter.com");

    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(TEST_URI).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response code is: " + response.statusCode());
        System.out.println("Request method is: " + request.method());
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> {
            System.out.println("Key:   " + k + "\nValue: " + v);
        });
        // Display the body
        System.out.println(response.body());
    }
}
