package PolymorphismDemo1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void keepPet(Animal a,String something){
        if(a instanceof Dog dog){
            System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+dog.getColor()+"颜色的狗");
            System.out.println(dog.getAge()+"岁的"+dog.getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
        }else if(a instanceof Cat cat){
            System.out.println("年龄为"+this.getAge()+"的"+this.getName()+"养了一只"+cat.getColor()+"颜色的猫");
            System.out.println(cat.getAge()+"岁的"+cat.getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
        }
    }
}
