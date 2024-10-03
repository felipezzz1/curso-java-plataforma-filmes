package br.com.fezor.screenmatch.main;

import br.com.fezor.screenmatch.exception.InvalidYearException;
import br.com.fezor.screenmatch.models.Title;
import br.com.fezor.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        // not a best practice, just for example
        String API_KEY = "dd8a022c";
        Scanner read = new Scanner(System.in);
        System.out.println("Type the movie you want to search: ");
        var search = read.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=" + API_KEY;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TitleOmdb myTitle = gson.fromJson(json, TitleOmdb.class);
            System.out.println(myTitle);


            Title myTitle1 = new Title(myTitle);
            System.out.println(myTitle1);
        }catch (NumberFormatException e){
            System.out.println("An error occurred: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("An error ocurred in the search, please check the address: ");
            System.out.println(e.getMessage());
        }catch (InvalidYearException e){
            System.out.println(e.getMessage());
        }

        System.out.println("The program run correctly");

    }
}
