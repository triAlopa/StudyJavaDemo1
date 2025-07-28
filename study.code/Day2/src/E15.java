import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("输入一段长度小于九的数字:");
             str = sc.next();
            if (str.length() <= 9) {
                boolean flag = verifyNumber(str);
                if (flag) {
                    break;
                }
            }
                System.out.println("存在非法字符或长度大于九");

        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String s=switchNumber(str.charAt(i)-48);
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static String switchNumber(int n){
        String[] arr={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[n];
    }
    public static boolean verifyNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) return false;
        }
        return true;
    }
}
