package org.example.javaPrograms;

public class test1 {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 3, 8};
        secLargest(a);
    }

    public static void secLargest(int[] a) {
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int b : a) {
            if (b > lar) {
                sec = lar;
                lar = b;
            } else if (b > sec) {
                sec = b;
            }
        }
        System.out.println("Second largest number in the array is: " + sec);
    }
}
