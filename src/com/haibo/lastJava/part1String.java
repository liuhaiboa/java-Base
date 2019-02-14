package com.haibo.lastJava;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.D;

/**
 * 关于字符串的操作
 * Created by liuhaibo on 18/11/20.
 */
public class part1String {
    public static void main(String[] args){

        String[] words={"hello","world"};
        //讲一个数组转化成一个数组流
        List<String> uni= Arrays.stream(words).map(w->w.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

    }

    @Test
    public void scnaner() {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();//下一个单词
        int i1 = scanner.nextInt();//下一个整数
//        System.out.println(s);
        String i = scanner.nextLine();//下一行
        System.out.println(i);
//输出1，2，red，blue
//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//        System.out.println(s.nextInt());
//        System.out.println(s.nextInt());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        s.close();
    }


    @Test
    public void formartTest() {
        String string = String.format("%02d", 1);
        String s = String.format("%tF", new Date());
        System.out.println(string);
        System.out.println(s);
        System.out.printf("%tF", new Date());
    }

    @Test
    public void copyTest(){
        Object o=new Object();
        Employee employee=new Employee("haibo",19);
        Employee copy=employee;
        copy.setAge(18);
        System.out.println(copy.getAge());
        System.out.println(employee.getAge());
    }


    class Employee{
        String name="haibo";

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        int age;


        public Employee(String haibo, int i) {

        }
    }
}
