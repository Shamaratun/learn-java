package twenty3rdPractice;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] array = {2,5,6,7,8,22,23,45,18,29,32};
        int difference = differentSumOfEvenOdd(array);

        System.out.println("difference Between Sum Of Even and Odd: "+ difference);   }

    private static int differentSumOfEvenOdd(int[] array) {
 int sumOfEven=0;
        int sumOfOdd = 0;
for(int i:array){
    if(i%2==0){
        sumOfEven+=i;
    }else{sumOfOdd+=i;
}
    }
        System.out.println("sum Of Even: "+sumOfEven);
        System.out.println("sum Of Odd: "+sumOfOdd);
        return sumOfEven-sumOfOdd;

    }
}