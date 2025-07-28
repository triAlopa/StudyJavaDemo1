package workDemo;

public class StudentLeader extends Student {
    private String Job;

    public StudentLeader() {
    }

    public StudentLeader(int age, char gender, String name, String nationality, String school, String stuNumber, String job) {
        super(age, gender, name, nationality, school, stuNumber);
        Job = job;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        this.Job = job;
    }
    public void meeting(){
        System.out.println("学生干部喜欢开会!");
    }
}
