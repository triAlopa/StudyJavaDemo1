package extendsDemo;

public class test {
    public static void main(String[] args) {
        Manager manager=new Manager("123","chen",4000,200);
        cooker cooker=new cooker("1",3000,"hua");
        manager.work();
        manager.eat();
        cooker.work();
        cooker.eat();
    }
}
