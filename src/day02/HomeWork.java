package day02;

import java.util.Scanner;

public class HomeWork {
    public static void Judge(int side1, int side2, int side3) {//判断等腰三角形
        if ((side1 == side2 || side2 == side3) && side1 + side2 > side3 && side1 - side2 < side3) {
            System.out.println("该三角形是等腰三角形");
        } else {
            System.out.println("该三角形不是等腰三角形");
        }
    }

    public static void Table() {//九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println("");
        }
    }

    public static void JudgeTable(int high) {//打印等腰三角形
        for (int i = 1; i <= high; i++) {
            for (int j = i; j <= high; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean JudgePrime(int number) {//判断质数
        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {//证明合数
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void JudgeNumber(int number) {//判断一定范围以内质数的合
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            if (!(JudgePrime(i))) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();*/
        //Table();
        /* Judge(side1,side2,side3);*/
        //  JudgeTable(4);
        JudgeNumber(100);

    }
}
