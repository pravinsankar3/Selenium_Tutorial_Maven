package org.example.javaPrograms;

public class revWordsInSentence {

    // function to reverse the sentence
    public static void revTheSentence(String given) {
        String[] s = given.split(" ");
        String rev = "";
        for (int i = s.length - 1; i >= 0; i--) {
            rev = rev + s[i] + " ";
        }
        System.out.println("reversed sentence: " + rev);
    }

    public static void main(String[] args) {
        String given = "I like the view";
        revTheSentence(given);
    }
}