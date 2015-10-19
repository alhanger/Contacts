import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by alhanger on 10/19/15.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap<>();

        for (String name : names) {
            for (String name2 : names) {
                if (!name.equals(name2)) {
                    Contact p = new Contact(name2, 25);
                    ArrayList<Contact> newList = people.get(name);
                    if (newList == null) {
                        newList = new ArrayList<>();
                        newList.add(p);
                        people.put(name, newList);
                    }
                    else {
                        newList.add(p);
                    }
                }
            }
        }
        //Below are 2 different ways to generate a random number
        //The code takes that random number and plugs it into the names array and returns a random person
        double randNum = Math.random();
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random();
        index = rand.nextInt(4);
        System.out.println(names[index]);
    }
}
