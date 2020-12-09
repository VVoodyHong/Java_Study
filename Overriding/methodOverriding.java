package Overriding;

class Shape {
    protected int num;
    public Shape next;
    public Shape() { next = null;};

    public void draw() {
        System.out.println("Shape");
    }

    public void viewall() {
        Shape temp = this;
        while ( temp.next != null) {
            temp.draw();
            temp = temp.next;
        }
        temp.draw();
    }
}

class Line extends Shape {

    public Line(int num) {
        this.num = num;
    }
    public Line(int num, Shape next) {
        this.num = num;
        this.next = next;
    }
    @Override
    public void draw() {
        System.out.println("Line"+num);
    }
}

class Rect extends Shape {
    public Rect(int num) {
        this.num = num;
    }
    public Rect(int num, Shape next) {
        this.num = num;
        this.next = next;
    }
    @Override
    public void draw() {
        System.out.println("Rect"+num);
    }
}

class Circle extends Shape {
    public Circle(int num) {
        this.num = num;
    }
    public Circle(int num, Shape next) {
        this.num = num;
        this.next = next;
    }
    @Override
    public void draw() {
        System.out.println("Circle"+num);
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Line l1 = new Line(1);
        Rect r1 = new Rect(2, l1);
        Circle c1 = new Circle(3, r1);
        Line l2 = new Line(4, c1);
        Rect r2 = new Rect(5, l2);
        Circle c2 = new Circle(6, r2);

        c2.viewall();

    }
}
