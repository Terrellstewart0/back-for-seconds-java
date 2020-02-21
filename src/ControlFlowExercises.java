import org.w3c.dom.ls.LSOutput;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;

//        }
//        int j = 0;
//        do {
//            System.out.println( j + 2);
//
//        }while (j >= 100);

//        for (int j = 100; j >= -10; j -= 5){
//            System.out.println(j);
//        }
//        for(int i = 1; i <= 10; i++) { // <--+
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }
        for (int i = 0; i <= 100; i++) {
            if (i%15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i%5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }


    }

}
