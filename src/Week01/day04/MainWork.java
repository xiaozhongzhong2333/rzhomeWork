package Week01.day04;

public class MainWork {
    public static void main(String[] args) {
//        Student student=new Student();
//        System.out.println(student);
//        System.out.println(student.toString());
//        Student stu1=new Student();
        Student stu2=new Student();
//        Student stu3=stu2;
//        System.out.println(stu1.equals(stu2));
//        System.out.println(stu1==stu2);
//        System.out.println(stu3.equals(stu2));
//        System.out.println(stu2==stu3);
        String a="abc";
       // System.out.println(a.hashCode());
        String b="abc";
    //    System.out.println(b.hashCode());
        String c="a"+"bc";
        System.out.println(b==c);
        System.out.println(c.hashCode());
        String k=new String("ab");
        String l=k+"c";
        System.out.println(k.hashCode());
        System.out.println(l.hashCode());
        System.out.println("a==b:"+(a==b));
        System.out.println("b==c:"+(b==c));
        System.out.println("c==l:"+(c==l));

    }
}
