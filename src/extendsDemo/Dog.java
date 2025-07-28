package extendsDemo;

public class Dog {
    public void eat() {
        System.out.println("吃狗粮");
    }

    public void drink() {
        System.out.println("drink");
    }

    public void work() {
        System.out.println("look home");
    }
}

class haDog extends Dog {
    public void funny() {
        System.out.println("正在拆家");
    }
}

class shaPiDog extends Dog{
    @Override
    public void eat() {
        System.out.println("吃狗粮"+",吃骨头");
    }
}
class zhongHuaDog extends  Dog{
    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }
}
