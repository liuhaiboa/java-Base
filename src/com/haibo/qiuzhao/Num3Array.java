package com.haibo.qiuzhao;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/25/025
 * 数组
 */
public class Num3Array {
    /*
    定义数组
    */
    //元素类型[] 数组名 = new 元素类型[元素个数或数组长度];

    //定义一个可以存储3个整数的容器。
    int[] arr=new int[2];//定义数组大小t
    int[] arr1=new int[]{1,2,3,4,5};//静态初始化定义数值
    int[] arr2={1,2,3,4,5};//初始化也可以这样
    //遍历数组元素
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }




}