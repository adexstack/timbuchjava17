import java.io.*;
import java.util.*;

public class MainSelf {
    private static final Map<Integer, String> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        // reformatting the content of read file1.txt and writing it to file2.txt
        Set<Integer> keys = map.keySet();
        try (BufferedWriter locFile = new BufferedWriter(new FileWriter("file2.txt")))
        {
            for(Integer key:keys) {
                locFile.write(key + " : " + map.get(key) + "\n");
            }
        }
    }


           // static block is 1st called when a class is loaded, hence reading content of file1.txt and storing it in a map
            static {
                try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("file1.txt")))) {
                    scanner.useDelimiter(",");
                    while (scanner.hasNextLine()) {
                        int loc = scanner.nextInt();
                        System.out.println(loc + 5);
                        scanner.skip(scanner.delimiter()); // skipping the commas
                        String description = scanner.nextLine();
                        System.out.println("Imported loc: " + loc + ": " + description);
                        map.put(loc, description);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
}
