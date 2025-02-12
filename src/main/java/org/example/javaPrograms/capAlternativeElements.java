package org.example.javaPrograms;

public class capAlternativeElements {

    public static void main(String[] args) {
        String name = "PravinSankar".toLowerCase();
        char ch;
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            if (i % 2 == 0) {
                System.out.print(ch);
            }
            if (i % 2 != 0) {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
