package Week01.day04;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class DemoString implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        String name="Memory";
       int len=name.length();
        System.out.println(len);*/

/*        String str="  你好，明天，     哈哈   ;    ";
        System.out.println(str.trim());
        System.out.println(str);*/

       /* String str1 = "Hello";
        String str2="World";
        String str3="HelloWorld";
        String str4=str1+str2;
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());*/

       /*String str="中北大学";
        System.out.println(str.charAt(3));*/

      /* String phone="12345678901";//含前不含后
                   //01234567891011
       String p1=phone.substring(0,3);
       String p2=phone.substring(3,7);
       String p3=phone.substring(7,11);
        System.out.println(p1+"-"+p2+"-"+p3);*/

        /*String str = "HelloWorld";
        System.out.println("全大写" + str.toUpperCase());
        System.out.println("全小写" + str.toLowerCase());*/

      /*  String email="24390211351@qq.com";
        int index=email.indexOf("@");
        System.out.println(index);
        //获取qq
        String qq=email.substring(0,email.indexOf("@"));
        System.out.println(qq);
        //获取域名
        String httpName=email.substring(email.indexOf("@"),email.length());
        System.out.println(httpName);*/

      /*  String str = "helloWorld";
        System.out.println(str.lastIndexOf("d"));
        //获取文件后缀
        String fileName="text.mp4.doc.txt";
        String lastName=fileName.substring(fileName.lastIndexOf(".")+1);
        System.out.println(lastName);
        if(fileName.endsWith(".java")){
            System.out.println("源文件");
        }else if (fileName.endsWith(".class")){
            System.out.println("字节码文件");
        }else if (fileName.endsWith(".txt")){
            System.out.println("文本文档");
        }else{
            System.out.println("其他");
        }*/

        /*String str = "去你大爷的";
        System.out.println(str.replace("爷", "*"));*/

        /*String str = "a.c.java.class.nuc.edu.cn";
        String[] arr = str.split("\\.");
        for (String s : arr) {
            System.out.println(s);
        }*/

       /* ArrayList list=new ArrayList();
        //添加元素 默认向尾部添加
        Student stu1=new Student(1,"zs");
        list.add(stu1);
        list.add("zs");
        list.add("ls");
        list.add(new Student());
        System.out.println(list.toString());
        System.out.println(list.contains("ls"));
        System.out.println(list.get(2));
        list.add(2,"w5");
        System.out.println(list.toString());
        System.out.println(list.size());
        list.remove(4);
        System.out.println(list.toString());
        list.remove("w5");
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());*/

       /* LinkedList list=new LinkedList();
        list.addFirst("zs");
        list.addLast("w5");*/
        /*Long startTime=System.currentTimeMillis();
        System.out.println(startTime);
       ArrayList list =new ArrayList();
        Random random=new Random();
        for(int i=0;i<5000;i++){
            list.add(random.nextInt(5000));
        }
        Long endTime=System.currentTimeMillis();
        System.out.println(endTime);
        long result=endTime-startTime;
        System.out.print(result);*/
     /*   HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "zs");
        map.put("2", "ls");
        map.put("3", "w5");
        map.put("1", "l6");
        System.out.println(map.get("1"));
        map.remove("3");
        System.out.println(map.get("3"));
        Set set = map.keySet();
        ArrayList list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(5000));
        }
        Iterator id = set.iterator();
        while (id.hasNext()) {
            System.out.println(id.next());
        }*/

       /* String str = "你好";
        str = "你好，在吗";
        str = "helloWorld";///当我们对字符串频繁的修改时，需要使用StringBuffer和StringBuilder
        StringBuilder sb = new StringBuilder("你好");
        System.out.println(sb);
        sb.append(".世界");
        System.out.println(sb);
        sb.append("哇 youcan dance");
        System.out.println(sb);*/
       /* try {
            InputStream is = new FileInputStream("D:\text.txt");
            OutputStream os = new FileOutputStream("a.txt");
            byte[] bytes = new byte[5];
            os.write(1);
        } catch (Exception e) {
            System.out.println("文件不存在");
        }
*/
      /* OutputStream os=new FileOutputStream("D:\\text.txt");
       os.write(55555);
        File file = new File("D:\\text.txt");
        OutputStream os = new FileOutputStream(file, true);
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            int b = str.charAt(i);
            os.write(b);
        }
        String str2 = "memory";
        byte[] bt = str2.getBytes();
        os.write(bt);
        System.out.println("写入成功");*/
      /*  File file = new File("D:\\text.txt");
        InputStream is = new FileInputStream(file);
        char c=(char)is.read();
        System.out.println(c);

        byte[]  bytes=new byte[10];
        int count=is.read(bytes);
        System.out.println(count);*/
      /*  File file = new File("D:\\text.txt");
        FileOutputStream os = new FileOutputStream(file,true);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        bos.write("dan  woh  all".getBytes());
   //     bos.flush();//缓冲区没满，强制写入。
        bos.close();//关闭流，系统会自动执行flush()方法
        System.out.println("写入文件成功");*/
        /*File file = new File("D:\\text.txt");
        FileInputStream is = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(is);
        int d = -1;
        while ((d = bis.read()) != -1) {
            char c =(char)d;
            System.out.println(d);
        }
        bis.close();
        byte[] bytes = new byte[10];
        int count=bis.read(bytes);
        System.out.println(count);*/
        File file = new File("D:\\text.txt");
       /* FileOutputStream os=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(os);
        Student stu=new Student(1,"zs");
        oos.writeObject(stu);
        System.out.println("序列化完毕");
        oos.close();*/
        /*FileInputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Student student = (Student) ois.readObject();
        System.out.println(student);
        ois.close();*/
        /*FileInputStream is = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        int chs = -1;
        while ((chs = is.read()) != -1) {
            System.out.println((char) chs);
        }
        byte[] ch = new byte[5];
        is.read(ch);
        System.out.println(ch.toString());
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        isr.close();
        ;*/
       /* FileOutputStream os = new FileOutputStream(file, true);
        OutputStreamWriter osw = new OutputStreamWriter(os, "Utf-8");
//        osw.write("我愛你");
//        osw.close();
        PrintWriter pw = new PrintWriter(osw,true);
        pw.println("gogogo");
        pw.println("哦累哦累哦累");
        pw.close();*/
      /*  FileInputStream os = new FileInputStream(file);
        InputStreamReader osw = new InputStreamReader(os);
        BufferedReader br = new BufferedReader(osw);
        String str=br.readLine();
        System.out.println(str);
        br.close();*/
        low(100,10);
    }

   final private static void low(double high,int count) {
        double sum=0;
        int i=0;
        while(high>0&&i<count){
            sum+=high;
            high=high/2;
            sum+=high;
            i++;
        }
        System.out.println("此时经过了："+sum);
        System.out.println("此时高度："+high);
    }
}

