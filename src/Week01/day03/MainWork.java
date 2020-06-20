package Week01.day03;

public class MainWork {
    public static void main(String[] args) {
       /* Animal animal=new Dog();
        ((Dog) animal).wang();
        animal.run();
        animal.eat();
        Dog dog=new Dog();
        dog.eat();
        dog.run();
        Cat cat=new Cat();
        cat.eat();*/
        /*Student student=new Student();
        student.setName("zs");
        Student student1=new Student();
            student1.setName("ls");
        System.out.println(student1.getName());
        Student stu1=new Student();
        Student stu2 = new Student();
        Student stu3 = stu2;*/
       /* int[] a = new int[5];
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = {3, 4, 6, 7};
        int[] arr = {45, 25, 31, 69, 45, 33, 17};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //选择排序
        for (int i = 0; i < arr.length; i++){
            for (int j=i; j < arr.length; j++){
               if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int[] arr2 = {45, 25, 31, 69, 45, 33, 17};
        //冒泡排序
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));*/
    /*    int firstEnglish, lastEnglish;
        char firstE = 'A', lastE = 'Z';      //获取首字母与末字母的值bai

        firstEnglish = (int) firstE;
        lastEnglish = (int) lastE;

        System.out.println("英文du大写字母表： ");
        for (int i = firstEnglish; i <= lastEnglish; ++i) {
            char uppercase, lowercase;

            uppercase = (char) i;
            lowercase = (char) (i + 32);

            System.out.print(" " + uppercase + lowercase);
        }

        System.out.println();
        char[] letters = new char[26];
        letters[0] = 'A';
        int first = (int) letters[0];
        for (int i = 1; i < letters.length; i++) {
            ++first;
            letters[i] = (char) first;
        }
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
*/
        System.out.println( Math.random());
    }
}
