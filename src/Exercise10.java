
import java.util.Scanner;

/**
 * Created by alhanger on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int num = 12345;

        // int numReversed = 54321

        String numStr = String.valueOf(num);

        // Solution 1
        /*
        String numStrReversed = "";

        for (int i = numStr.length()-1; i >= 0; i--) {
            numStrReversed += numStr.charAt(i);
        }
        int numReversed = Integer.valueOf(numStrReversed);
        System.out.println(numReversed);
        */

        // Solution 2
        String numStrReversed = new StringBuilder(numStr).reverse().toString();
        System.out.println(numStrReversed);
    }
}
