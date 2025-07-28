import java.util.Random;

//创建一个长度为6的整数数组。请编写代码，
// 随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
// 然后计算出数组中所有元素的和并打印。
public class E2 {
    public static void main(String[] args) {
        Random random=new Random();
        int array[]=new int[6];
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(100);
             temp+=array[i];
        }
        System.out.println(temp);
    }
}
