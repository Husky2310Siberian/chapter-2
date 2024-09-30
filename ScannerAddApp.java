package gr.aueb.cf.ch2;

import java.util.Scanner;

//
//import java.util.Scanner;
//
///**
// * διαβάζει δυο ακεραίους με τη βοηθεια
// * της Scanner class και δίνει το αποτέλεσμα
// * των input του χρήστη
// */
public class ScannerAddApp {
//
//    public static void main(String[] args) {
//
//        //δήλωση και αρχικοποίηση μεταβλητών
//        Scanner in = new Scanner(System.in);
//        int num1 = 0;
//        int num2 = 0;
//        int sum = 0;
//
//        //Εντολές
//        System.out.println("Please insert two Integers");
//        num1 = in.nextInt();
//        num2 = in.nextInt();
//        sum = num1 + num2;
//
//        // εκτύπωση αποτελεσμάτων
//        System.out.printf("%d + %d + %d ", num1 , num2, sum);
//    }
//}

    public static void main(String[] args) {

        //δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0;

        //εντολές
        System.out.println("Please insert the numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        sum = num1 + num2 + num3;

        //εκτύπωση αποτελεσμάτων
        System.out.printf(" %d + %d + %d = %d", num1, num2, num3, sum);
    }
}