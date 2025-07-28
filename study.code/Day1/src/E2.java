public class E2 {
    public static void main(String[] args) {
        Goods[] arr=new Goods[3];
        Goods g1=new Goods(0,"篮球",20,100);
        Goods g2=new Goods(1,"鸡",30,150);
        Goods g3=new Goods(2,"麦克风",50,10);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("id:"+arr[i].getId()+"  name:"+arr[i].getName()+"  price:"+arr[i].getPrice()+"  count:"+arr[i].getCount());
        }
    }
}
