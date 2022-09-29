package ch12a;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue fruit = new LinkedList();
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Pineapple");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);

        System.out.println(fruit.peek());
    }
}
