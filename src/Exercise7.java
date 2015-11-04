import java.util.*;

/**
 * Created by alhanger on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Smith", "Bob", "Brown", "Charlie", "Jones");
        // Reverse the array
        // Convert the array into a HashMap
        // {"Jones" : "Charlie", "Brown" : "Bob", "Smith" : "Alice"}

        Collections.reverse(names);

        int count1 = 0;
        int count2 = 1;

        HashMap<String, String> people = new HashMap<>();
        for (String name : names) {
            people.put(names.get(count1), names.get(count2));
            count1 = count1 + 2;
            count2 = count2 + 2;
        }
        System.out.println(people);
    }
}
