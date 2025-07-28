//将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
public class E14 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 2, 6, 8, 9, 3, 7, 4, 3, 2};
        int fromIndex = 3;
        int toIndex = 6;
        int value = 2;
        boolean flag = fill(arr, fromIndex, toIndex, value);
        while (flag) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            flag = false;
        }
    }

    public static boolean fill(int[] arr, int fromIndex, int toIndex, int value) {
        if (fromIndex < 0 || toIndex >= arr.length) {
            System.out.println("error");
            return false;
        }
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return true;
    }
}
