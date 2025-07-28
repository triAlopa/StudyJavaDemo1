import java.util.ArrayList;

public class E5 {
    public static void main(String[] args) {
        ArrayList<User>list=new ArrayList<>();
        User u1=new User(1,"chen","123");
        User u2=new User(2,"hua","456");
        User u3=new User(3,"xin","789");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        int result=contains(list,1);
        System.out.println(result);
    }
    public static int contains(ArrayList<User> list,int id){
        if(list.isEmpty()) return -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id) return i;
        }
        return -1;
    }
}
