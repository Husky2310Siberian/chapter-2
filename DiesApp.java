package gr.aueb.cf.ch3;

/**
 *
 *
 */

public class DiesApp {

    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1 ;
        int die2 = (int) (Math.random() * 6) + 1  ;

        System.out.printf("(%d, %d)", die1 , die2);
    }
}
