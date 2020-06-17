package day03;

import java.util.Scanner;

public class HomeWork {
    //打印九九乘法   等腰三角形
    public static void Judge(int side1,int side2,int side3){//判断等腰三角形
        if((side1==side2||side2==side3)&&side1+side2>side3&&side1-side2<side3){
            System.out.println("该三角形是等腰三角形");
        }else{
            System.out.println("该三角形不是等腰三角形");
        }
    }
    public static  void Table(){//九九乘法表
        for(int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        Table();
        Judge(side1,side2,side3);
    }

}
