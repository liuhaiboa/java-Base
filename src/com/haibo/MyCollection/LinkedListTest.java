package com.haibo.MyCollection;

import java.util.LinkedList;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/26/026
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
//        list.add(4,"4");
//        list.addFirst("10");
//        list.removeFirst();
//        System.out.println(list);
//        System.out.print(list.getFirst());

        list.offerFirst("10");
        System.out.println(list);
        list.pollFirst();
        System.out.println( list.peekFirst());

    }
}