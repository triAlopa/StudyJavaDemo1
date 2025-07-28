package extendsDemo;

public class Manager extends employer {
    private int managerMoney;

    public Manager() {
        super();
    }

    public Manager(String id,String name,int money,int managerMoney) {
        super(id, money, name);
        this.managerMoney = managerMoney;
    }

    public int getManagerMoney() {
        return managerMoney;
    }

    public void setManagerMoney(int managerMoney) {
        this.managerMoney = managerMoney;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理其他人");
    }
}
