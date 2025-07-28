//定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class E8 {
    public static void main(String[] args) {
        int max=getMax(4,2,3);
        System.out.println(max);
    }

    public static int getMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int result = temp > c ? temp : c;
        return result;
    }
}
