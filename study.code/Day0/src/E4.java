//定义一个数组来存储10个学生的成绩，
// 例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
public class E4 {
    public static void main(String[] args) {
        int array[]={72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        double avgNum=sum/ array.length;
        System.out.println("平均成绩为："+avgNum);
    }
}
