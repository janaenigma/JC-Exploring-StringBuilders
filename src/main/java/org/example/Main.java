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
//        StringBuilder sb = new StringBuilder("This is a test sentence.");
//        sb.delete(8, 16);
//        System.out.println("After delete(8, 16): " + sb);
//
//        sb.deleteCharAt(4);
//        System.out.println("After deleteCharAt(4): " + sb);

        // Exercise 4: replace() - Replacing a Section
//        StringBuilder sb = new StringBuilder("I like programming in Python.");
//        sb.replace(24, 30, "Java"); // PyJava
//        System.out.println(sb);

        // Exercise 5: Method Chaining
//        StringBuilder sb = new StringBuilder("Start");
//        sb.append("...").insert(0, "Ready, Set, ").delete(12,15); // Ready, Set, Start... Ready, Set, rt...
//        System.out.println(sb);

        // Exercise 6: substring(), indexOf(), and Non-Existing Words
//        StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");
//
//        String sub = sb.substring(16, 19);
//        System.out.println("Substring: " + sub); // fox
//
//        int indexOfFox = sb.indexOf("fox");
//        System.out.println("Index of 'fox': " + indexOfFox); // 16
//
//        int indexOfCat = sb.indexOf("cat");
//        System.out.println("Index of 'cat': " + indexOfCat); // -1

        // Exercise 7: toString() - Converting back to a String
        StringBuilder sb = new StringBuilder("Status: ");
        sb.append("Pending");

        String finalStatus = sb.toString();

        sb.append(" - Approved");

        System.out.println("StringBuilder: " + sb); // Status: Pending - Approved
        System.out.println("Final String: " + finalStatus); // Status: Pending
    }
}