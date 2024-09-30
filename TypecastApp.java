package gr.aueb.cf.ch2;

/**
 *Provide the
 *
 *
 */
public class TypecastApp {

    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20L; // from default int , converted to Long
        int myResaultInt = 0;
        long myResaultLong = 0L;

        myLong = myInt; // auto-widening auto typecast
        myInt = (int) myLong; // typecast from int to long

        myResaultInt = (int) (myInt + myLong);//  converted myLong to Int
        myResaultInt = myInt * (int) myLong;
        myResaultLong = myInt;
    }
}
