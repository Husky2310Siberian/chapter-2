package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {

        //δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputEuro = 0;
        int euros500 = 0;       // χαρτονομίσματα των 500 ευρώ
        int euros100 = 0;
        int euros50 = 0;
        int euros20 = 0;
        int euros10 = 0;
        int euros5 = 0;
        int remainingEuros = 0;


        //Εντολές
        System.out.println("Please your money");

        inputEuro = in.nextInt();
        remainingEuros = inputEuro;

        euros500 = remainingEuros/500;
        remainingEuros %= 500;

        euros100 = remainingEuros/100;
        remainingEuros %= 100;

        euros50 = remainingEuros/50;
        remainingEuros %= 50;

        euros20 = remainingEuros/20;
        remainingEuros %= 20;

        euros10 = remainingEuros/10;
        remainingEuros %= 10;

        euros5 = remainingEuros/5;
        remainingEuros %= 5;

        //Εντολές
        System.out.printf("Euros  =  %d   euros500: %d, euros100: %d,  euros50:%d , euros20:%d, euros10:%d , euros5:%d "
                , remainingEuros, euros500, euros100, euros50, euros20, euros10,euros5);
    }
}
