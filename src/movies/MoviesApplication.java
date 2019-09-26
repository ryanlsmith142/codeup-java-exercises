package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();

        boolean repeat = true;

        do {
            displayUserOptions();

            String input = userInput.getString();


            switch(input) {
                case "0":
                    repeat = false;
                    System.out.println("Have a nice day!");
                    break;
                case "1":
                    for(Movie movie : MoviesArray.findAll()) {
                        System.out.println(movie.getMovie());
                    }
                    break;
                case "2":
                    for(Movie movie : MoviesArray.findAll()) {
                        if(movie.getCategory().equalsIgnoreCase("animated"))
                        System.out.println(movie.getMovie());
                    }
                    break;
                case "3":
                    for(Movie movie : MoviesArray.findAll()) {
                        if(movie.getCategory().equalsIgnoreCase("drama"))
                            System.out.println(movie.getMovie());
                    }
                    break;
                case "4":
                    for(Movie movie : MoviesArray.findAll()) {
                        if(movie.getCategory().equalsIgnoreCase("horror"))
                            System.out.println(movie.getMovie());
                    }
                    break;
                case "5":
                    for(Movie movie : MoviesArray.findAll()) {
                        if(movie.getCategory().equalsIgnoreCase("scifi"))
                            System.out.println(movie.getMovie());
                    }
                    break;
                default:

            }

        } while (repeat);


    } //Main()

    public static void displayUserOptions() {
        System.out.println(
                "What would you like to do?\n" +
                        "\n" +
                        "0 - exit\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n" +
                        "\n" +
                        "Enter your choice: \n"

        ); //System.out.println()


    } //displayUserOptions()


} //MoviesApplication Class
