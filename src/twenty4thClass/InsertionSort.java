package twenty4thClass;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {2,5,6,7,8,22,23,45,18,29,32};
                for(int i = 1; i<list.length; i++){
            int currentElement = list[i];
            int k;
            for(k=i-1;k>=0 && list[k]>currentElement;k--){
                list[k+1]= list[k];

                    }
            list[k+1] = currentElement;
        }
    }}
