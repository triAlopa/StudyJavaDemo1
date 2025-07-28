//一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
//
// 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。

import java.util.Random;

public class E16 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = mixArray(arr);
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i] + "奖品被抽出");
        }
    }

    public static int[] mixArray(int[] arr) {
        int[] brr = new int[arr.length];
        Random r = new Random();
        boolean flag ;
        for (int i = 0; i < brr.length; ) {
            int temp = r.nextInt(arr.length);
            flag = contains(brr, arr[temp]);
            if (!flag) {
                brr[i] = arr[temp];
                i++;
            }

        }
        return brr;
    }

    public static boolean contains(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }
}
