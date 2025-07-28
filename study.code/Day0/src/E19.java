//定义方法实现随机产生一个5位的验证码
//
//验证码格式：
//
// 长度为5
//
// 前四位是大写字母或者小写字母
//
// 最后一位是数字

import java.util.Random;

public class E19 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) (97 + i);
            arr[i + 26] = (char) (65 + i);
        }
        char[] testArr = new char[4];
        String chs = "";
        Random r = new Random();
        for (int i = 0; i < 4; ) {
            int temp = r.nextInt(arr.length);
            boolean flag = contains(testArr, arr[temp]);
            if (!flag) {
                testArr[i] = arr[temp];
                chs += testArr[i];
                i++;
            }
        }
        chs += r.nextInt(10);
        System.out.println(chs);
    }

    public static boolean contains(char[] arr, char a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) return true;
        }
        return false;
    }
}
