package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;


public class Main {
    public static void main(String[] args) {

        String couponString="{\"id\":1.0,\"title\":\"buy1get1\",\"genre\":\"coffee and food\",\"available\":48}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        var c1=gson.fromJson(couponString,CouponDTO.class);

        System.out.println(couponString);
        var s=new Color(123456);
        var json1= gson.toJson(c1);
        var json2= gson.toJson(new Movie("a","a","a","a"));
        //var json3= gson.toJson(s);

        System.out.println(json1);
        System.out.println(json2);
        //System.out.println(json3);
    }
}
