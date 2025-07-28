public class E13 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        int[] arr={1,2,3};
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                sb.append(arr[i]).append("]");
                break;
            }
            sb.append(arr[i]).append(",");
        }
        System.out.println(sb);
    }
}
