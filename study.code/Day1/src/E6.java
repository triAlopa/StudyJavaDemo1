import java.sql.SQLOutput;

public class E6 {
    public static void main(String[] args) {
        //创建数组对象
        student[] arr = new student[3];
        student s1 = new student(0, "张三", 16);
        student s2 = new student(1, "李四", 18);
//        student s3 = new student(2, "王五", 21);
        //将对象添加到数组里
        arr[0] = s1;
        arr[1] = s2;
//        arr[2] = s3;
        //要求1：再添加一个学生对象，并在添加的时候进行学号唯一判断
        student s4 = new student(3, "zhaoliu", 22);
        //唯一性判断
        //已存在 --- 不用添加
        //不存在 --- 就可以把学生对象添加进数组
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("该id重复，请修改后再添加");
        } else {
            //不存在 --- 就可以把学生对象添加进数组
            //把stu4添加到数组当中
            //判断是否数组存满，1存满：定义一个新数组，长度为旧数组+1
            //2未存满：添加
            int count = getCount(arr);
            if (count == arr.length) {
                //定义一个新数组，长度为旧数组+1
                //创建一个新数组；将老数组对象移至新数组
                student[] newArr = createNewArr(arr);
                //{stu1，stu2，stu3}
                //{stu1，stu2，stu3，null}
                newArr[count] = s4;
                //要求2：添加完毕后，遍历所有学生信息
                studentInfo(newArr);
            } else {
                //没有存满，放到下一个索引位置
                //下个索引就是count
                //要求2：添加完毕后，遍历所有学生信息
                arr[count] = s4;
                studentInfo(arr);
            }
            System.out.println("Add success!");
        }
    }

    //遍历数组打出学生信息
    public static void studentInfo(student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //对数组内对象进行非空判断
            if (arr[i] != null) {
                System.out.print("id：" + arr[i].getId());
                System.out.print(", name:" + arr[i].getName());
                System.out.print(", age:" + arr[i].getAge());
                System.out.println();
            }
        }
    }

    //定义一个新数组，长度为旧数组+1
    //创建一个新数组；将老数组对象移至新数组
    public static student[] createNewArr(student[] arr) {
        student[] newArr = new student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            //进行复制数组对象
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //定义方法数组里有几个元素
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

    public static boolean contains(student[] arr, int v1) {
        for (int i = 0; i < arr.length; i++) {
            student stu = arr[i];
            //获得数组对象中的学生id
            //判断数组里对象是否为空
            if (stu != null) {
                if (stu.getId() == v1) {
                    return true;
                }
            }
        }
        //循环结束表示不存在就返回false
        return false;
    }
}
