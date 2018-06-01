package com.haibo.MyCode;

import org.junit.Test;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/28/028
 */
public class Sort {
    int arr[]={5,2,6,3,9,7,1,8,11,4};

    /*
  * 冒泡排序
  * */
    @Test
    public void bolleanSort() {
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int y=0;y<arr.length-1-i;y++){
                if(arr[y]>arr[y+1]){
                    temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;

                }
            }
        }

        printArray(arr);
    }


    /**
     * 选择排序
     * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。
     */
    @Test
    public void selctSort() {
       int min;
       int a=arr.length;
       int temp;
       for(int i=0;i<a;i++){
               min=i;
               for(int j=i+1;j<a;j++){//找出最小值每次
                   if(arr[j]<arr[min]){
                       min=j;
                   }
               }
               temp = arr[min];
               arr[min] = arr[i];
           arr[i] = temp;

       }

        printArray(arr);
    }

    /*
   * 插入排序
   * 从第一个元素开始，该元素可以认为已经被排序
   * 取出下一个元素，在已经排序的元素序列中从后向前扫描
   * 如果该元素（已排序）大于新元素，将该元素移到下一位置
   * 复步骤3，直到找到已排序的元素小于或者等于新元素的位置
   * 将新元素插入到该位置后
   *重复步骤2~5
   * */
    @Test
    public void insertSort(){
        int temp;
        int a=arr.length;
        for(int i=1;i<a;i++){
            for (int j = i; j > 0 && arr[j]<arr[j - 1]; j--) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

            }



        }




        printArray(arr);
    }



    /*
    * 希尔排序
    * */
    @Test
    public void shellSort(){
        int h=1;
        int temp;
        int a=arr.length;
        System.out.println(h);
        while(h<a/4){//选择步长序列
            h=h*4+1;
            System.out.println(h);
        }
        //按步长序列将待排序数组分割成子序列后进行插入排序
        while(h>=1){
            for(int i=h;i<a;i++){
                for(int j=i;j>=h&&arr[j]<arr[j-h];j=j-h){
                    temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = temp;
                }
            }
            h=h/4;
        }
        printArray(arr);
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