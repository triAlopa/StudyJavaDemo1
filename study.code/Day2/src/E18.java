import java.util.Random;

public class E18 {
    public static void main(String[] args) {
        char[] arr = createCharArr();
        String result = toString(arr);
        System.out.println(result);
    }

    public static String toString(char[] arr) {
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += arr[r.nextInt(arr.length)];
        }
        result+=r.nextInt(10);
        int randomIndex=r.nextInt(result.length());
        char temp=result.charAt(randomIndex);
         result=result.replace(temp,result.charAt(result.length()-1));
         result=result.replace(result.charAt(result.length()-1),temp);
        return result;
    }

    public static char[] createCharArr() {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char) (97 + i);
            } else arr[i] = (char) (65 + i - 26);
        }
        return arr;
    }
}

