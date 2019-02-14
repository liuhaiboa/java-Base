package com.haibo.LeetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuhaibo on 19/1/7.
 */
public class num15 {
//    public List<List<Integer>> threeSum(int[] nums) {
//
//        Arrays.sort(nums);
//        int begin=0;
//        int end=nums.length-1;
//
//        while (begin<end){
//            if (nums[begin]+nums[end]<nums[c]){
//                begin++;
//            }else if(nums[begin]+nums[end]>nums[c]){
//                end--;
//            }
//            System.out.println(nums[begin]+"+"+nums[end]+"="+nums[c]);
//            begin++;
//            end--;
//        }
//
//        return 0;
//    }


    class ExampleA extends Exception{}
    class ExampleB extends ExampleA{
        ExampleB(String s){}
    }
    @Test
    public  void man() {
        try {
            throw new ExampleB("b");

        }catch (ExampleA e){
            System.out.println("ExampleA");
        }catch (Exception e){
            System.out.println("Exception");
        }

    }

    public static int getRe(int i){
        int result=0;
        switch (i){


            case 1:result=result+i;
            case 2:result=result+i*2;
            case 3:result=result+i*3;
        }
        return result;
    }

    public static void main(String[] args) {
        //int re = getRe(2);
      //  System.out.println(re);
        int[] a;
        a = new int[]{1,1,2,4,5};


        Map map=new HashMap<>();


    }



}
