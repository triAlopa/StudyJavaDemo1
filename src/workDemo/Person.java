package workDemo;

public class Person {
    private String name;
    private char gender;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(int age, char gender, String name, String nationality) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void work(){
        System.out.println("working");
    }
}
