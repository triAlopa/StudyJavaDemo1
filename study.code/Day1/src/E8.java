import com.sun.jdi.Value;

public class E8 {
    public static void main(String[] args) {
        student[] arr = new student[3];
        student s1 = new student(0, "张三", 16);
        student s2 = new student(2, "李四", 18);
        student s3 = new student(1, "王五", 21);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        int index=getIndex(arr,2);
//        if(index>=0){
//          arr[index]=null;
//            System.out.println("删除成功");
//            studentInfo(arr);
//        }else System.out.println("不存在！");
        if(index!=-1){
            int temp=arr[index].getAge();
            temp++;
            arr[index].setAge(temp);
            studentInfo(arr);
        }else System.out.println("不存在id为2的学生");

    }

    public static void studentInfo(student[] arr){
        for (int i = 0; i < arr.length; i++) {
            student stu=arr[i];
            if(stu!=null){
                System.out.print("id:"+stu.getId());
                System.out.print(", name:"+stu.getName());
                System.out.print(", age:"+stu.getAge());
                System.out.println();
            }
        }
    }

    //找到id在数组里的索引
    public static int getIndex(student[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == value) {
                    return i;
                }
            }
        }
        return -1;
    }
}