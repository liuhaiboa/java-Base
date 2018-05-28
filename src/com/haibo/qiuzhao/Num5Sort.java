package com.haibo.qiuzhao;

import java.util.Arrays;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/25/025
 */
public class Num5Sort {
    public static void main(String[] args)
{
    int arr[]=new int[]{11,23,5,41,9,3};
     // selectSort(arr);
    //selectionSort1(arr);
    // maopao(arr);
   //Arrays.sort(arr);
   /// quickSort(arr,0,arr.length-1);
    shellSort(arr);
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
//        public static void selectSort(int[] arr)
//        {//选择排序
//            for(int i=0;i<arr.length-1;i++)
//            {
//                for(int x=i+1;x<arr.length;x++)
//                {
//                    if(arr[i]>arr[x])
//                    {
//                        int temp=arr[i];
//                        arr[i]=arr[x];
//                        arr[x]=temp;
//                    }
//                }
//            }
//        }

        public static void selectionSort1(int[] arr) {
            int length = arr.length;
            int min;
            int temp;
            for (int i = 0; i < length; i++) {
                min = i;
                for (int j = i + 1; j < length; j++) {//找出最小的数
                    if (arr[j] <arr[min]) {
                        min = j;
                    }
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

    /**快速排序方法*/
    //声明数组     int[] arr = {49,38,65,97,76,13 ,27};
    /* data：要排序的数组
	 * start:选取的是第一个数，这里是索引号，这里是49，始终拿这个数和其他数比较，
	 * 		  因此，位置也就串这个数所在的索引，
	 * end；最后一个元素，这里是索引号，这里是27
	 */
    public static void  quickSort(int[] arr, int start, int end) {
        int i = start;    //相当于i，左  索引
        int j = end;    //相当于j,  右  索引
        if (i >= j)  { // 判断是否到中间了 ，到中间返回// 1 2
            return; //返回
        }
        //确定指针方向的逻辑变量，也就是从左搜索还是向右搜索
        boolean flag=true; //false:左->右  true：右->左
        while (i != j) { //如果i==j证明第一趟结束，每趟的标准值仅是一个，例如第一趟被比较值为49，
            if (arr[i] > arr[j]) {
                //交换数字 ：所有比它小的数据元素一律放到左边，所有比他大的数据元素一律放到右边，
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //只有经过数的交换后，才能把游标的移动位置改变，移动书序是交替改变
                //决定下标移动，还是上标移动 ，游标更改 走下一个数据
                //	flag = (flag == true) ? false : true;
                flag=!flag;
            }
            //将指针向前或者向后移动 ,第一次从左-》右，第二次从右-》左
            if(flag) {//true，右---》左
                j--;
            }else{//false 左---》右
                i++;
            }
        } //1 2
        //到此，数组的数据排列位置为：
        //第一次到该位置，data的值是：[27, 38, 13, 49, 76, 97, 65]
        //将数组分开两半，确定每个数字的正确位置
        //i=3,j=3
        i--; //
        j++;
        //i=2 j=4 start=0 end=6
        quickSort(arr, start, i); //也就是 27 38 13在快速排序
        quickSort(arr, j, end); // 也就是 76, 97, 65在快速排序
    }





    /**
     * 希尔排序
     */
    public static void shellSort(int[] arr) {
        int length = arr.length;
        int h = 1;
        int temp;
        while (h < length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = temp;
                }
            }
            h /= 3;
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