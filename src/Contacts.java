import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alhanger on 10/13/15.
 */
public class Contacts {
    public static void main(String[] args) {
        Contact bob = new Contact("Bob", 30);
        Contact alice = new Contact("Alice", 20);
        Contact charlie = new Contact("Charlie", 25);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(bob);
        contacts.add(alice);
        contacts.add(charlie);

        ArrayList<Contact> contactsUnderThirty = new ArrayList<>();

        Contact contactToFind = null;
        for (Contact c : contacts) {
            if (c.age < 30) {
                contactsUnderThirty.add(c);
            }
        }

        System.out.println(contactsUnderThirty);

        HashMap<String, Contact> contactMap = new HashMap<>();
        contactMap.put("Bob", bob);
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);

        //contactToFind = contactMap.get("Alice");

        if (contactToFind == null) {
            System.out.println("Couldn't find contact.");
        }
        else {
            System.out.println("Found contact.");
        }
    }
}
