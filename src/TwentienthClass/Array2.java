package TwentienthClass;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 6 numbers: ");


        double[] number = new double[6];
        double sum= 0;
        for( int i =0; i<6; i++){  //i<number.length;
            number[i] =input.nextDouble();
        }
        for(int i= 0;i<number.length;i++){
            sum =sum+number[i];
        }
//        number[0]= input.nextDouble();
//        number[1]=input.nextDouble();
//        number[2]=input.nextDouble();
//        number[3]=input.nextDouble();
//        number[4]=input.nextDouble();
//        number[5]=input.nextDouble();
 //      sum =number[0]+number[1] + number[2] + number[3] + number[4] +  number[5];
        System.out.println("sum = "+ sum);
        System.out.println("Average = "+ sum/2);

double avg = sum/2;
        System.out.println("Average = "+ avg);

    }
}
