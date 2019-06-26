package com.techchefs.javaapps.assignment.one;
public class Square {
 
    public static void main(String[] args) {
        int number = 17;
 
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == number-1) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 1 && i <= number-2) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == number-1) {
                        System.out.print("*");
                    } else if (j >= 1 && j <= number-2) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
 