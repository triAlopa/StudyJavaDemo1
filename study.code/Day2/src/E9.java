public class E9 {
    public static void main(String[] args) {
        String idCardNumber = "123123200406170018";
        String year = idCardNumber.substring(6, 10);
        String mouth = idCardNumber.substring(10, 12);
        String day = idCardNumber.substring(12, 14);
        char gender = idCardNumber.charAt(16);
        System.out.println("人物信息为:");
        System.out.println(year + "年" + mouth + "月" + day + "日");
        int num = gender - 48;
        if (num % 2 == 1) {
            System.out.println("性别为:男");
        } else System.out.println("性别为:女");
    }
}
