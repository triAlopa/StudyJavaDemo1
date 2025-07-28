import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额:");
        int number = sc.nextInt();
        while (true) {
            if (number >= 0 && number <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        String result = "";
        while (true) {
            int ge = number % 10;
            String str = getCapitalNumber(ge);
            number /= 10;
            result = str + result;
            if (number == 0) {
                break;
            }
        }
        int count=7-result.length();
        for (int i = 0; i < count; i++) {
            result="零"+result;
        }
        String moneyStr="";
        for (int i = 0; i < result.length(); i++) {
            moneyStr=moneyStr+result.charAt(i)+switchNumber(result.length()-1-i);
        }
        System.out.println(moneyStr);
    }

    public static String switchNumber(int number){
        String[] str={"","拾","佰","仟","万","拾","佰",};
        return str[number];
    }

    public static String getCapitalNumber(int number) {
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return str[number];
    }

}

