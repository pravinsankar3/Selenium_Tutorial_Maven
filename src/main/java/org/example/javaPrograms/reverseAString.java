package org.example.javaPrograms;

public class reverseAString {

// function to reverse a string with String Builder:
    private static void revWBuiler(String given) {
        StringBuilder sb = new StringBuilder();
        sb.append(given);
        System.out.println("Second largest no. in the array: " + sb.reverse());
    }

// function to reverse a string with char array:
    public static void revWCharAt(String given) {
        String rev = "";
        char ch;
        for (int i = 0; i < given.length(); i++) {
            ch = given.charAt(i);
            rev = ch + rev;
        }
        System.out.println("Second largest no. in the array: " + rev);
    }

    public static void main(String[] args) {
        String given = "tweets";
        revWBuiler(given);
        revWCharAt(given);
    }
}