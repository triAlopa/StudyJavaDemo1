import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
       while(true){
           Student stu=new Student();
           System.out.println("请输入学生姓名:");
           stu.setName(sc.next());
           System.out.println("请输入学生年龄:");
           stu.setAge(sc.nextInt());
           students.add(stu);
           System.out.println("是否退出添加？1：是");
           String str= sc.next();
           if(str.equals("1")) break;
       }
        for (int i = 0; i < students.size(); i++) {
            System.out.print("name:"+students.get(i).getName()+" ");
            System.out.println("Age:"+students.get(i).getAge()+" ");
        }
    }
}
