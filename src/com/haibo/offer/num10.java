package com.haibo.offer;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/27/027
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class num10 {
    public int Num(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}