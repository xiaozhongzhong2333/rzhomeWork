package Week01.day02;

public class TestFile {
    public static void main(String[] args) {
       boolean flag=false;
       if(flag){
           System.out.println("hello");
       }
        del(200);
    }
    public static  void del(int count){
        if(count<60){
            System.out.println("不及格");
        }else if(count>=60&&count<80){
            System.out.println("中等");
        }else if(count>=80&&count<90){
            System.out.println("良好");
        }else if(count>=90&&count<=100){
            System.out.println("优秀");
        }else{
            System.out.println("非法数据");
        }

    }

}
