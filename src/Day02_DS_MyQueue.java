/***
 * Queue of Strings
 * Author: https://afifaniks.me
 * 23/7/20
 */

import java.util.LinkedList;
import java.util.Queue;

public class Day02_DS_MyQueue {
    Queue<String> queue = new LinkedList<>();

    public void printData() {
        System.out.println("Queue Status");
        for (String s: queue) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void storeData(String data) {
        queue.add(data);
    }

    public String popData() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Day02_DS_MyQueue myQueue = new Day02_DS_MyQueue();
        myQueue.storeData("Pikachu");
        myQueue.storeData("Jamal");
        myQueue.storeData("Foo");
        myQueue.storeData("Bar");

        myQueue.printData();

        // Pop head
        System.out.println("Popping " + myQueue.popData() + "\n");

        myQueue.printData();
    }
}
