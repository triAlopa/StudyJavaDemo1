//机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
//
//​ 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please Input your price:");
        int price= sc.nextInt();
        System.out.println("please enter your Grade:1头等舱，2经济舱");
        int Grade=sc.nextInt();
        System.out.println("mouth:");
        int mouth= sc.nextInt();
        switch (Grade){
            case 1:{
                ticketPrice(mouth,price,0.9,0.7);
                break;
            }
            case 2:{
                ticketPrice(mouth,price,0.85,0.65);
                break;
            }
            default:
                System.out.println("error!");
        }
    }
    public static void ticketPrice(int mouth,double price,double v1,double v2){
        if (mouth>=5&&mouth<=10){
            price*=v1;
            System.out.println("你的票价:"+price);
        }
        else if ((mouth>=1&&mouth<=4)||(mouth>=11&&mouth<=12)){
            price*=v1;
            System.out.println("你的票价:"+price);
        }
        else System.out.println("error!  ");
    }
}
