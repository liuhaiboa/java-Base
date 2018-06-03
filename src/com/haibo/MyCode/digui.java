package com.haibo.MyCode;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/2/002
 */
public class digui {
    public static void main(String[] args) {
        int number=3;

        function(number);
    }

    public static void function(int a){
        if(a==0||a==-3)
            return;
        a--;
        function(a);
        function(a);
        System.out.println(a);
    }
}