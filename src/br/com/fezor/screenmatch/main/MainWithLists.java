package br.com.fezor.screenmatch.main;

import br.com.fezor.screenmatch.models.Movie;
import br.com.fezor.screenmatch.models.Series;
import br.com.fezor.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Batman", 1990, 165);
        Series lost = new Series("Lost", 2000, 500);
        Movie randomMovie = new Movie("Spider-Man", 2002, 200);

        myMovie.rateMovie(9);
        lost.rateMovie(2);
        randomMovie.rateMovie(4);

        ArrayList<Title> movieList = new ArrayList<>();
        movieList.add(myMovie);
        movieList.add(randomMovie);
        movieList.add(lost);
        System.out.println("List Size: " + movieList.size());
        for (Title item : movieList) {
            System.out.println(item.getName());
            if(item instanceof Movie movie){
                System.out.println("Total Movie Rating: " + movie.getClassification());
            }
            System.out.println(item.averageRating());
        }

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Van Damme");
        searchByArtist.add("Adam Sandler");
        searchByArtist.add("The rock");
        System.out.println(searchByArtist);

        Collections.sort(searchByArtist);
        System.out.println(searchByArtist);

        Collections.sort(movieList);
        for (Title i: movieList) {
            System.out.println(i.getName());
        }

    }
}
