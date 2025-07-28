package workDemo;

public class Student extends Person{
    private String school;
    private String stuNumber;

    public Student() {
        super();
    }

    public Student(String school, String stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(int age, char gender, String name, String nationality, String school, String stuNumber) {
        super(age, gender, name, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }
    //重写work
    @Override
    public void work(){
        System.out.println("学生需要学习!");
    }

}
