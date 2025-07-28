//将数组arr中的所有元素的值改为value
public class E13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int value = 9;
        fill(arr, value);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
