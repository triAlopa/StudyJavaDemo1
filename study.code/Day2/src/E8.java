import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String phoneNumber="";
        while (true){
            System.out.println("请输入一个合法的11位电话号码");
            phoneNumber= sc.next();
            if (phoneNumber.length()==11) break;
            else System.out.println("号码无效");
        }
        //获取前三位
        String start=phoneNumber.substring(0,3);
        //获取后四位
        String end=phoneNumber.substring(7);
        //拼接中间加密四位
        String result=start+"****"+end;
        System.out.println(result);
    }
}
