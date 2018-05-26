package com.haibo.day1.shuzu;

/**
 * Created by Administrator on 2018/1/23/023.
 */
public class dingyishuchu {
    public static void main(String[] args) {
        int[] arr=new int[2];//定义数组大小t
        int[] arr1=new int[]{1,2,3,4,5};//静态初始化定义数值
        int[] arr2={1,2,3,4,5};//初始化也可以这样
        arr[0]=1;



    }
    public static void printArray(int[]arr){
        //遍历数组元素
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}