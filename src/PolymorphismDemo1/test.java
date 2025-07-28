package PolymorphismDemo1;

public class test {
    public static void main(String[] args) {
        Animal animal1=new Cat(3,"灰");
        Animal animal2=new Dog(2,"黑");
        Person p1=new Person(30,"老王");
        Person p2=new Person(25,"老李");
        p1.keepPet(animal1,"鱼");
        p2.keepPet(animal2,"骨头");
    }
}
