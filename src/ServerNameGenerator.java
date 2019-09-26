public class ServerNameGenerator {
    public static String[] adjectives = {"bland", "grey", "sassy", "red bearded", "saucy", "salty", "sweet", "wild", "nice", "caring"};

    public static String[] strings = {"chair", "desk", "computer", "laptop", "candy", "book", "pen", "bottle", "cup", "hoodie"};


    public static void main(String[] args) {

        System.out.println(randomName(adjectives, strings));

    }

    public static String randomName(String[] array1, String[] array2) {


        String randomAdjective = array1[(int) (Math.random() * array1.length - 1)];

        String randomNoun = array2[(int) (Math.random() * array1.length - 1)];

        return randomAdjective + "-" + randomNoun;

    }
}
