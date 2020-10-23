import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive. The string can contain any char.
 * <p>
 * Examples input/output:
 * <p>
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */


public class ExesAndOhs {


    public static boolean getXO(String str) {
        str = str.toLowerCase();
        int countX = 0;
        int countO = 0;
        char[] input = str.toCharArray();

        for (char i : input) {
            if (i == 'o') {
                countO++;
                continue;
            }
            if (i == 'x') {
                countX++;
            }
        }

        return countO == countX;
    }


    // better option
//    public static boolean getXO (String str) {
//        str = str.toLowerCase();
//        return str.replace("o","").length() == str.replace("x","").length();
//
//    }
}



