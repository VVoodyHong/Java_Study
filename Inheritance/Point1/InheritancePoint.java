package Inheritance.Point1;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private final String color;

    public ColorPoint(int x, int y, String col) {
        super(x, y);

        this.color = col;
    }
    
    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}

public class InheritancePoint {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        p.showPoint();
        System.out.println();
        ColorPoint cp = new ColorPoint(4, 5, "RED");
        cp.showColorPoint();
    }
}
