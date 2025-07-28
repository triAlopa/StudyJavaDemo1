import java.sql.SQLOutput;
import java.util.Scanner;

//在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please three number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        method(number1, number2, number3);
    }

    public static void method(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        int Temp = a < b ? a : b;
        int min = Temp < c ? Temp : c;
        int middle = a + b + c - max - min;
        System.out.println(max + " " + middle + " " + min);
    }

}
