import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入:");
        String str= sc.next();
        StringBuilder sb=new StringBuilder(str);
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("true");
        }else System.out.println("false");
    }
}
