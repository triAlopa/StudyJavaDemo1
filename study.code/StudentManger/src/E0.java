
import java.nio.file.attribute.AclEntryFlag;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class E0 {
   static   ArrayList<User> userList = new ArrayList<>();
   static {
       User user=new User("chen","123","340322200406170018","15675527862");
       userList.add(user);
   }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<student> list = null;

        Loop:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4退出");
            String next = scanner.next();
            list = new ArrayList<>();
            switch (next) {
                case "1" -> {
                    userLogin(userList);
                    break Loop;
                }
                case "2" -> {
                    registerUser(userList);
                }
                case "3"->{
                    forgetPassword(userList);
                }
                case "4"->{
                    System.exit(0);
                }
                default -> {
                    System.out.println("没有这个选项");
                }
            }
        }
        Loop:
        loop:
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择:");
            String choose = scanner.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("5：退出");
                    //break loop;  
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生  
    public static void addStudent(ArrayList<student> list) {
        Scanner scanner = null;
        student student = null;
        while (true) {
            scanner = new Scanner(System.in);
            student = new student();
            System.out.println("请输入id");
            String id = scanner.next();
            boolean flag = contains(list, id);
            if (flag) System.out.println("id重复");
            else {
                student.setId(id);
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = scanner.next();
        student.setName(name);
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        student.setAge(age);
        System.out.println("请输入家庭住址");
        String homeAddress = scanner.next();
        student.setHomeAddress(homeAddress);
        list.add(student);
        System.out.println("添加成功");
    }

    //删除学生  
    public static void deleteStudent(ArrayList<student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除id");
        String id = scanner.next();
        int index = getIndex(list, id);//获取学生在集合索引，并进行下列判断
        if (index >= 0) {
            list.remove(index);//arraylist方法，移除
            System.out.println("id" + id + "删除成功");
        } else {
            System.out.println("删除失败，id不存在");
        }
    }

    //修改学生  
    public static void updateStudent(ArrayList<student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入修改id");
        String id = scanner.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("修改id不存在");
            return;//按要求，找不到返回主菜单
        } else {
            student student = list.get(index);
            System.out.println("请输入新name");
            String newName = scanner.next();
            student.setName(newName);
            System.out.println("请输入新年龄");
            int newAge = scanner.nextInt();
            student.setAge(newAge);
            System.out.println("请输入新住址");
            String newAddress = scanner.next();
            student.setHomeAddress(newAddress);
            System.out.println("修改成功");
        }
    }

    //查询学生  
    public static void queryStudent(ArrayList<student> list) {
        if (list.isEmpty()) {
            System.out.println("不存在学生");
        } else {
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                student s = list.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getHomeAddress());
            }
        }
    }

    //查找学生id在集合位置，不存在返回-1
    public static int getIndex(ArrayList<student> list, String id) {
        if (list.isEmpty()) return -1;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) return i;
        }
        return -1;
    }

    //校验学生是否存在
    public static boolean contains(ArrayList<student> list, String id) {
        int index = getIndex(list, id);
        if (index == -1) return false;
        else return true;
    }

    //注册方法
    public static void registerUser(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        while (true) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            boolean flag = checkUserName(userName);
            if (flag){
                u.setUserName(userName);
                break;
            }else continue;
        }
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请重复输入密码");
            String password1 = sc.next();
            if (password.equals(password1)) {
                u.setPassword(password);
                System.out.println("密码设置成功");
                break;
            } else System.out.println("密码不一致");
        }
        while (true) {
            System.out.println("请输入身份证号码");
            String identity = sc.next();
            boolean flag = checkPersonID(identity);
            if (flag) {
                System.out.println("身份证设置成功");
                u.setIdentity(identity);
                break;
            } else continue;
        }
        while (true) {
            System.out.println("请输入手机号码");
            String phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                u.setPhoneNumber(phoneNumber);
                userList.add(u);
                System.out.println("用户信息添加成功");
                break;
            }else continue;
        }
    }

    //登录方法
    public static void userLogin(ArrayList<User> userList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            int userIndex = getUserIndex(userList, userName);
            if (userIndex >= 0) {
                System.out.println("请输入密码");
                String password = sc.next();
                boolean equals = userList.get(userIndex).getPassword().equals(password);
                if (equals) {
                    String code = randomCode();
                    System.out.println("你的验证码为" + code);
                    String nextCode = sc.next();
                    if (nextCode.equals(code)) {
                        System.out.println("登陆成功");
                        return;
                    } else System.out.println("验证码错误");
                } else System.out.println("密码错误");
            } else System.out.println("不存在用户名");
        }
    }

    //校验用户名是否重复
    public static boolean containsUser(ArrayList<User> userList, String userName) {
        int userIndex = getUserIndex(userList, userName);
        return userIndex >= 0;
    }

    //寻找用户名所在的集合索引
    public static int getUserIndex(ArrayList<User> userList, String userName) {
        if (userList.isEmpty()) {
            System.out.println("无用户");
            return -1;
        }
        for (int i = 0; i < userList.size(); i++) {
            if (userName.equals(userList.get(i).getUserName())) return i;
        }
        return -1;
    }

    //生成随机验证码规则
    public static String randomCode() {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            arrayList.add((char) ('a' + i));
            arrayList.add((char) ('A' + i));
        }//生成字母集合
        Random r = new Random();
        StringBuilder sb = new StringBuilder();//先添加到容器
        for (int i = 0; i < 4; i++) {
            int tempIndex = r.nextInt(arrayList.size());
            sb.append(arrayList.get(tempIndex));
        }
        int randomNumber = r.nextInt(9);
        sb.append(randomNumber);//添加成功，前四位为字母，后一位为数字
        char[] chs = sb.toString().toCharArray();//生成对应数组
        int tempIndex = r.nextInt(sb.length());//生成一个随机位置和最后一位数字对调位置
        char temp = chs[tempIndex];
        chs[tempIndex] = chs[chs.length - 1];
        chs[chs.length - 1] = temp;
        return new String(chs);
    }

    //校验用户身份证
    public static boolean checkPersonID(String personID) {
        if (personID.length() != 18) {
            System.out.println("长度不为18");
            return false;
        }
        if (personID.charAt(0) == '0') {
            System.out.println("首位不能为0");
        }
        for (int i = 0; i < personID.length() - 1; i++) {
            if (personID.charAt(i) < '0' || personID.charAt(i) > '9') {
                System.out.println(" 前17位，必须都是数字");
                return false;
            }
        }
        char endChar = personID.charAt(personID.length() - 1);
        if (endChar == 'x' || endChar == 'X' || (endChar >= '0' && endChar <= '9')) {
            return true;
        } else {
            System.out.println("最后一位只能是数字，或者是大写X或小写x");
            return false;
        }
    }

    //校验用户手机号
    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            System.out.println("长度不是11位");
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                System.out.println("必须是纯数字");
                return false;
            }
        }
        char start = phoneNumber.charAt(0);
        if (start == '0') {
            System.out.println("第一位不能是0");
            return false;
        } else {
            System.out.println("手机号设置成功");
            return true;
        }
    }

    //校验用户名
    public static boolean checkUserName(String userName){
        if (userName.length()<3||userName.length()>15){
            System.out.println("用户名长度必须在3~15位之间");
            return false;
        }
        int count=0;
        for (int i = 0; i < userName.length(); i++) {
           boolean flag= (userName.charAt(i)>='a'&&userName.charAt(i)<='z')||(userName.charAt(i)>='A'&&userName.charAt(i)<='Z')||(userName.charAt(i)>='1'&&userName.charAt(i)<='9');
            if (!flag) {
                System.out.println("存在非法字符");
                return false;
            }
            if ((userName.charAt(i)>='a'&&userName.charAt(i)<='z')||(userName.charAt(i)>='A'&&userName.charAt(i)<='Z')){
                count++;
            }
        }
        if (count>0) {
            System.out.println("用户名设置成功");
            return true;
        }else {
            System.out.println("只少包含一个字母");
            return false;
        }
    }
    //忘记密码
    public static void forgetPassword(ArrayList<User> list){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入忘记密码的用户名");
        String forgetUserName = scanner.next();
        int userIndex = getUserIndex(list, forgetUserName);
        if (userIndex>=0){
            System.out.println("输入身份证号码");
            String userID = scanner.next();
            boolean equals1 = list.get(userIndex).getIdentity().equals(userID);
            System.out.println("输入手机号码");
            String userPhone = scanner.next();
            boolean equals2 = list.get(userIndex).getPhoneNumber().equals(userPhone);
            if (equals1&&equals2){
                while (true) {
                    System.out.println("请输入密码");
                    String password = scanner.next();
                    System.out.println("请重复输入密码");
                    String password1 = scanner.next();
                    if (password.equals(password1)) {
                        list.get(userIndex).setPassword(password);
                        System.out.println("密码设置成功");
                        break;
                    } else System.out.println("密码不一致");
                }
            }else {
                System.out.println("账号信息不匹配，修改失败。");
            }
        }else {
            System.out.println("未注册");
            return;
        }
    }
}