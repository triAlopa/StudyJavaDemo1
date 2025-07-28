public class TestDome {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        String result = ArrayUtil.printArr(arr);
        int avg=ArrayUtil.getAverage(arr);
        System.out.println(result +  avg);
    }
}
