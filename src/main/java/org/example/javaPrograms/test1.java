package org.example.javaPrograms;

public class test1 {

    public static void revSentence(String s) {
        String[] ns = s.split(" ");
        String rev = "";
        for (int i = ns.length - 1; i >= 0; i--) {
            rev = rev + ns[i] + " ";
        }
        System.out.println("Reversed sentence is: " + rev);
    }

    public static void main(String[] args) {
        String s = "I like the view";
        revSentence(s);
    }
}
