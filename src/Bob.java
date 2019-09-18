import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        //ALLOWS USER TO TYPE SOMETHING TO BOB

        Scanner userInput = new Scanner(System.in);

        System.out.println("Say something to Bob and hit ENTER");

        String bobSaying = userInput.nextLine();

        //CHECKS TO SEE WHAT BOB WILL SAY BACK

        String message;

        if(bobSaying.endsWith("?")) {
            message = "Sure";
        } else if(bobSaying.endsWith("!")) {
            message = "Whoa chill out";
        } else if(bobSaying.equals("")) {
            message = "Fine, be that way";
        } else {
            message = "whatever";
        }

        System.out.println(message);




    } //main()
} //Bob Class
