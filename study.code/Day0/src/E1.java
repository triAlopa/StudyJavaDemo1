import javax.xml.transform.Result;

//请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开
public class E1 {
    public static void main(String[] args) {
       double []array={12.9,53.54,75.0,99.1,5.14,3.14};
       double result=array[0];
       for (int i = 0; i < array.length; i++) {
           result=result<array[i]?result:array[i];
        }
        System.out.println(result);
    }
}
