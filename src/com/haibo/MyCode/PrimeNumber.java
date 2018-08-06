package com.haibo.MyCode;

import org.junit.Test;

/**
 * Created by lina on 2018/8/6.
 */
public class PrimeNumber {
    @Test
    public void fun02() {
        int count1 = 0, count2 = 0;
        for (int i = 101; i <= 200; i++) {
            // 每一个数一个个接受检验是否为素数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j != 0) {
                    //不能被整除累计一次
                    count1++;
                }
            }
            // 转为int的类型
            int num = (int) Math.sqrt(i);
            //如果累计次数num - 1个数相等则为素数
            if (count1 == (num - 1)) {
                System.out.println("素数:" + i);
                count2++;
            }
            // 统计素数个数
            count1 = 0;
        }
        System.out.println(count2);
    }


    @Test
    public void funMath(){
        int i=7;
        System.out.println(Math.sqrt(i));
    }


}
