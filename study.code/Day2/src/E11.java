import java.util.AbstractCollection;
//链式编程；方法返回的类型可以调用属于它类型的方法
public class E11 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        System.out.println(sb);
        int len =sb.reverse().append("abc").length();
        System.out.println(sb);
        String s=sb.toString();
        System.out.println(len);
    }
}
