package day03;

public class Cat  extends  Animal  {
    public void run() {
        System.out.println("速度80迈");
    }

    @Override
    public void eat() {
        System.out.println("猫粮");
    }
}
