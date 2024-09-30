package gr.aueb.cf.ch3;

/**
 * Ελέγχει την υπερχείλιση
 */
public class OverFlow {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 2147483647;
        int num2 = 1;
        int result = 0;

        result = num1 + num2;

        System.out.println("Το αποτέλεσμα της πράξης θα είναι result = " + result);
    }
}