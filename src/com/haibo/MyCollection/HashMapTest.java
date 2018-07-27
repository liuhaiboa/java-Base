package com.haibo.MyCollection;

import java.util.HashMap;
import java.util.Random;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/26/026
 */
public class HashMapTest {
    public static void main(String[] args) {
        // 初始化随机种子
                Random r = new Random();
                // 新建HashMap
                HashMap map = new HashMap();
                // 添加操作
               map.put("one", r.nextInt(10));
                 map.put("two", r.nextInt(10));
                map.put("three", r.nextInt(10));

                map.put(1,"a");

                // 打印出map
                System.out.println("map:"+map );
    }
}