public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Batman";
        myMovie.yearOfRelease = 1990;
        myMovie.duration = 165;

        myMovie.listMovie();
        myMovie.rateMovie(9.9);
        myMovie.rateMovie(8);
        myMovie.rateMovie(10);
        myMovie.listMovie();
    }
}
