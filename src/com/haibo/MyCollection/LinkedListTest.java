package com.haibo.MyCollection;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

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
@Test
    public void generateRedisKey() {
        List<String> keyParts = new LinkedList<>();
        keyParts.add("q");
        keyParts.add("w");
        keyParts.add("e");
        System.out.print(StringUtils.join(keyParts, ":"));
    }
}
