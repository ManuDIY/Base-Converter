/*****************************************************************
This is a program that takes a number of a certain base and 
converts it to the same number in a different base.
Plan: Input a number, convert it to a different base, and then
output it as a different base.

@author TJ Zimmerman
@version 1.00
 *****************************************************************/
import java.util.*;

public class ConvertBases {

    /** String value of number */
    private String number;

    /** The initial base */
    private int initialbase;

    /** The desired base */
    private int finalbase;

    /** The char array */
    char[] num;

    /*****************************************************************
     * Basic base constructor. Doesn't call anything.
     *****************************************************************/
    public ConvertBases() {

    }

    /*****************************************************************
     * This constructor takes the string input.
     * 
     * @param String
     *            of a number
     *****************************************************************/
    public ConvertBases(String s) {
        super();
        this.number = s;
    }

    /*****************************************************************
     * This method calls the other methods.
     * 
     * @param String
     *            [] args
     *****************************************************************/
    public static void main(String[] args) {
        ConvertBases b = new ConvertBases();
        b.readInt();
    }

    /*****************************************************************
     * This method will take the values needed, convert them, and 
     * print out the converted values. 
     *****************************************************************/
    public void readInt() {

        System.out.println("Please enter your number: ");
        Scanner scan = new Scanner(System.in);
        this.number = scan.nextLine();

        System.out.println("Please enter the base of that number: ");
        this.initialbase = scan.nextInt();

        System.out.println("Please enter the base that you'd like to convert to: ");
        this.finalbase = scan.nextInt();

        System.out.println("This number is \"" + convertToBase(number, initialbase, finalbase) + "\" in the other base.");
    }

    /*****************************************************************
     * converToBase method will take the string and the base of the string and
     * convert it to the base that it's asking for.
     * 
     * @param String
     *            s , int base, int convertbase.
     *****************************************************************/
    public String convertToBase(String s, int base, int convertbase) {

        int cnvt = 0, cnvt2 = 0, val = 0;
        String answer = "", answer1 = "";

        num = s.toCharArray();
        int j = num.length - 1;

        /** This is here to make sure that the bases are within the correct range */
        if (base < 2 || base > 35 || convertbase < 2 || convertbase > 35) {
            System.out.println("One of your bases is either too large or too small! Please try again.");
            System.exit(0);
        }

        /** Converts to base 10 */
        for (int i = 0; i < num.length; i++) {
            char c = num[i];
            if (c >= '0' && c <= '9') {
                val = c - '0';
            } else {
                val = c - ('a' - 10);
            }
            cnvt += (val) * (Math.pow(base, j--));
        }

        if (convertbase == 10) {
            answer = ("" + cnvt);
        }

        /**
         * If the desired base isn't 10, it will convert to the other base.
         */
        if (convertbase != 10) {
            while (cnvt > 0) {
                cnvt2 = cnvt % convertbase;
                if (cnvt2 == 10) {
                    answer1 += ("a");
                }
                if (cnvt2 == 11) {
                    answer1 += ("b");
                }
                if (cnvt2 == 12) {
                    answer1 += ("c");
                }
                if (cnvt2 == 13) {
                    answer1 += ("d");
                }
                if (cnvt2 == 14) {
                    answer1 += ("e");
                }
                if (cnvt2 == 15) {
                    answer1 += ("f");
                }
                if (cnvt2 < 10) {
                    answer1 += ("" + cnvt2);
                }
                cnvt /= convertbase;
            }

            /** Manipulates number to get the correct value.*/
            for (int i = answer1.length() - 1; i >= 0; i--) {
                answer += answer1.charAt(i);
            }
        }

        return answer;
    }

}
