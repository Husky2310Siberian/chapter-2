package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * euro to usd converted
 */
public class EuroUsdConverted {

    public static void main(String[] args) {

        //δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputEuros;
        final int PARITY = 99; // ισοτιμία ευρώ σε δολλάρια 1 ευρώ 99 σεντσ USD
        int totalUsaCents;
        int   usaCents;
        int usaDollars;

        //εντολές
        System.out.println("Please insert the amount in euros");
        inputEuros = in.nextInt();
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //εκτύπωση
        System.out.printf("%d euros = %d usa cents = %d usa dollars & %d usa cents" ,
                inputEuros, totalUsaCents, usaDollars, usaCents);


    }
}
