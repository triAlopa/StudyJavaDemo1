import java.lang.reflect.AnnotatedArrayType;
import java.util.StringJoiner;

public class E14 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        StringJoiner sj=new StringJoiner(",");
        sj.add("aa").add("bbb");
        System.out.println(sj);
    }
}
