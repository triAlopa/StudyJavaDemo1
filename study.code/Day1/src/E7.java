public class E7 {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。

        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/


        //1.创建一个长度为3的数组
        student[] arr = new student[3];

        //2.创建学生对象
        student s1 = new student(0, "张三", 16);
        student s2 = new student(1, "李四", 18);
//        student s3 = new student(2, "王五", 21);

        //3.把学生对象添加到数组当中
        arr[0] = s1;
        arr[1] = s2;
//        arr[2] = s3;

        //4.再次创建一个学生对象
        student s4 = new student(2, "老刘", 21);

        //5.唯一性判断
        boolean flag = contains(arr, s4.getId());
        //5.1 已存在 --- 提示重复
        if (flag) {
            System.out.println("该id重复，请修改后添加“");
        }
        //5.2 不存在 --- 添加学生对象
        //6.添加学生对象
        else {
            int count=getCount(arr);
            if(count== arr.length){
                student[] newArr=createNewArr(arr);
                newArr[count]=s4;
                studentInfo(newArr);
            }else {
                arr[count]=s4;
                studentInfo(arr);
            }
        }


        //6.1 老数组已经存满
        //6.2 老数组没有存满
    }

    public static void studentInfo(student[] arr){
        for (int i = 0; i < arr.length; i++) {
            student stu=arr[i];
            System.out.print("id:"+stu.getId());
            System.out.print(", name:"+stu.getName());
            System.out.print(", age:"+stu.getAge());
            System.out.println();
        }
    }

    public static student[] createNewArr(student[] arr){
        student[] newArr=new student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }


    public static int getCount(student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if (stu != null) {
                count++;
            }
        }
        return count;
    }


    //5.唯一性判断
    public static boolean contains(student[] arr, int v1) {
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == v1) {
                    return true;
                }
            }
        }
        return false;
    }
}
