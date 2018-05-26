package com.haibo.qiuzhao;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/5/25/025
 * 这个类是用于演示hello world。及运算符有关的基本操作。

 */
public class Num1HelloWord {
    /*
	main函数可以保证该的独立运行。
	它是程序的入口。
	它会被JVM所调用。
	*/
    public static void main(String[] args)
    {
        System.out.print("helloword");//这是输出语句，可以打印小括号中的内容

        //定义变量
        int a=99;
        float b=88.3f;
        long c=77l;
        String d="helloword";
        System.out.println("a="+a);
        System.out.println(a+b+c+d);//helloword264.3helloword
        System.out.println(a+"+"+b+"+"+c+"+"+d);//99+88.3+77+helloword
        System.out.println("5+5"+(5+5));//"5+5=55"
        System.out.println(-1%5);//-1
        int e=a++;
        System.out.println(e+"+"+a);
        int f=++a;
        System.out.println(f+"+"+a);
        c+=4;//c = c + 4;
        System.out.println(c);
        System.out.println(3==4);//false


        //逻辑运算符用于连接boolean类型的表达式。
        int x=7;
		/*
		& : 只要两边的boolean表达式结果，有一个为false。那么结果就是false。
			只有两边都为true，结果为true。
		| : 两边只要有一个为true，结果为true。
			只有两边都有false，结果为false。
		^ : 异或；就是和|有点不一样。当true ^ true = false;
		          两边相同结果是false。两边不同结果是true。
		*/
        System.out.println(x>3 & x<6);
        System.out.println(x>3 | x<6);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(~6);//~是位运算符,意义是 按位非(NOT) 按位非也叫做补,

        int num = 26;
        int n1 = num & 15;
        System.out.println(n1);//二进制位运算

        /*
		&和&&的特点：
		&:无论左边是true是false。右边都运算。
		&&:当左边为false时，右边不运算。

		|：两边都参与运算。
		||：当左边为true。右边不运算。
		*/




    }
}
