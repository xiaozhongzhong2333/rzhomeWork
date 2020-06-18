package day03;

public class Animal extends  Object{
    private String name;
    private String sex;

    public Animal() {
        System.out.println("动物创建成功");
    }

    public void run() {
        System.out.println("runrunrun");
    }

    public void eat() {
        System.out.println("eateateat");

    }
}
