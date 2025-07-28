import java.util.Random;
import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        System.out.println("please Enter String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = randomString(str);
        System.out.println(result);
    }

    public static String randomString(String string) {
        char[] c = string.toCharArray();
        char[] chs = new char[c.length];
        int[] indexNumber=new int[c.length];
        Random r = new Random();
        for (int i = 0; i < c.length; ) {
            int randomIndex = r.nextInt(c.length);
            boolean flag = contains(indexNumber, randomIndex);
            if (!flag) {
                chs[i] = c[randomIndex];
                indexNumber[i]=randomIndex;
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chs.length; i++) {
            sb.append(chs[i]);
        }
        return sb.toString();
    }

    public static boolean contains(int[] arr,int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return true;
        }
        return false;
    }
}
