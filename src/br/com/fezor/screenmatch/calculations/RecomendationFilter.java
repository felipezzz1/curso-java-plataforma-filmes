package br.com.fezor.screenmatch.calculations;

public class RecomendationFilter {
    private String recomendation;

    public void filter(Classification classification){
        if(classification.getClassification() >= 4){
            System.out.println("The movie is on trending");
        }else if(classification.getClassification() >= 2){
            System.out.println("The movie is good rated");
        }else{
            System.out.println("Put on your playlist to watch later");
        }
    }
}
