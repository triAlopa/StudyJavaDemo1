import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        System.out.println("-------------欢迎来到黑马学生管理系统----------------");
        Scanner sc = new Scanner(System.in);
        ArrayList<student> stuList = new ArrayList<>();
        while (true) {
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    while (true) {
                        student stu = addStudentInfo(stuList);
                        stuList.add(stu);
                        System.out.println("添加成功！是否继续添加？");
                        System.out.println("1.添加");
                        String next = sc.next();
                        if (!next.equals("1")) break;
                    }
                    break;
                }
                case 2: {
                    deleteStudentInfo(stuList);
                    break;
                }
                case 3: {
                    settingStudentInfo(stuList);
                    break;
                }
                case 4: {
                    while (true) {
                        selectStudentInfo(stuList);
                        System.out.println("是否继续查询？");
                        System.out.println("1.查询");
                        String next = sc.next();
                        if (!next.equals("1")) break;
                    }
                }
                default:
                    break;
            }
            if (choice >= 5) break;
        }
    }

    public static student addStudentInfo(ArrayList<student> stuList) {
        student stu = new student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id:");
            String tampId = sc.next();
            stu.setId(tampId);
            boolean flag = contains(stuList, tampId);
            if (!flag) {
                System.out.println("请输入学生姓名:");
                stu.setName(sc.next());
                while (true) {
                    System.out.println("请输入学生年龄:");
                    int tempAge = sc.nextInt();
                    if (tempAge >= 1 && tempAge <= 100) {
                        stu.setAge(tempAge);
                        break;
                    } else System.out.println("年龄超出正常范围，请重新输入:");
                }
                System.out.println("请输入学生家庭住址:");
                stu.setHomeAddress(sc.next());
                break;
            } else {
                System.out.println("输入id重复，请重新添加:");
            }
        }
        return stu;
    }

    public static void deleteStudentInfo(ArrayList<student> stuList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生的学号:");
        String nextId = sc.next();
        int index = getIndex(stuList, nextId);
        if (index != -1) {
            stuList.remove(index);
            System.out.println(nextId + "学号的学生已删除");
        } else System.out.println("学号不存在！");
    }

    public static void settingStudentInfo(ArrayList<student> stuList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的学号:");
        String nextId = sc.next();
        int index = getIndex(stuList, nextId);
        if (index != -1) {
            while (true) {
                System.out.println("请选择修改该" + index + "学生的信息");
                System.out.println("1.姓名");
                System.out.println("2.年龄");
                System.out.println("3.家庭住址");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("请输入修改后的名字");
                        String nextName = sc.next();
                        stuList.get(index).setName(nextName);
                        break;
                    }
                    case 2: {
                        System.out.println("请输入修改后的年龄");
                        int nextAge = sc.nextInt();
                        stuList.get(index).setAge(nextAge);
                        break;
                    }
                    case 3: {
                        System.out.println("请输入修改后的家庭住址");
                        String nextHomeAddress = sc.next();
                        stuList.get(index).setHomeAddress(nextHomeAddress);
                        break;
                    }
                    default: break;
                }
                System.out.println("修改成功！是否继续修改此学生信息？");
                System.out.println("1.修改");
                String next = sc.next();
                if (!next.equals("1")) break;
            }
        }else System.out.println("学号不存在");
    }

    public static void selectStudentInfo(ArrayList<student> stuList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询学生的学号:");
        String nextId = sc.next();
        int index = getIndex(stuList, nextId);
        if (index != -1) {
            System.out.print("name:" + stuList.get(index).getName());
            System.out.print(",Age:" + stuList.get(index).getAge());
            System.out.println(",homeAddress:" + stuList.get(index).getHomeAddress());
        } else System.out.println("学号不存在！");
    }

    public static boolean contains(ArrayList<student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<student> stuList, String id) {
        if (stuList.isEmpty()) return -1;
        for (int i = 0; i < stuList.size(); i++) {
            student stu = stuList.get(i);
            if (stu.getId().equals(id)) return i;
        }
        return -1;
    }
}
