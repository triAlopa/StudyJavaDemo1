public class E4 {
    public static void main(String[] args) {
        girlFriend g1 = new girlFriend("g1", 15, '女', "唱");
        girlFriend g2 = new girlFriend("g1", 18, '女', "跳");
        girlFriend g3 = new girlFriend("g1", 21, '女', "rap");
        girlFriend g4 = new girlFriend("g1", 25, '女', "篮球");
        girlFriend[] arr = new girlFriend[4];
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println("name:" + arr[i].getName() + " hobby:" + arr[i].getHobby());
                count++;
            }

        }
        System.out.print("一共"+count+"个");
    }

}
