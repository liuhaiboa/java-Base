package com.haibo.producerCosm;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/22/022
 */
public class Move {
    private String pic;
    private boolean flag=true;
            //信号灯 flag = true --->生产者生成产，消费者等待，生产完成后通知消费
           //       flag = false ---->消费者消费，生产者等待，消费完后通知生产

    public synchronized void play(String pic) {
        if (!flag) {//生产者等待，消费者消费
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {//开始生产
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //生产完毕
            this.pic = pic;
            System.out.println("生产了:" + pic);
            //通知消费
            this.notify();
            //生产者停下
            this.flag = false;
        }
    }
        public synchronized void watch(){
            if(flag){
                //消费者等待
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            //开始消费
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //消费完毕
            System.out.println("消费了"+pic);
            //通知生产
            this.notify();
            //消费停止
            this.flag=true;
        }






}