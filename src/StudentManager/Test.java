import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String s = randomCode();
        System.out.println(s);
    }
    public static String randomCode(){
        ArrayList<Character> arrayList=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            arrayList.add((char)('a'+i));
            arrayList.add((char)('A'+i));
        }
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int tempIndex = r.nextInt(arrayList.size());
            sb.append(arrayList.get(tempIndex));
        }
        int randomNumber = r.nextInt(9);
        sb.append(randomNumber);
        char[] chs = sb.toString().toCharArray();
        int tempIndex = r.nextInt(sb.length());
        char temp=chs[tempIndex];
        chs[tempIndex]=chs[chs.length-1];
        chs[chs.length-1]=temp;
        return new String(chs);
    }
}
