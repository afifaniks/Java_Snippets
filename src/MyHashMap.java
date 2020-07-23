/***
 * HashMap with Generics
 * Author: https://afifaniks.me
 * 23/7/20
 */

import java.util.HashMap;

public class MyHashMap<K, V> {
    private HashMap<K, V> map;

    public MyHashMap() {
        this.map = new HashMap<>();
    }

    public void printData() {
        for (K key: map.keySet()) {
            System.out.println(map.get(key));
        }
    }

    public V getItem(K key) {
        return map.get(key);
    }

    public void storeData(K key, V val) {
        map.put(key, val);
    }

    public void clear() {
        map.clear();
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        map.storeData(1, "GG");
        map.storeData(2, "EZ");
        map.storeData(3, "FF");

        // Print all
        map.printData();

        // Get one object
        System.out.println(map.getItem(2));
    }
}
