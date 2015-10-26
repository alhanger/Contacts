import java.util.HashMap;

/**
 * Created by alhanger on 10/26/15.
 */
public class Exercise4 {
    public static void main(String[] args) {
        String sentence = "To be or not to be that is the question be";
        HashMap<String, Integer> frequencies = new HashMap<>();

        String[] words = sentence.toLowerCase().split("\\s+");

        for(String word : words) {
            int counter = 1;
            for(String word2 : words) {
                if (word2.equals(word)) {
                    frequencies.put(word, counter);
                    counter++;
                }
            }
        }
        System.out.println();
    }
}