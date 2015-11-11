/**
 * Created by alhanger on 11/11/15.
 */
public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Hello")); //false
        System.out.println(isPalindrome("racecar")); //true
    }

    public static boolean isPalindrome (String s) {

        int pos = s.length();
        for (int i = 0; i < (pos/2) + 1; i++) {
            if (s.charAt(i) != s.charAt(pos - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
