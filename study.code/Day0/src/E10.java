//数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
// 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
public class E10 {
    public static void main(String[] args) {
        double num=function(2.9);
        System.out.println(num);
    }

    public static double function(double num) {
        if (num < 0) {
            return -num;
        } else return num;
    }
}
