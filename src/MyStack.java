/***
 * Integer Stack
 * Author: https://afifaniks.me
 * 23/7/20
 */

import java.util.Stack;

public class MyStack {
    Stack<Integer> stack = new Stack<>();

    public void printData() {
        System.out.println("Stack Data");
        for (Integer i:
             stack) {
            System.out.println(i);
        }
    }

    public void push(int data) {
        stack.push(data);
    }

    public int pop() {
        return stack.pop();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(33);
        stack.push(344);
        stack.push(19);

        stack.printData();

        // Pop
        System.out.println("Popping " + stack.pop());

        stack.printData();
    }
}
