package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpMain {
    public static void main(String[] args) {


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://jsonplaceholder.typicode.com/comments/3"))
                .build();

        HttpResponse<String>  response=null;

        try {
            response =client.send(request,HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(response.statusCode());

        if(response.statusCode() /100 == 2) {
           // System.out.println(response.body());

        }

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        var commentFromJsonPlaceHolde =
                gson.fromJson(response.body(),CommentDTO.class);


        System.out.println(commentFromJsonPlaceHolde);
        var jsoooon = gson.toJson(commentFromJsonPlaceHolde);
        System.out.println(jsoooon);

        //client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        //        .thenApply(HttpResponse::body)
        //        .thenAccept(System.out::println)
        //        .join();



    }
}
