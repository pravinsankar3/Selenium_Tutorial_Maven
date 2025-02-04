package org.example.javaPrograms;

public class swapNumbers {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nafter swap: ");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swapWOThirdVariable(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("\nafter swap: ");
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 90;
        System.out.println("before swap: ");
        System.out.println("a: " + a + " b: " + b);
        swapWOThirdVariable(a, b);
    }
}
