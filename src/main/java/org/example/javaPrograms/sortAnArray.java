package org.example.javaPrograms;

import java.util.*;

public class sortAnArray {

    public static void sortArray(int[] given) {
        Arrays.sort(given);
        System.out.println("sorted array: " + Arrays.toString(given));
    }

    public static void main(String[] args) {
        int[] given = {2, 5, 7, 1, 3, 0, 10};
        sortArray(given);
    }
}