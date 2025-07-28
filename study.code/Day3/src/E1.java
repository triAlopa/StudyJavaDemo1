import java.util.ArrayList;

public class E1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        String str=list.remove(0);
        System.out.println(str);

        list.set(0,"fff");
        System.out.println(list);
    }
}
