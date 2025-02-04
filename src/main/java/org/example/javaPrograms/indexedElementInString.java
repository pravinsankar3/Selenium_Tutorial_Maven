package org.example.javaPrograms;

public class indexedElementInString {

    public static void indexElement(String s, int ind) {
// function to find the charater in a string at the index given:
        char ch = s.charAt(ind);
        System.out.println("character at " + ind + "th position is :" + ch);
    }

    public static void main(String[] args) {
        String s = "GeeksOfGeek";
        int index = 3;
        indexElement(s, index);
    }
}
