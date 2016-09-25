/*
 * Kyle Verdeyen
 * kverdey1@jhu.edu
 * Unique.java
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
    This is a sample-solution for Problem 1 on Assignment 1. It doesn't use
    anything fancy, just stuff you should have known from your previous Java
    courses. (Well, and some stuff checkstyle would have told you about.)
*/

public final class Unique {

    // array of unique numbers
    private static int inputLength;
    private static SimpleArray arraydata;
    // how many slots in data are used?
    private static int used;

    // make checkstyle happy
    private Unique() {}
    // position of given value in data[], -1 if not found

    private static int find(int value) {
        for (int i = 0; i < used; i++) {
            if ((int) arraydata.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    // insert value into data[] if not already present
    private static void insert(int value) {
        int position = find(value);
        if (position < 0) {
            arraydata.put(used, value);
            used += 1;
        }
    }

    /**
        Print only unique integers out of given command line arguments.

        @param args Command line arguments.
    */
    public static void main(String[] args) {
        int ilength = 0;
        Scanner oScan = new Scanner(System.in);
        ArrayList newdata = new ArrayList();
        while (oScan.hasNextInt()) {
            newdata.add(oScan.nextInt());
        }
        ilength = newdata.size();
        inputLength = ilength;
        arraydata = new SimpleArray(inputLength, null);
        for (int i = 0; i < newdata.size(); i++) {
            insert((int) newdata.get(i));
        }
        for (int i = 0; i < arraydata.length(); i++) {
            if (arraydata.get(i) != null) {
                System.out.println(arraydata.get(i));
            }
        }
        oScan.close();
    }
}
