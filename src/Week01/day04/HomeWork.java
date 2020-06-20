package Week01.day04;

import java.io.*;

public class HomeWork {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file1 = new File("D:\\a.txt");
        File file2 = new File("D:\\b.txt");
        FileCopy(file1,file2);
    }

    public static void FileCopy(File file1,File file2) throws IOException, FileNotFoundException {
        FileInputStream os = new FileInputStream(file1);//字节
        InputStreamReader osr = new InputStreamReader(os);//字符
        BufferedReader br = new BufferedReader(osr);//缓冲字符
        int i = 0;

      System.out.println(br.readLine());
       while (br.read()!=-1) {
           String str=br.readLine();
           System.out.println(str);
           FileCopy2(file2,str);
        }
        br.close();

    }

    public static void FileCopy2(File file, String str) throws IOException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(file,true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        PrintWriter pw = new PrintWriter(osw);
        pw.println(str);
        pw.flush();
        pw.close();
    }
}
