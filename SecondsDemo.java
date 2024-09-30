package gr.aueb.cf.ch3;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class SecondsDemo {

    public static void main(String[] args) {

        //δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;

        //εντολές
        System.out.println("Please insert the seconds");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds/DAY;
        remainingSeconds %= DAY;

        hours = remainingSeconds/HOUR;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds/MINUTE;
        remainingSeconds = remainingSeconds % MINUTE;

        //εκτύπωση
        System.out.printf("Input seconds :  %d =  %d Days , %d Hours, %d Minutes, %d Seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);
    }
}
