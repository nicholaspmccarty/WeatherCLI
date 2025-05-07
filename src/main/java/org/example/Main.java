package org.example;

import java.util.Scanner;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

///  Nicholas McCarty
/// Simple CLI interface
/// Gradle + gson + open-mateo api

public class Main {

    // Class variables for api and request handling
    private static final String API_URL = "https://api.open-meteo.com/v1/forecast?latitude=%s&longitude=%s&current_weather=true";
    private static final OkHttpClient client = new OkHttpClient();
    private static final Gson gson = new Gson();


    public static void main(String[] args) {

        // Simple scanner for data input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter longitude");

        String longitude = scanner.nextLine();

        System.out.println("Enter latitude");
        String latitude = scanner.nextLine();


        }
    }
