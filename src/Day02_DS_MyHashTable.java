/***
 * HashTable with Generics
 * Author: https://afifaniks.me
 * 23/7/20
 */

import java.util.Hashtable;

public class Day02_DS_MyHashTable<K, V> {
    Hashtable<K, V> hashtable = new Hashtable<>();

    public void printData() {
        for (K key: hashtable.keySet()) {
            System.out.println(hashtable.get(key));
        }
    }

    public V getItem(K key) {
        return hashtable.get(key);
    }

    public void storeData(K key, V val) {
        hashtable.put(key, val);
    }

    public void clear() {
        hashtable.clear();
    }

    public static void main(String[] args) {
        Day02_DS_MyHashMap<Integer, String> map = new Day02_DS_MyHashMap<>();

        map.storeData(1, "Test");
        map.storeData(2, "Me");
        map.storeData(3, "Now");

        // Print all
        map.printData();

        // Get one object
        System.out.println(map.getItem(2));
    }
}
