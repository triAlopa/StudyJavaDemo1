// 比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
public class E12 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int brr[]={1,2,3,4};
        boolean flag=equals(arr,brr);
        if (flag==true) System.out.println("true");
        else System.out.println("false");
    }
    public static boolean equals(int arr[], int brr[]) {
        if (arr.length == brr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != brr[i]) return false;
            }
        } else return false;
        return true;
    }
}
