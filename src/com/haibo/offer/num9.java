package com.haibo.offer;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/12/012
 * 斐波那契数列
 * 要求输入一个整数n，请你输出斐波那契数列的第n项
 */
public class num9 {
    public int Fibonacci(int n) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}