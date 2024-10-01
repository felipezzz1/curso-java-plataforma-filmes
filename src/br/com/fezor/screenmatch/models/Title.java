package br.com.fezor.screenmatch.models;

public class Title {
    private String name;
    private int yearOfRelease;
    boolean isIncludedInPlan;
    private double totalRating;
    private int numberOfRatings;
    private int duration;

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
}
