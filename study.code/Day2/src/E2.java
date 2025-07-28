import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        String userName = "abc";
        String password = "123";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (count != 3) {
            System.out.println("请输入用户名：");
            String user = scanner.next();
            System.out.println("请输入密码");
            String pass = scanner.next();
            count++;
            boolean flag = (userName.equals(user) && (password.equals(pass)));
            if (flag) {
                System.out.println("success");
                break;
            }else {
                if (count==3) System.out.println("您的账户被锁定");
                else   System.out.println("error  ,你还有"+(3-count)+"次机会");
            }

        }
    }
}
