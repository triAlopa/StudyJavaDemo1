public class E5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s=toString(arr);
        System.out.println(s);
    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 1) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++){
            if(i== arr.length-1){
                result = result+arr[i];
            }else {
                result=result+arr[i]+ ",";
            }
        }
        result+="]";
        return result;
    }
}
