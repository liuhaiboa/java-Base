package com.haibo.MyCollection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/26/026
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList List=new ArrayList();
        List.add("a");
        List.add("a");
        List.add("b");
        List.add("c");
        List.add(0,"aa");
        System.out.print(List);

        // List.remove("aa");//可以remove值也可以remove键

       // System.out.println("the first element is: "+ List.get(0));
        //System.out.println("the first element is: "+ List.get(1));
        //System.out.println("the first element is: "+ List.get(2));
        // 获取ArrayList的大小
       //System.out.println("Arraylist size=: "+ List.size());
       // System.out.println("ArrayList contains 3 is: "+ List.contains("a"));
//        System.out.println("the first element is: "+ List.get(2));
//        List.set(2,"1");
//        System.out.println("the first element is: "+ List.get(2));
        //遍历ArrayList
        for(Iterator iter = List.iterator(); iter.hasNext(); ){
            System.out.println(iter.next());

        }
// 判断ArrayList是否为空
             System.out.println("ArrayList is empty: "+ List.isEmpty());

    }


}