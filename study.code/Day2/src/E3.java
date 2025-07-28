import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            char a= s.charAt(i);
            System.out.println(a);
        }
    }
}
