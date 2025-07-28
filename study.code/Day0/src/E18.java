//判断101~200之间有多少个素数，并输出所有素数。
//
//备注：素数就是质数
public class E18 {
    public static void main(String[] args) {
        System.out.println("100~200中素数有：");
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            boolean flag = finNUmber(i);
            while (flag) {
                System.out.print(i + " ");
                count++;
                flag = false;
            }
        }
        System.out.println("共计" + count);
    }

    public static boolean finNUmber(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}
