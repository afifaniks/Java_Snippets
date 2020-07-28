/***
 * Java ArrayList with Generics
 * Author: https://afifaniks.me
 * 23/7/20
 */

import java.util.ArrayList;

public class Day02_DS_MyArrayList<T> {
    private ArrayList<T> list;

    public Day02_DS_MyArrayList() {
        this.list = new ArrayList<>();
    }

    public void printData() {
        for (T obj: list) {
            System.out.println(obj);
        }
    }

    public T getItem(int index) {
        return list.get(index);
    }

    public void storeData(T item) {
        list.add(item);
    }

    public void clear() {
        list.clear();
    }

    public static void main(String[] args) {
        Day02_DS_MyArrayList<String> newList = new Day02_DS_MyArrayList<>();

        newList.storeData("Hello");
        newList.storeData("There");
        newList.storeData("I");
        newList.storeData("Am");
        newList.storeData("Nowhere");

        // Print Items
        newList.printData();
    }


}
