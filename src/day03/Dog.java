package day03;

public class Dog extends Animal{
    public Dog() {
        super();
        System.out.println("对象创建成功");
    }



//    public void run() {
//
//        System.out.println("速度100迈");
//    }

    @Override
    public void eat() {
        System.out.println("狗粮");
    }
    public void wang() {
        System.out.println("汪汪汪");
    }
    public void eat(Integer id,String name) {
        System.out.println("狗粮1");
    }
    public void eat(String name,Integer id) {
        System.out.println("狗粮2");
    }
}
