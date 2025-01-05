package ArrayPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraySortings {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<Integer>();
        System.out.println( "size ="+ number.size());

        number.add(10);
        number.add(100);
        number.add(2 ,30);
        number.add(10);

        System.out.print("ArrayList contains "+ number );
        //.//for(int x : number) {
     //.// System.out.println( " "+x);
Iterator itr = number.iterator();
 while (itr.hasNext()){
     System.out.println(" "+itr.next() );

        }
     System.out.println( );

        System.out.println( "size ="+ number.size());
number.remove(2);
        System.out.println("ArrayList contains after removal"+ number );

    }
}
