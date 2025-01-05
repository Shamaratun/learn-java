package JavaPractice;

import java.util.Scanner;

public class UserIfElse {
        public static void main(String[] args) {
            // Create a Scanner object to take user input
            Scanner aa = new Scanner(System.in);

            // Prompt the user to enter values for a, b, and c
            System.out.print("Enter the value of a: ");
            int a = aa.nextInt();

            System.out.print("Enter the value of b: ");
            int b = aa.nextInt();

            System.out.print("Enter the value of c: ");
            int c = aa.nextInt();

            // Check the conditions
            if (a > b && a > c) {
                System.out.println("A");
            } else if (b > c) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }

            // Close the scanner to avoid resource leak
            aa.close();
        }
    }


