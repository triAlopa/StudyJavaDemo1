//键盘录入一个正整数
//
//定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
//
//在main方法中打印该数字是几位数
import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int result=function(number);
        System.out.println(number+" is "+result);
    }
    public static int function(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
