package Inheritance.Person1;

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
        if ( select == "weight") System.out.println("Person:"+weight);
        else if ( select == "age") System.out.println("Person:"+age);
        else if ( select == "height") System.out.println("Person:"+height);
        else if ( select == "name") System.out.println("Person:"+name);
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
        if ( select == "school") System.out.println("Student:"+school);
        else if ( select == "grade") System.out.println("Student:"+grade);
    }
}


class PartTimeStudent extends Student {
    String part;
    public PartTimeStudent(int weight, int age, int height, String name, String school, int grade, String part) {
        super(weight, age, height, name, school, grade);
        this.part = part;

    }
    @Override
    public void show(String select) {
        super.show(select);
        if ( select == "part") System.out.println("PartTimeStudent:"+part);
    }
}

public class InheritancePerson {
    public static void main(String[] args) {
        Person ps = new Person(80, 26, 186, "woody");
        ps.show("weight");
        System.out.println();
        Student st = new Student(80, 26, 186, "woody", "geochangdaesung", 3);
        st.show("weight");
        st.show("school");
        System.out.println();
        PartTimeStudent pts = new PartTimeStudent(80, 26, 186, "woody", "geochangdaesung", 3, "am");
        pts.show("weight");
        pts.show("school");
        pts.show("part");
    }
}
