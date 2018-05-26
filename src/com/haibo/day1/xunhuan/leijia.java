package com.haibo.day1.xunhuan;

/**
 * Created by Administrator on 2018/1/17/017.
 *
 * 累计和计数器
 */
public class leijia {
    public static void main(String[] args) {
        /*
        求1-100的和；
        */
    int sum=0;
      for(int i=1;i<101;i++){
           sum=sum+i;
     }
      System.out.println(sum);

    /*
    求1-100中7倍数的个数
     */

         int count=0;
        for(int i=0;i<101;i++){
            if(i%7==0){
                count++;
            }
        }
        System.out.println(count);




    }

}