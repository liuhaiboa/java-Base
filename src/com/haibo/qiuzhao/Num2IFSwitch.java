package com.haibo.qiuzhao;

import java.util.Scanner;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/25/025
 * 循环if  switch用法
 */
public class Num2IFSwitch {
    public static void main(String[] args) {
        ifelse();
        switct();
    }
    public static void ifelse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字:");
        int x=scanner.nextInt();
        if(x>12 || x<1)
            System.out.println(x+"月份不存在");
        else if(x>=3 && x<=5)
            System.out.println(x+"春季");
        else if(x>=6 && x<=8)
            System.out.println(x+"夏季");
        else if(x>=9 && x<=11)
            System.out.println(x+"秋季");
        else
            System.out.println(x+"冬季");


    }
    public static void switct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字:");
        int x=scanner.nextInt();
        switch(x)
        {
            case 3:
            case 4:
            case 5:
                System.out.println(x+"春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(x+"夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(x+"秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(x+"冬季");
                break;
            default:
                System.out.println("nono");

        }

    }

}