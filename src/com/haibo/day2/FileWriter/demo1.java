package com.haibo.day2.FileWriter;

import java.io.*;

/**
 * Created by Administrator on 2018/3/10/010.
 */
public class demo1 {
    public static void main(String[] args) {
//        try {
//            FileWriter fw=new FileWriter("demo.txt");
//            fw.write("加油");//写入io流
//            fw.flush();//刷流
//            fw.close();//关闭
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileReader fd=new FileReader("demo.txt");
            try {
                int s=fd.read();
                System.out.print((char)s);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}