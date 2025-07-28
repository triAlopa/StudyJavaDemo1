import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        String s1 = "abc";
//        String s2 = new String("Abc");
//        boolean flag = s1.equalsIgnoreCase(s2);
//        System.out.println(flag);
        Scanner sc=new Scanner(System.in);
        String s2=sc.next();
        boolean flag=(s2.equalsIgnoreCase(s1));
        System.out.println(flag);
    }
}
