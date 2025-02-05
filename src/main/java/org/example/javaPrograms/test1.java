package org.example.javaPrograms;

import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {
        int[] a = {2, 4, 6, 3, 8};
        sortArray(a);
    }

    public static void sortArray(int[] a){
        Arrays.sort(a);

        System.out.println("Sorted array: "+Arrays.toString(a));
    }
}
