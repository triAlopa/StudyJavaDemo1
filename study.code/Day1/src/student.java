//定义数组存储3个学生对象。
//
//​ 学生的属性：学号，姓名，年龄。
//
//​ 要求1：添加的时候需要进行学号的唯一性判断。
//
//​ 要求2：添加完毕之后，遍历所有学生信息。
//
//​ 要求3：通过id删除学生信息
//
//​ 如果存在，则删除，如果不存在，则提示删除失败。
//
//​ 要求4：删除完毕之后，遍历所有学生信息。
//
//​ 要求5：id为2的学生，年龄+1岁
public class student {
    private int id;
    private String name;
    private int age;

    public student() {
    }

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
