//格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。
//人物的性别和长相，打斗的时候我想看到武功招式。
public class E1 {
    public static void main(String[] args) {
        Role r1=new Role("乔峰",100,'男');
        Role r2=new Role("鸠摩智",100,'男');
        r1.showRoleInfo();
        r2.showRoleInfo();
        while (true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"ko"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"ko"+r1.getName());
                break;
            }
        }
    }
}
