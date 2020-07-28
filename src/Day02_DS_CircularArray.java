/***
 * Circular Arrays
 * Author: https://afifaniks.me
 * 23/7/20
 */

public class Day02_DS_CircularArray {
    int len;
    int[] array;
    int current = 0;

    public Day02_DS_CircularArray(int n) {
        len = n;
        array = new int[n];
    }

    public void printData(int start) {
        for (int i = start; i < start + len; i++) {
            System.out.println(array[i%len]); // Mod will work for indices > len
        }
    }

    public void storeData(int data) {
        // Checking for a valid index
        if (current < len)
            array[current++] = data;
        else
            System.out.println("Overflow");
    }

    public static void main(String[] args) {
        Day02_DS_CircularArray circularArray = new Day02_DS_CircularArray(5);

        circularArray.storeData(2);
        circularArray.storeData(3);
        circularArray.storeData(4);
        circularArray.storeData(5);
        circularArray.storeData(6);

        circularArray.printData(2);
    }

}
