package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    public String getMovie() {
        return "Movie Title: " + this.name + "\n" + " Movie Category: " + this.category + "\n";
    }

    public String getCategory() {
        return this.category;
    }

    public void setMovie(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.name = category;
    }

    public static void main(String[] args) {

    }


}
