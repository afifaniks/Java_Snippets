import java.util.HashMap;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/24/2020
 * Web: https://afifaniks.me
 */

public class Day03_DS_Problem3_Hashing {
    HashMap<String, String[]> addressDictionary = new HashMap<>();

    public void addEntry(String name, String[] address) {
        addressDictionary.put(name, address);
    }

    public String[] getAddress(String name) {
        String[] addresses = addressDictionary.get(name);

        return addresses;
    }

    public void printAll() {
        int ctr = 1;

        for (String name: addressDictionary.keySet()) {
            System.out.println("Individual " + ctr++ + ": " + name);

            String[] addresses = getAddress(name);

            if (addresses == null)
                System.out.println("NO ADDRESS");
            else {
                for (int i = 0; i < addresses.length; i++) {
                    System.out.println("Address " + (i+1) + ": " + addresses[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Day03_DS_Problem3_Hashing dict = new Day03_DS_Problem3_Hashing();
        // Populating objects
        dict.addEntry("Akib", new String[]{"Mirpur", "Dhanmondi", "Shiddheshwari"});
        dict.addEntry("Sajeeb", new String[]{"Lalmatia"});
        dict.addEntry("Niloy", new String[]{"Puran Dhaka", "Rajarbag"});
        dict.addEntry("Ratul", null);

        // Printing data
        dict.printAll();
    }
}
