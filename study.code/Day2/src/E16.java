public class E16 {
    public static void main(String[] args) {
        String A = "abcdegf";
        String B = "degabc";
        int count = 0;
        while (count != B.length()) {
            char[] arr = createArr(A);
            String temp = leftMove(arr);
            A = temp;
            count++;
            if (temp.equals(B)) {
                System.out.println("success");
                break;
            }
        }
    }


    public static String leftMove(char[] c) {
        char[] newC = new char[c.length];
        char first = c[0];
        for (int i = 1; i < c.length; i++) {
            newC[i - 1] = c[i];
        }
        newC[newC.length - 1] = first;
        String result = "";
        for (int i = 0; i < newC.length; i++) {
            result = result + newC[i];
        }
        return result;
    }

    public static char[] createArr(String str) {
        char[] c = new char[str.length()];
        for (int i = 0; i < c.length; i++) {
            c[i] = str.charAt(i);
        }
        return c;
    }
}
