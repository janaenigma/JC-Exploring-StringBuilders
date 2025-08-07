package org.example;

public class Main {
    public static void main(String[] args) {

        // Exercise 1: append() - Appending Content
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(", Cadets!");
//        System.out.println(sb);

        // Exercise 2: insert() - Inserting Content at a Position
        StringBuilder sb = new StringBuilder("Java is great!");
        sb.insert(8, "really ");
        System.out.println(sb);
    }
}