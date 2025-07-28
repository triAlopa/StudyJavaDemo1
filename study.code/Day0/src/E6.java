//定义一个数组其中包含多个数字。用自己的方式最终实现，
// 奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
public class E6 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int brr[]=new int [array.length];
        int left =0,right= array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                brr[left]=array[i];
                left++;
            }
            else{
                brr[right]=array[i];
                right--;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
