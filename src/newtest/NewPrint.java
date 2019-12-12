package newtest;

import java.io.*;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Created by zhaojing on 2019-12-12.
 */
public class NewPrint {


    public void getFilelist(){

        try {
            File file = new File("D:\\AAA");
            File[] fileList = file.listFiles();
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\BBB.txt"));

            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isFile()) {
                    String fileName = fileList[i].getName();
                    System.out.println(fileName);
                    bw.write(fileName, 0, 15);
                    bw.write("\r\n");

                }

            }
            bw.flush();
            bw.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();}


    }
    public static void main(String[] args){
        NewPrint rf = new NewPrint();
        rf.getFilelist();
    }
}
