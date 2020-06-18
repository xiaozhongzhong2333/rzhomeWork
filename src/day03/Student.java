package day03;

public class Student {
    private static  Integer id;
    private static String name;
    private static Integer age;
    {
        System.out.println("这是构造代码快");
    }
    static {
        System.out.println("这是静态代码快");
    }
    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public static  void run(){//加上static不报错

    }
    public static void say(){
        run();
    }
}
