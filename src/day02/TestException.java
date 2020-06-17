package day02;

public class TestException {
    public static void division(int a, int b) throws Exception {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            throw  new Exception("除数不为0");
        }
    }
    final static  void das(){
        
    }
    public static void main(String[] args) {
        try {
            division(2, 1);
            System.out.println("无错误");
        } catch (ArithmeticException e) {
            e.getMessage();
            System.out.println("分母不能为0");
        } catch (Exception e) {
            e.getMessage();
            System.out.println("出现异常");
        } finally {
            System.out.println("程序运行结束");
        }
    }
}
