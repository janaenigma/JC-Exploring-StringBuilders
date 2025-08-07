package org.example;

public class Main {
    public static void main(String[] args) {

        // Exercise 1: append() - Appending Content
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(", Cadets!");
//        System.out.println(sb);

        // Exercise 2: insert() - Inserting Content at a Position
//        StringBuilder sb = new StringBuilder("Java is great!");
//        sb.insert(8, "really ");
//        System.out.println(sb);

        // Exercise 3: delete() - Deleting Content
        StringBuilder sb = new StringBuilder("This is a test sentence.");
        sb.delete(8, 16);
        System.out.println("After delete(8, 16): " + sb);

        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb);
    }
}