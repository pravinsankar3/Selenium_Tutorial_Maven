package org.example.javaPrograms;

public class secondLargestNumberInArray {
// function to calc the second-largest number in the array:
    public static void secondLargest(int[] given) {
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for (int num : given) {
            if (num > lar) {
                sec = lar;
                lar = num;
            } else if (num > sec) {
                sec = num;
            }
        }
        System.out.println("second largest number in array is: " + sec);
    }

    public static void main(String[] args) {
        int[] given = {3, 6, 2, 7, 1};
        secondLargest(given);
    }
}
