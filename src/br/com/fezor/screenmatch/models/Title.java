package br.com.fezor.screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int yearOfRelease;
    boolean isIncludedInPlan;
    private double totalRating;
    private int numberOfRatings;
    private int duration;

    public Title(String name, int yearOfRelease, int duration) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.duration = duration;
    }

    public Title(TitleOmdb myTitle) {
        this.name = myTitle.title();
        this.yearOfRelease = Integer.valueOf(myTitle.year());
        this.duration = Integer.valueOf(myTitle.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean isIncludedInPlan() {
        return isIncludedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        isIncludedInPlan = includedInPlan;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void list(){
        System.out.println("Name: " + name);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Duration: " + duration);
    }

    public void rateMovie(double review){
        totalRating += review;
        numberOfRatings++;
    }

    public double averageRating(){
        double media = totalRating/numberOfRatings;
        if(numberOfRatings == 0){
            return 0;
        }else{
            return totalRating/numberOfRatings;
        }
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", duration=" + duration +
                '}';
    }
}
