package Collection.Practice;

import java.util.*;

class Rectangle {
    int x1, y1, x2, y2;
    int width;
    int height;
    int area;

    Rectangle() {
        
        int[] locate = new int[4];

        for (int i = 0; i < 4; i++) {
             Random rand = new Random();
             locate[i] = rand.nextInt(100) + 1;
        }

        x1 = locate[0];
        y1 = locate[1];
        x2 = locate[2];
        y2 = locate[3];

        width = Math.abs(x2 - x1);
        height = Math.abs(y2 - y1);
        area = width * height;

    }
}

public class Practice2 {

    public static void addVector(Vector<Rectangle> vec) {

        for ( int i = 0; i < 10; i++ ) {
            Rectangle rt = new Rectangle();
            vec.add(rt);
        }
    }

    public static void showVector(Vector<Rectangle> vec) {

        Iterator<Rectangle> it = vec.iterator();

        System.out.println("Vector<Rectangle> has:");
        while(it.hasNext()) {
            int n = it.next().area;
            System.out.print(n + " ");
        }
    }

    public static void searchMax(Vector<Rectangle> vec) {

        int Maxindex = 0;
        for ( int i = 1; i < vec.size(); i++ ) 
            if ( vec.get(Maxindex).area < vec.get(i).area) Maxindex = i;
        
        System.out.println("\nMaimum value: " + vec.get(Maxindex).area);
    }

    public static void searchAverage(Vector<Rectangle> vec) {

        Iterator<Rectangle> it = vec.iterator();

        int sum = 0;
        while(it.hasNext()) {
            int n = it.next().area;
            sum += n;
        }
        System.out.println("avarage: " + (double)sum / 10);
    }

    public static void main(String[] args) {

        Vector<Rectangle> v = new Vector<Rectangle>();

        addVector(v);
        showVector(v);
        searchMax(v);
        searchAverage(v);
    }
}
