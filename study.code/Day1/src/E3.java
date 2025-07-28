import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入车的品牌:");
            c.setBand(sc.next());
            System.out.println("请输入车的价格:");
            c.setPrice(sc.nextDouble());
            System.out.println("请输入车的颜色:");
            c.setColor(sc.next());
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("品牌:" + arr[i].getBand() + " 价格:" + arr[i].getPrice() + " 颜色:" + arr[i].getColor());
        }
    }
}
