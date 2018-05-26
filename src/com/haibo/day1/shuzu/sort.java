package com.haibo.day1.shuzu;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/1/23/023.
 */
/**
 *这是关于数组的遍历，排序
 *@author haibo
 * @version 1
 */
public class sort {
    public static void main(String[] args)
    {
        int arr[]=new int[]{11,23,5,41,9,3};
       // selectSort(arr);
        //maopao(arr);
        Arrays.sort(arr);
        printArray(arr);
    }
    /**冒泡排序
     * @param arr 数组
     */
    public static  void maopao(int[] arr)
    {
        for(int x=0;x<arr.length-1;x++)
        {
            for(int y=0;y<arr.length-x-1;y++)
            {//减一避免越界
                if(arr[y]>arr[y+1])
                {
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * @param arr 排序数组
     */
    public static void selectSort(int[] arr)
    {//选择排序
        for(int i=0;i<arr.length-1;i++)
        {
            for(int x=i+1;x<arr.length;x++)
            {
                if(arr[i]>arr[x])
                {
                    int temp=arr[i];
                    arr[i]=arr[x];
                    arr[x]=temp;
                }
            }
        }
    }

    /**遍历数组元素
     *
     * @param arr 遍历数组
     */
    public static void printArray(int[]arr)
    {
        //遍历数组元素
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}