import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {"bland", "grey", "sassy", "red bearded", "saucy", "salty", "sweet", "wild", "nice", "caring"};

    static String[] strings = {"chair", "desk", "computer", "laptop", "candy", "book", "pen", "bottle", "cup", "hoodie"};


    public static void main(String[] args) {

        System.out.println(randomName(adjectives, strings));

    }

    static public String randomName(String[] array1, String[] array2) {


        String randomAdjective = array1[(int) (Math.random() * array1.length - 1)];

        String randomNoun = array2[(int) (Math.random() * array1.length - 1)];

        return randomAdjective + " " + randomNoun;

    }
}
