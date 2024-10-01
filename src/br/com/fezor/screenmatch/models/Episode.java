package br.com.fezor.screenmatch.models;

import br.com.fezor.screenmatch.calculations.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Series serie;
    private int visualizations;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getVisualizations() {
        return visualizations;
    }

    public void setVisualizations(int visualizations) {
        this.visualizations = visualizations;
    }

    @Override
    public int getClassification() {
        if(visualizations > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
