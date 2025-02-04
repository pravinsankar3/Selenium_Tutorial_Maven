package org.example.javaPrograms;

public class rightAngledTriangle {
    public static void rightTriangle(int n, String s) {
        for (int a = 0; a < n; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int starCount = 8;
        String symbol = "&";
        rightTriangle(starCount, symbol);
    }
}
