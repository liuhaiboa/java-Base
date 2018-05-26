package com.haibo.qiuzhao;

import org.junit.Test;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/25/025
 */
public class Num4QianTaoFor {
    public  void main(String[] args) {
        shang();      xia();
        /*上尖型       下尖型
        *     *         ****
        *     **        ***
        *     ***       **
        *     ****      *
         */

        sanjiao();
        jiujiu();

    }
    @Test
    public void sanjiao(){
        for(int x=0;x<6;x++){
            for(int y=x;y<6;y++){
                System.out.print(" ");
            }
            for(int z=0;z<=x;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    @Test
    public  void jiujiu(){
        for(int x=1;x<=9;x++){
            for(int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+x*y+"\t");
            }
            System.out.println();
        }
    }
    @Test
    public   void shang() {
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public   void xia() {
        int z = 5;
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= z; y++) {
                System.out.print("*");
            }
            System.out.println();
            z--;
        }
    }

}
