import java.util.Comparator;

/**
 * Created by alhanger on 10/7/15.
 */
public class Contact implements Comparable {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() {

    }

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        int result = name.compareTo(c.name); //stores the value of the comparison between two names
        if (result == 0) { //if the names are the same, sort by age
            return age - c.age;
        }
        else {
            return result;
        }
    }
}