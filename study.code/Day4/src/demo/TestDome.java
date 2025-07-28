package demo;

import java.util.ArrayList;

public class TestDome {
    public static void main(String[] args) {
        Student s1=new Student("张三",23,"男");
        Student s2=new Student("李四",27,"男");
        Student s3=new Student("王五",25,"男");
        Student s4=new Student("老刘",26,"男");
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
