/***
 * 2D Arrays
 * Author: https://afifaniks.me
 * 23/7/20
 */

public class My2DArray {
    int[][] array;
    int height, width;
    int currentHeight = 0;
    int currentWidth = 0;

    public My2DArray(int height, int width) {
        array = new int[height][width];
        this.height = height;
        this.width = width;
    }

    public void printData() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    public void storeData(int data) {
        // Checking for a valid index
        if (currentHeight < height && currentWidth < width) {
            array[currentHeight][currentWidth++] = data;
            if (currentWidth == width) {
                currentWidth = 0;
                currentHeight++;
            }
        }
        else
            System.out.println("Overflow");
    }

    public static void main(String[] args) {
        My2DArray array = new My2DArray(5, 5);

        array.storeData(2);
        array.storeData(44);
        array.storeData(1);
        array.storeData(3);
        array.storeData(12);
        array.storeData(1);
        array.storeData(3);
        array.storeData(12);
        array.storeData(2);
        array.storeData(44);
        array.storeData(1);
        array.storeData(3);
        array.storeData(12);
        array.storeData(1);
        array.storeData(3);
        array.storeData(12);
        array.storeData(2);
        array.storeData(44);

        array.printData();
    }
}
