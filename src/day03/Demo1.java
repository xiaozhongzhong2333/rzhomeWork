package day03;

import sun.security.pkcs11.wrapper.CK_SSL3_KEY_MAT_OUT;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        char[] ch1=generate();
        System.out.println(Arrays.toString(ch1));
        char[] ch = new char[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(ch));
        int[] result = match(ch,ch1);
        System.out.println("相同的有：" + result[0] + "个，位置相同的有：" + result[1] + "个。");
    }

    private static int[] match(char[] ch, char[] ch1) {//ch为输入  ch1为系统字母
        System.out.println(Arrays.toString(ch));
        int[] result = new int[2];//result[0]用于存放有多少相同的 result[1]用于存放位置有多少一样的
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch1.length; j++) {
                if (ch[i] == ch1[j]) {
                    result[0]++;
                    if (i == j) {
                        result[1]++;
                    }
                    break;
                }
            }
        }
        return result;
    }

    private static char[] generate() {
        char[] ch = new char[5];
        char[] letters = new char[26];
        letters[0] = 'A';
        int first = (int) letters[0];
        for (int i = 1; i < letters.length; i++) {
            ++first;
            letters[i] = (char) first;
        }
        int index = 0;
        boolean[] flag = new boolean[letters.length];
        Random random = new Random();
        for (int i = 0; i < ch.length; i++) {
            do {
                index = random.nextInt(26);
            } while (flag[index]);
            ch[i] = letters[index];
            flag[index] = true;
        }
        return ch;
    }
}
