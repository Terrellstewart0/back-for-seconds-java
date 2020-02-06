import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//
//        int myFavoriteNumber = 777;
//        System.out.println(myFavoriteNumber);
//        String myString = "How it do bro!";
//        System.out.println(myString);
//        float myNumber = (float) 3.14;
//        System.out.println(myNumber);
//
////        int x = 5;
////        System.out.println(x++);
////        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}
