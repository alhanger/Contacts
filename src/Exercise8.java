import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by alhanger on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(new File("people.csv"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Split line into array of columns
            // Add first and last name to "names"
            String[] column = line.split(",");
            String firstName = column[1];
            String lastName = column[2];
            names.add(firstName + " " + lastName);
        }

        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList<>();
        // Fill "results" with all the names that contain searchTerm (case-insensitive)

        searchTerm = searchTerm.toLowerCase();
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm)) {
                results.add(name);
            }
        }

        System.out.println(results);

        // use streams
        final String searchTerm2 = searchTerm;
        List<String> results2 =
               names
                .stream()
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm2);
                })
                .collect(Collectors.toList());

        System.out.println(results2);
    }
}
