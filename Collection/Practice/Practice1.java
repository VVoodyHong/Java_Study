package Collection.Practice;

import java.util.*;

public class Practice1 {

    public static void main(String[] args) {
        
        var v = new Vector<Integer>();
        var rand = new Random();

        for ( int i = 0; i < 10; i++ ) v.add(rand.nextInt(10) + 1);

        System.out.println("Vector has " + v.size() + " Integers.");

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.print(n + " ");
        }

        int Maxindex = 0;
        for ( int i = 1; i < v.size(); i++ ) 
            if ( v.get(Maxindex) < v.get(i)) Maxindex = i;
        
        System.out.println("\nMaimum value: " + v.get(Maxindex));

        int sum = 0;
        it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }

        System.out.println("sum: " + sum);
        System.out.println("average: " + (double)sum/v.size());

        
    }
}
