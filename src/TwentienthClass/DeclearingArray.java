package TwentienthClass;

public class DeclearingArray {
    public static void main(String[] args) {
        int[] number = new int [7];
        number[0]=10;
        number[1]=60;
        number[2]=10;
        number[3]=30;
        number[4]=20;
        number[5]=190;
        System.out.println(number[5]);


        int sum =number[0]+number[1] + number[2] + number[3] + number[4] +  number[5];
        System.out.println("sum = "+ sum);

        int len = number.length;
        System.out.println("Array size= "+ len);



    }
}
