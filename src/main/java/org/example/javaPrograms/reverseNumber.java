package org.example.javaPrograms;

public class reverseNumber {
    public static void revNumber(int given) {
        int rev = 0;
        while (given != 0) {
            rev = rev * 10;
            rev = rev + given % 10;
            given = given / 10;
        }
        System.out.println("reversed number :" + rev);
    }

    public static void main(String[] args) {
        int given = 123;
        System.out.println("Given no: "+given);
        revNumber(given);
    }
}
