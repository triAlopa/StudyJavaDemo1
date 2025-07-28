
public class ArrayUtil {
    private ArrayUtil(){

    }

    //返回数组的表达形式（字符串类型
    public static String printArr(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length-1 ; i++) {
                sb.append(arr[i]+", ");
        }
        sb.append(arr[arr.length-1]+"]");
        return sb.toString();
    }
    //计算一个整型数组的平均值
    public static int getAverage(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/ arr.length;
    }
}
