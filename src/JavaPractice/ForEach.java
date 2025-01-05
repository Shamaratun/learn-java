package JavaPractice;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int name[] = new int[7];//name.length
        for(int i =0; i<6; i++)
        {
            name[i] = i+1;
        }
        for(int i :name)
            System.out.printf("  "+i);
        System.out.printf(" \n \n \n ");
       for(int i =0; i<7; i++)// name.length use this insted of array length
      System.out.println(name[i]);
        System.out.printf(" \n \n \n ");

       String[] names ={ "MUMU", "MUHU","MEME","WADI","MAHDI","JARIF","JAYEK"};
        for(int j =0; j<7; j++)// name.length use this instead of array length


        System.out.println(names[j]);
        System.out.println(new String[]{"ARZA", "AHIR"});
    }
}
