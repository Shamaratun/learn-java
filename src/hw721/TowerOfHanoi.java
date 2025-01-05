package hw721;

import java.io.FileOutputStream;
import java.util.Scanner;



public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int num = scanner.nextInt();
        System.out.println("The moves are : ");
        moveDisks (num,'A','B','C');
        scanner.close();
    }

    private static void moveDisks(int num, char fromTower, char toTower, char auxTower) {
        if (num == 1)
            System.out.println("Move Disks " + num + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(num - 1, fromTower, auxTower, toTower);
            System.out.println("Move Disks " + num + " from " + fromTower + " to " + toTower);
            moveDisks(num - 1, auxTower, toTower, fromTower);

           // close();
        }
    }
}
