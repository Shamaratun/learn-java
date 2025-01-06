package twenty4thClass;
public class BubbleSort {
    public static void BubbleSort(int[] list){

    boolean needNextPass = true;
        //int[] list = {2,5,6,7,8,13,16,17,22,23,45,18,29,32};
for(int i=0;i< list.length && needNextPass;i++){
    for(int k=0;i< list.length-i;k++){
if(list[k]>list[k+1]){
    int temp = list[k];
    list[k+1]=temp;
    needNextPass = true;
}
    }
    }
}
public static void main(String[] args) {
    int[] list = {2,5,6,7,8,13,16,17,22,23,45,18,29,32};
    for(int k=0;k< list.length;k++)
        System.out.println(list[k]+" ");
}}