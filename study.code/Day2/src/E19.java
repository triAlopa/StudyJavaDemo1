public class E19 {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "543";
        String result = getNumber(num1, num2);
        System.out.println(result);
    }

    public static String getNumber(String strA, String strB) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < strA.length(); i++) {
            int temp = strA.charAt(i) - 48;
            for (int i1 = 0; i1 < (strA.length() - i - 1); i1++) {
                temp *= 10;
            }
            num1 += temp;
        }
        for (int i = 0; i < strB.length(); i++) {
            int temp = strB.charAt(i) - 48;
            for (int i1 = 0; i1 < (strB.length() - i - 1); i1++) {
                temp *= 10;
            }
            num2 += temp;
        }
        int result = num2 * num1;
        String string = "" + result;
        return string;
    }
}
