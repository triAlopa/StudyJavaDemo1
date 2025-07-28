import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        String result="";
        for (int i = 0; i < list.size(); i++) {
            String str=list.get(i);
            if(i==0) result="["+str+",";
            else if (i==list.size()-1)  result=result+str+"]";
            else result=result+str+",";
        }
        System.out.println(result);
    }
}
