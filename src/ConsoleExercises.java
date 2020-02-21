import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println( "the value of pi is " + pi);
//
        Scanner scanner = new Scanner(System.in);
//
        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print ("Enter A number: ");
        int userInt = scanner.nextInt();
        System.out.println( "The number you entered is " + userInt + "!");

            System.out.println("Please enter words ");
            String userintput1 = scanner.nextLine();
//        String userintput2 = scanner.next();
//        String userintput3 = scanner.next();
//        System.out.println(" You put-> " + userintput2 + " " + userintput3 + " " + userintput1);

        System.out.println("Here is that thing again- " + userintput1);

        System.out.println(" what is the length of this room? ");
        int length = scanner.nextInt();
        System.out.println("What is the width of the room? ");
        int width = scanner.nextInt();

        System.out.println( "The length is " + length + " and the width is " + width + " so the piramiter is " + (length * 2 + width * 2));



        int a = 11; int b = 12; int c = 40;
        switch (a) {
            case 40:
                System.out.println(b);
                break;
            default:
                System.out.println(c);
        }


    }
}
