public class E10 {
    public static void main(String[] args) {
        //1.获取到说到的话
        String talk="hello,fuck,tmd,TMD";
        //2.建立一个获取脏话的数组
        String[] arr={"TMD","tmd","fuck"};
        //遍历替换所有脏话
        for (int i = 0; i < arr.length; i++) {
            talk= talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
