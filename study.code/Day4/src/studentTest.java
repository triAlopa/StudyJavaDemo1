public class studentTest {
    public static void main(String[] args) {
        Student.teacherName="lbw";
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setSex("男");
        s1.study();
        s1.show();

        Student s2=new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setSex("女");
        s2.show();
    }
}
