import java.util.ArrayList;

/**
 * Project: Java_Snippets
 * Author: AFIF AL MAMUN
 * Created in 7/24/2020
 * Web: https://afifaniks.me
 */

public class Day03_DS_Problem1_Array {
    private int arr[];

    public Day03_DS_Problem1_Array(int[] arr) {
        this.arr = arr;
    }

    public int findMin() {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    public int findMax() {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public void convertToListAndPrint(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println("Printing List w/ For Each");
        for (Integer i:
             list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 32, 1, 8, 32, 92, 41, 71, 34, 64, 99};

        // Instantiate object
        Day03_DS_Problem1_Array object = new Day03_DS_Problem1_Array(arr);

        System.out.println("The Max value is: " + object.findMax()
                + " and Min Value is: " + object.findMin());

        // Array to List
        object.convertToListAndPrint(arr);
    }

}

