package JavaPractice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        //int num1 = input.nextInt();
       // for (int i = 0; i < 10; i++) {
         //   System.out.println(num1 + " x " + (i + 1) + "=" + (num1 * (i + 1)));
       /* int n= input.nextInt();
        for (int i=0;i<=20;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }*/
        int i=0;
        int n=1;
        while (i<=10){
            System.out.printf("%d * %d\n" ,n,i,n*i);

            i++;
        }
    }
}

