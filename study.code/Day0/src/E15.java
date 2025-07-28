//将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
//
//并将新数组返回。
public class E15 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 4, 8, 6, 9};
        int from = 0;
        int to = 3;
        int[] brr = copyOfRange(arr, from, to);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        for (int i = from; i < to; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
