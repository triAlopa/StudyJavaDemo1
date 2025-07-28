public class E20 {
    public static void main(String[] args) {
        String str="hello world";
        int result=getNumber(str);
        System.out.println(result);
    }
    public static int getNumber(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
             char temp=str.charAt(str.length()-i-1);
             String s =temp+"";
            if(s.equals(" ")) break;
            else count++;
        }
        return count;
    }
}
