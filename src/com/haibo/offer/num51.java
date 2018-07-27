package com.haibo.offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/16/016
 * 与原题类似的题：如何找出数组中重复元素最多的数
 */
//public class num51 {
//    //使用map
//    public static void main(String[] args) {
//        int array[] = {1, 5, 4, 3, 4, 4, 5, 4, 5, 5, 6, 6, 6, 6, 6};
//        int maxFrequenceNum = findMostFrequentInArray(array);
//        System.out.print(maxFrequenceNum);
//    }
//
//    public static int findMostFrequentInArray(int[] a) {
//        int result = 0;
//        int size = a.length;
//        if (size == 0) {
//            return Integer.MAX_VALUE;
//            Map<Integer, Integer> m = new HashMapTest<Integer, Integer>();
//            for (int i = 0; i < size; i++) {
//                if (m.containsKey(a[i])) {
//                    m.put(a[i], m.get(a[i]) + 1);
//                } else {
//                    m.put(a[i], 1);
//                }
//            }
//
//
//            int most = 0;
//            Iterator iter = m.entrySet().iterator();
//            while (iter.hasNext()) {
//                Map.Entry entry = (Map.Entry) iter.next();
//
//                int key = (Integer) entry.getKey();
//                int val = (Integer) entry.getValue();
//                if (val > most) {
//                    result = key;
//                    most = val;
//                }
//            }
//
//
//            return result;
//
//    }
//
//}

//        Map<Integer, Integer> map = new HashMapTest<>();
//        int count = 0;
//        int count_2 = 0;
//        int temp = 0;
//        for(int i=0;i<array.length;i=i+count){
//            if(i==array.length-1){
//                temp =1;
//                break;
//            }
//            for(int j=i+1;j<array.length;j++){
//                if(array[i]==array[j]){
//                    count++;
//                }
//                continue;
//            }
//            if(count>count_2){
//                count_2 = count;
//                map.put(count_2, array[i]);
//            }
//
//        }
//        System.out.println(map.get(count_2));
//        return count;



