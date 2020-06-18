package day03;

/**
 * 猜字符
 * 随机生成5个不重复的英文字母
 * 用户输入5个字母
 * 用户才对几个 位置对的有几个
 */
public class Demo {
    public static void main(String[] args) {
        generate('a', 'b');
    }

    private static void generate(char ch1, char ch2) {
        char[] ch = new char[5];
        for(int i=0;i<5;i++){
            Demo.random(ch1,ch2);
        }
        for(int i=0;i<5;i++){
            System.out.println(ch[i]);
        }

    }

    private static char random(char ch1, char ch2) {
        char ch = (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        return ch;

    }
}
