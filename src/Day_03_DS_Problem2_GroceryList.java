import java.util.ArrayList;
import java.util.HashSet;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/24/2020
 * Web: https://afifaniks.me
 */

public class Day_03_DS_Problem2_GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    /***
     *
     * @param list: List of groceries
     */
    public Day_03_DS_Problem2_GroceryList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            groceryList.add(list[i]);
        }
    }

    public void removeDuplicates() {
        // Removing elements with enhanced for each
        HashSet<String> tempList = new HashSet<>();

        for (String item : groceryList) {
            tempList.add(item);
        }

        // Clearing previous list
        groceryList.clear();

        // Adding filtered list
        groceryList.addAll(tempList);
    }

    public boolean hasItem(String itemName) {
        return groceryList.contains(itemName);
    }

    public void replaceItem(String replaceItem, String replaceTo) {
        // Check if item exists
        if (groceryList.contains(replaceItem)) {
            groceryList.set(groceryList.indexOf(replaceItem),
                    replaceTo);
        }

        printList();
    }

    public void printList() {
        System.out.println("\nThe updated list is");
        for (String item: groceryList) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] groceries = {"Eggs","Cheese","Chicken","Milk", "Beef", "Potato","Potato", "Carrot", "Eggs", "Eggs"};

        Day_03_DS_Problem2_GroceryList groceryList = new Day_03_DS_Problem2_GroceryList(groceries);

        groceryList.printList();

        // Removing duplicates
        groceryList.removeDuplicates();

        System.out.println("\nAfter Removing Duplicates");
        groceryList.printList();

        // Checking item availability
        System.out.println("Checking for Something: " + groceryList.hasItem("Something"));
        System.out.println("Checking for Potato: " + groceryList.hasItem("Potato"));

        // Replacing item
        groceryList.replaceItem("Beef", "Mutton");
    }
}
