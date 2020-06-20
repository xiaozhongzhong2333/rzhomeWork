package Week01.day02;

/**
 * 自定义异常步骤
 * 1.继承Exception或者RuntimeException
 * 2.定义构造方法
 */
public class PasswordError extends RuntimeException{//自定义异常类
    public PasswordError(){
    }
    public PasswordError(String message){
        super(message);
    }
}
