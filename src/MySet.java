/***
 * Set with Generics
 * Author: https://afifaniks.me
 * 23/7/20
 */

import java.util.HashSet;
import java.util.Set;

public class MySet<T> {
    Set<T> set;

    public MySet() {
        set = new HashSet<>();
    }

    public void printData() {
        for (T obj: set) {
            System.out.println(obj);
        }
    }

    public T getItem(T item) {
        for (T data:
             set) {
            if (data == item)
                return data;
        }

        // Nothing found
        return null;
    }

    public void storeData(T item) {
        set.add(item);
    }

    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>();

        set.storeData(2);
        set.storeData(4);
        set.storeData(3);
        set.storeData(6);
        set.storeData(1);
        set.storeData(2); // Won't be included twice

        set.printData();
    }
}
