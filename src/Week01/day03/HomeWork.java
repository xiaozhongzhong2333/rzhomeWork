package Week01.day03;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        int[] ch = new int[odd];
        int[] ch1 = new int[even];
        int m=0;
        int n=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ch[m] = arr[i];
                m++;
            }else {
                ch1[n] = arr[i];
                n++;
            }
        }
//        int[] ch = HomeWork.JudgeOdd(arr);
//        int[] ch1 = HomeWork.JudgeEven(arr);
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));
        generate(ch, ch1);
    }

    private static void generate(int[] arr, int[] arr1) {//交替输出
        if (arr.length < arr1.length) {
            int[] result = new int[arr.length * 2];
            int j = 0;
            for (int i = 0; i < result.length; i = i + 2) {
                result[i] = arr[j];
                j++;
            }
            int k = 0;
            for (int i = 1; i < result.length; i = i + 2) {
                result[i] = arr1[k];
                k++;
            }
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
            for (int i = k; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }
        } else if (arr.length > arr1.length) {
            int[] result = new int[arr1.length * 2];
            int j = 0;
            for (int i = 0; i < result.length; i = i + 2) {
                result[i] = arr[j];
            j++;
        }
        int k = 0;
        for (int i = 1; i < result.length; i = i + 2) {
            result[i] = arr1[k];
            k++;
        }
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
            for (int i = k; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            int[] result = new int[arr1.length * 2];
            int j = 0;
            for (int i = 0; i < result.length; i = i + 2) {
                result[i] = arr[j];
                j++;
            }
            int k = 0;
            for (int i = 1; i < result.length; i = i + 2) {
                result[i] = arr1[k];
                k++;
            }
            System.out.println(Arrays.toString(result));
        }
    }

    /*private static int[] JudgeOdd(int[] arr) {
        int[] ch = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ch[j] = arr[i];
                j++;
            }
        }
        int num = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                num++;
            }
        }
        int[] ch1 = new int[ch.length - num];
        int m = 0;
        for (int k = 0; k < ch.length; k++) {
            if (ch[k] != 0) {
                ch1[m] = ch[k];
                m++;
            }
        }
        return ch1;
    }

    private static int[] JudgeEven(int[] arr) {
        int[] ch = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ch[j] = arr[i];
                j++;
            }
        }
        int num = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                num++;
            }
        }
        int[] ch1 = new int[ch.length - num];
        int m = 0;
        for (int k = 0; k < ch.length; k++) {
            if (ch[k] != 0) {
                ch1[m] = ch[k];
                m++;
            }
        }
        return ch1;
    }*/
}

