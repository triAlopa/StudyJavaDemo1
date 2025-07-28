import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int Char = 0;
        int charr = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <= 90 && c >= 65) {
                Char++;
            } else if (c <= 122 && c >= 97) {
                charr++;
            } else n++;
        }
        System.out.println("有" + Char + "个大写字母 ，有" + charr + "个小写字母， 有" + n + "数字");
    }
}
