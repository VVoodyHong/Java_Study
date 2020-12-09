package Inheritance.Person2;

class Person {
    int weight;
    protected int age;
    int height;
    public String name;

    public Person(int weight, int age, int height, String name) {
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void show(String select) {
        if (select.equals("weight")) System.out.println("Person:"+weight);
        else if (select.equals("age")) System.out.println("Person:"+age);
        else if (select.equals("height")) System.out.println("Person:"+height);
        else if (select.equals("name")) System.out.println("Person:"+name);
    }
}

class Student extends Person {
    String school;
    int grade;
    public Student(int weight, int age, int height, String name, String school, int grade) {
        super(weight, age, height, name);
        this.school = school;
        this.grade = grade;
    }
    @Override
    public void show(String select) {
        super.show(select);
        if (select.equals("school")) System.out.println("Student:" + school);
        else if (select.equals("grade")) System.out.println("Student:" + grade);
    }
}

class Researcher extends Person {
    String field;
    public Researcher(int weight, int age, int height, String name, String field) {
        super(weight, age, height, name);
        this.field = field;
    }

    @Override
    public void show(String select) {
        super.show(select);
        if (select.equals("field")) System.out.println("Researcher:"+field);
    }
}

class Professor extends Researcher {
    String belong;
    public Professor(int weight, int age, int height, String name, String field, String belong) {
        super(weight, age, height, name, field);
        this.belong = belong;
    }

    @Override
    public void show(String select) {
        super.show(select);
        if (select.equals("belong")) System.out.println("Professor:"+belong);
    }

}

public class InheritancePerson {
    public static void main(String[] args) {

        Person ps = new Person(80, 26, 186, "woody");
        ps.show("age");
        Student st = new Student(80, 26, 186, "woody", "geochangdaesung", 3);
        st.show("age");
        st.show("school");
        Researcher rc = new Researcher(80, 26, 186, "woody", "Programming");
        rc.show("age");
        rc.show("field");
        Professor pf = new Professor(80, 26, 186, "woody", "Programming", "Pusan");
        pf.show("age");
        pf.show("field");
        pf.show("belong");
    }
}
