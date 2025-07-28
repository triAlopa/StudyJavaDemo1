import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("In put：");
        toString(sc.next());
    }
    public static void toString(String s){
        String result="";
        for (int i = 0; i <s.length(); i++) {
            result=result+s.charAt(s.length()-i-1);
        }
        System.out.println(result);
    }
}
