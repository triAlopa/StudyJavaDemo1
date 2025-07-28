
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        student[] arr = new student[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            student s = new student();
            System.out.println("请输入学号:");
            s.setId(sc.nextInt());
            boolean flag = contains(arr, s.getId());
            if (flag) {
                System.out.println("该学号重复");
            } else {
                System.out.println("请输入性别:");
                s.setName(sc.next());
                System.out.println("请输入年龄");
                s.setAge(sc.nextInt());
                arr[i] = s;
                i++;
            }
        }
        while (true) {
            System.out.println("是否删除某个学生信息？");
            System.out.println("1：是  2：否");
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("请输入该学生学号：");
                    deleteStudent(arr, sc.nextInt());
                    System.out.println("是否继续删除某个学生信息？");
                    System.out.println("1：是  2：否");
                    switch (sc.nextInt()) {
                        case 1: {
                            deleteStudent(arr, sc.nextInt());
                        }
                        case 2:
                            break;
                        default:
                            break;
                    }
                }
                default:
                    break;
            }
            break;
        }
        while (true) {
            System.out.println("是否查询某个学生信息？");
            System.out.println("1：是  2：否");
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("请输入该学生学号：");
                    studentInfo(arr, sc.nextInt());
                    System.out.println("是否继续查询某个学生信息？");
                    System.out.println("1：是  2：否");
                    switch (sc.nextInt()) {
                        case 1: {
                            studentInfo(arr, sc.nextInt());
                        }
                        case 2:
                            break;
//                        default:
//                            break;
                    }
                }
                default:
                    break;
            }
            break;
        }
        for (int i = 0; i < arr.length; i++) {
            studentInfo(arr, i);
        }
    }


    public static void studentInfo(student[] arr, int value) {
        boolean flag = contains(arr, value);
        if (arr[value].getId() == 2) {
            int temp = arr[value].getAge();
            temp++;
            arr[value].setAge(temp);
        }
        if (flag) {
            student stu = arr[value];
            if (stu != null) {
                System.out.println("id:" + arr[value].getId());
                System.out.println(" name:" + arr[value].getName());
                System.out.println(" age:" + arr[value].getAge());
            }
        } else System.out.println("该学号不存在");

    }

    public static void deleteStudent(student[] arr, int value) {
        boolean flag = contains(arr, value);
        if (flag) {
            arr[value] = new student();
        } else System.out.println("该学号不存在");
    }

    public static boolean contains(student[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if (stu != null) {
                int id = stu.getId();
                if (id == value) return true;
            }
        }
        return false;
    }
}
