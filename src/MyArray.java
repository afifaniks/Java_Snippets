/***
 * Arrays
 * Author: https://afifaniks.me
 * 23/7/20
 */

public class MyArray {
    String[] array;
    int size;
    int currentIndex = 0;

    public MyArray(int size) {
        array = new String[size];
        this.size = size;
    }

    public void printData() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.printf("Index: " + i + ", Data: " + array[i] + "\n");        }
    }

    public void storeData(String data) {
        // Checking for a valid index
        if (currentIndex < size)
            array[currentIndex++] = data;
        else
            System.out.println("Overflow");
    }

    public static void main(String[] args) {
        MyArray array = new MyArray(10);

        array.storeData("Ami");
        array.storeData("Tumi");
        array.storeData("She");

        array.printData();
    }


}
