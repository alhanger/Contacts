import java.util.ArrayList;

/**
 * Created by alhanger on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question.";
        // Remove commas and periods
        // Make it all lowercase
        // Split into words
        // Remove duplicate words
        // Create a new string without the duplicate words

        String[] words = s.toLowerCase().replaceAll(",", "").replaceAll(".", "").split(" ");
        ArrayList<String> newWords = new ArrayList<>();

        for (String word : words) {
            if (!newWords.contains(word)) {
                newWords.add(word);
            }
        }
        String newStr = "";
        for (String newWord : newWords) {
            newStr += " " + newWord;
        }
        System.out.println(newStr);
    }
}
