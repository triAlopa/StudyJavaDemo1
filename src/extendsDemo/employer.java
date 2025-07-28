package extendsDemo;



public class employer {
    private String id;
    private String name;
    private int money;

    public employer() {
    }

    public employer(String id, int money, String name) {
        this.id = id;
        this.money = money;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){

    }
    public void eat(){
        System.out.println("吃米饭");
    }
}
