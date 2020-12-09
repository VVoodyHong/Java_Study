package Inheritance.Point2;

class Point {
    int x;
    int y;

    public Point() {
        this.x = this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }

    @Override
    public void showPoint() {
        super.showPoint();
        System.out.println(color);
    }

    public void set(int x, int y, String color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}

public class InheritancePoint {
    public static void main(String[] args) {
        Point pt = new Point();
        pt.showPoint();
        System.out.println();
        ColorPoint cp = new ColorPoint(5, 6, "blue");
        cp.showPoint();
        System.out.println();
        cp.set(3, 1, "red");
        cp.showPoint();

    }
}
