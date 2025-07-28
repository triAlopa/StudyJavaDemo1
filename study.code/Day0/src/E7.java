//定义一个方法，
// 该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class E7 {
    public static void main(String[] args) {
        double result=getMin(1.4,2.5);
        System.out.println(result);
    }

    public static double getMin(double a, double b) {
        if (a > b) return b;
        else return a;
    }
}
