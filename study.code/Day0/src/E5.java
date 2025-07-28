import java.util.Scanner;
//有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。要求：把数字放入数组序列中，
// 生成一个新的数组，并且数组的元素依旧是从小到大排列的。
public class E5 {
    public static void main(String[] args) {
        int array[]={12,14,23,45,66,68,70,77,90,91};
        int arr[]=new int[array.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int temp= sc.nextInt();
        int index=0;
        for (int i = 0,j=0; i < array.length;i++,j++) {
            if(temp>=array[i]){
                arr[i]=array[i];
                 index=i+1;
            }
            else {
                arr[i+1]=array[i];
            }
        }
        arr[index]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}