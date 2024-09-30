package gr.aueb.cf.ch3;

/**
 * template foe programming
 * πολλαπλασιάζει δυο ακεραίους
 * και εκτυπώνει το αποτέλεσμα στη κονσόλα
 */
public class Output2App {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποιήση μεταβλητών
        int price = 100;
        int quantity = 5;
        int totalPrice = 0;

        //Εντολές
        totalPrice = price * quantity;

        // εκτύπωση αποτελεσμάτων
        System.out.printf(" Price : %3d, Quantity : %02d , Total Price : %,d ", price, quantity, totalPrice);
    }
}
