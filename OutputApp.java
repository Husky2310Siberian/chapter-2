package gr.aueb.cf.ch3;

import java.util.Locale;

public class OutputApp {
    public static void main(String[] args) {

        int num1 = 1;
        Long num2 = 243987645L;

        System.out.printf(Locale.forLanguageTag("IT"), "Num is : %04d, Num2 is:  %02d ", num1, num2);
    }
}
