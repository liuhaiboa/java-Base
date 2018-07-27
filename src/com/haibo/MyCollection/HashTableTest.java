package com.haibo.MyCollection;

import java.util.*;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/27/027
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable table=new Hashtable();
        //table.put("1","one");
        int val = 0;
        String key = null;
        Integer value = null;
        Random r = new Random();
        for (int i=0; i<12; i++) {
            // 随机获取一个[0,100)之间的数字
            val = r.nextInt(100);
            key = String.valueOf(val);
            value = r.nextInt(5);
            // 添加到Hashtable中
            table.put(key, value);
           // System.out.println(" key:"+key+" value:"+value);
        }

        // 通过entrySet()遍历Hashtable的key-value
      iteratorHashtableByEntryset(table) ;

        // 通过keySet()遍历Hashtable的key-value
        iteratorHashtableByKeyset(table) ;

        // 单单遍历Hashtable的value
        //iteratorHashtableJustValues(table);

        // 遍历Hashtable的Enumeration的key,根据keys()获取Hashtable的集合。
        enumHashtableKey(table);

        // 遍历Hashtable的Enumeration的value,根据value()获取Hashtable的“值”的集合。
        //enumHashtableValue(table);
    }


    private static void enumHashtableKey(Hashtable table) {
        if (table == null)
            return ;
        System.out.println("\nenumeration Hashtable");
        Enumeration enu=table.keys();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());

        }

    }

    private static void iteratorHashtableByEntryset(Hashtable table) {
        String key = null;
        Integer integ = null;
        Iterator iter = table.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();

            key = (String)entry.getKey();
            integ = (Integer)entry.getValue();
            System.out.println(key+" -- "+integ.intValue());
        }
    }
    private static void iteratorHashtableByKeyset(Hashtable table) {
        if (table == null)
            return ;

        System.out.println("\niterator Hashtable By keyset");
        String key = null;
        Integer integ = null;
        Iterator iter = table.keySet().iterator();
        while (iter.hasNext()) {
            key = (String)iter.next();
            integ = (Integer)table.get(key);
            System.out.println(key+" -- "+integ.intValue());
        }
    }

}