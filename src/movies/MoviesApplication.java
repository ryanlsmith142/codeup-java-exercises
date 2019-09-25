package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();


            MoviesArray movies = new MoviesArray();



//        System.out.println(movies.findAll()[0].getMovie());


        displayUserOptions();

//        String input = userInput.getString();

        for(int i = 0; i <= movies.findAll().length - 1; i++) {
            System.out.println(movies.getMovie());
        }




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
