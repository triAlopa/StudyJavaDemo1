public class E17 {
    public static void main(String[] args) {
        String strA="abcde";
        String strB="deabc";
        for (int i = 0; i < strB.length(); i++) {
            strA=leftMoveString(strA);
            if (strB.equals(strA)){
                System.out.println("success");
                break;
            }
        }
    }
    public static String leftMoveString(String str){
        StringBuilder sb=new StringBuilder();
        String start=str.substring(0,1);
        String end=str.substring(1);
        sb.append(end).append(start);
        return sb.toString();
    }
}
