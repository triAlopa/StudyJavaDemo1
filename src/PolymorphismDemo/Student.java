package PolymorphismDemo;

public class Student extends Person {
    public Student() {
    }

    public Student(int age, String name) {
        super(age, name);
    }
    @Override
    public void show(){
        System.out.println("Student.....show");
    }
    public void funny(){
        System.out.println("play game");
    }

}
