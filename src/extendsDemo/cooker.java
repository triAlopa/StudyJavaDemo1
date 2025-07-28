package extendsDemo;

public class cooker extends employer{
    public cooker() {
    }

    public cooker(String id, int money, String name) {
        super(id, money, name);
    }
    @Override
    public void work(){
        System.out.println("正在炒菜");
    }
}
