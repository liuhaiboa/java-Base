package com.haibo.MySuanFa;

import sun.tools.jconsole.MaximizableInternalFrame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by liuhaibo on 19/1/4.
 */
public class array {
    static int max;
    static int min;

    public void getMinAndMax(int arr[]) {
        max = arr[0];
        min = arr[0];
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i + 1 > arr.length) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > arr[i + 1]) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i + 1] < min) {
                        min = arr[i];
                    }

                }
                if (arr[i] < arr[i + 1]) {
                    if (arr[i + 1] > max) {
                        max = arr[i + 1];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }

                }
            }
        }
    }


    public int findSendMax(int arr[]) {
        int maxNumber = arr[0];
        int secMaxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                secMaxNumber = maxNumber;
                maxNumber = arr[i];
            } else {
                if (arr[i] > secMaxNumber) {
                    secMaxNumber = arr[i];
                }
            }
        }
        return secMaxNumber;
    }

    public int maxSubArray(int arr[]){
        int sum=0;
        int MaxSum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <j ; k++) {
                    sum+=arr[k];
                }
                if (sum >MaxSum) {
                    MaxSum=sum;
                }
            }

        }
        return MaxSum;
    }

    public int findArray(int arr[]) {
        if (arr.length == 0) {return Integer.MIN_VALUE;}
        int result = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        int most = 0;
        Iterator it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if (value > most) {
                result=key;
                most = value;
            }
        }
        return result;
    }

    public void finSun(int arr[],int sum){
        Arrays.sort(arr);
        int begin=0;
        int end=arr.length-1;
        while (begin<end){
            if (arr[begin]+arr[end]<sum){
                begin++;
            }else if(arr[begin]+arr[end]>sum){
                end--;
            }
            System.out.println(arr[begin]+"+"+arr[end]+"="+sum);
            begin++;
            end--;
        }


//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arr.length ; j++) {
//                if (arr[i] + arr[j]==sum) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }

    }


    //倒转
    public void reserse(int a[],int b,int e){
        for (; b <e ; b++,e--) {
            int temp=a[e];
            a[e]=a[b];
            a[b]=temp;
        }
    }
    public  void shift(int a[],int k){
        int n=a.length;
        k=k%n;//如果右移位数大于n，右移k和k%n一样
        reserse(a,n-k,n-1);//倒转右移的那几个
        reserse(a,0,n-k-1);//倒转剩下的
        reserse(a,0,n-1);//全部倒转
    }



    public int quikSork(int array[],int low,int high,int k){
        int i,j;
        int temp;
        if (low>high){
            return Integer.MIN_VALUE;
        }
        i=low+1;
        j=high;
        temp=array[i];
        while (i<j){
            while (i<j&&array[j]>=temp){j--;}
            if (i<j){array[i++]=array[j];}
            while (i<j&&array[i]<temp){i++;}
            if (i<j){array[j--]=array[i];}
        }
        array[i]=temp;
        if(i+1==k){return temp;}
        else if(i+1>k){return quikSork(array,low,i-1,k);}
        else {return quikSork(array,i+1,high,k);}
    }

    public int getMinK(int array[],int k){
        if (array==null){return Integer.MIN_VALUE;}
        if(array.length<k){return Integer.MIN_VALUE;}
        return quikSork(array,0,array.length-1,k);
    }


    public static int findOnlyOne(int a[]){
        int result=a[0];
        int i;
        for ( i = 1; i <a.length ; ++i) {
            result ^= a[i];
        }
        return result;
    }




    /**
     * @param a 目标数组
     * @param apperaTimes 其余数出现的次数
     * @return
     */
    public static int findOnlyOne(int a[],int apperaTimes){
        int [] bitCount=new int[32];
        //计算数组中所有数组对应的二进制数各个位置上出现1的次数
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < 32; j++) {
                bitCount[j]+=((a[i]>>j)&1);
            }
        }
        //若某位上的结果不能被整除，则肯定目标数字在这一位上
        int apperaOne=0;
        for (int i = 0; i <32 ; i++) {
            if (bitCount[i] %apperaTimes!= 0) {
                apperaOne+=(1<<i);
            }
        }
        return apperaOne;
    }

    public int findDup(int[] a){
        int temp1=0;
        int temp2=0;
        for (int i = 0; i <a.length-1 ; ++i) {
            temp1+=(i+1);
            temp2+=a[i];
        }
        temp2+=a[a.length-1];
        int result=temp2-temp1;
        return result;
    }

    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static int getMaxnum(int a[],int begin){
        int length = a.length - begin;
        if (length==1){return a[begin];}
        else{return max(a[begin],getMaxnum(a,begin+1));}
    }
    public static void main(String[] args) {
        int a[]=new int[]{2,4,3,2,3,4};
       getMaxnum(a,0);
    }
}

