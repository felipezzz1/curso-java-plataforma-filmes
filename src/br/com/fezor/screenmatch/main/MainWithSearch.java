package br.com.fezor.screenmatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        String API_KEY = "dd8a022c";
        Scanner read = new Scanner(System.in);
        System.out.println("Type the movie you want to search: ");
        var search = read.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search + "&apikey=" + API_KEY;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
