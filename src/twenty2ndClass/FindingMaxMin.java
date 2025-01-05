package twenty2ndClass;

import java.util.Scanner;

public class FindingMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 6 numbers: ");

        // Declare an array to hold 6 numbers
        double[] numbers = new double[6];

        // Take user input and fill the array
        for (int i = 0; i < 6; i++) {
            System.out.print("");
            numbers[i] = input.nextDouble();
        }

        // Initialize max and min with the first number in the array
        double max = numbers[0];
        double min = numbers[0];

        // Find the max and min from the entered numbers
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Output the results
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
