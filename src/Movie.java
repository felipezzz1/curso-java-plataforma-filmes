public class Movie {
    String name;
    int yearOfRelease;
    boolean isIncludedInPlan;
    private double totalRating;
    private int numberOfRatings;
    int duration;

    void listMovie(){
        System.out.println("Movie name: " + name);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Is included in Plan: " + isIncludedInPlan);
        System.out.println("Rating: " + this.averageRating());
        System.out.println("Number of Ratings: " + numberOfRatings);
        System.out.println("Duration: " + duration);
    }

    void rateMovie(double review){
        totalRating += review;
        numberOfRatings++;
    }

    double averageRating(){
        double media = totalRating/numberOfRatings;
        if(numberOfRatings == 0){
            return 0;
        }else{
            return totalRating/numberOfRatings;
        }
    }

}
