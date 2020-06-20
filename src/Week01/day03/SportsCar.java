package Week01.day03;

public class SportsCar extends Car {
    public SportsCar() {
    }

    public SportsCar(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println("超级跑车");
    }
    public void price(){
        System.out.println("售价100wS");
    }
}
