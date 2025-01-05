package JavaPractice;

import java.util.Scanner;

public class userAreaPerimeter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input the radius of circle: ");

        double radius = input.nextDouble();
        System.out.println(2*radius*Math.PI);
        System.out.println(Math.PI*radius*radius);

    }
}
