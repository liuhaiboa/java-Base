package com.haibo.MyCode;


import org.junit.Test;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/6/12/012
 * 创建线程的三种方式：实现接口 继承类 匿名内部类
 */


public class MyThread  extends Thread{
    public void run() {
        Thread t=Thread.currentThread();
        System.out.println("当前线程名字：" + t.getName()+ "----id----"+t.getId());
    }

    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();

    }

//    class MyThread2 implements Runnable{
//        @Override
//        @Test
//        public void run() {
//            Thread t=Thread.currentThread();
//            System.out.println("当前线程名字：" + t.getName()+ t.getId());
//        }
//    }

}

//     class MyThread2 implements Runnable{
//        @Override
//        @Test
//        public void run() {
//            Thread t=Thread.currentThread();
//            System.out.println("当前线程名字：" + t.getName()+ t.getId());
//        }
//    }



//    class MyThread1 extends Thread {
//        public void run() {
//            try {
//                Thread.sleep(3000);
//                Thread t = Thread.currentThread();
//                System.out.println("当前线程名字：" + t.getName() + " 当前线程的优先级别为：" + t.getPriority() + " ID:" + t.getId());
////           System.out.println("当前线程名字：" + this.getName() + " 当前线程的优先级别为：" + this.getPriority() + " ID:"+ this.getId());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }



