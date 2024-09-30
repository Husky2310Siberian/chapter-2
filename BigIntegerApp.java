package gr.aueb.cf.ch3;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάσση BigInteger
 * για να μην έχουμε overflow
 */
public class BigIntegerApp {

    public static void main(String[] args) {

        BigInteger myBigNum1 = new BigInteger("99999912345678912345678999999999999999999999999999999999");
        BigInteger myBigNum2 = new BigInteger("999999923101990231099999999999999999999999999999999999999");
        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.printf("%,d " , result);

    }
}
