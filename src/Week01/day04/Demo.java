package Week01.day04;

public class Demo {
    public int add(int a,int b){
        try{
            return a+b;
        }catch(Exception e){
            System.out.print("catch 语句块 ");
        }finally{
            System.out.print("finally 语句块 ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("和是："+demo.add(9,34));
    }
}

