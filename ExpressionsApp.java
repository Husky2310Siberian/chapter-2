package gr.aueb.cf.ch3;

/** Επιδεικνύνει τη τέλεση αριθμητικών τελεστών
 * σε αριθμητικές παραστάσεις
 * @author vasiliskr
 */
public class ExpressionsApp {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 21;
        int num3 = 12;
        int num4 = 3;

        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num3 * num4;
        div = num3 / num4;
        mod = num4 % num3;

        result1 = (num1 + num2)/num3 - (num3 + num4)*num4;
        result2 = num1+num2;
        result2 = result1++;
        result3 = result2++;


        System.out.printf("sum=%,d, sub=%,d, mul=%,d, div=%,d, mod=%,d \n" , sum, sub, mul, div, mod);
        System.out.printf("result1=%,d, result2=%,d, result3=%,d \n ", result1, result2, result3);
    }
}
