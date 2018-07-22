package com.haibo.producerCosm;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/22/022
 */
public class app {
    public static void main(String[] args) {
        //共同的资源
        Move m=new Move();

        //多线程
        Player p=new Player(m);
        watcher w=new watcher(m);

        new Thread(p).start();
        new Thread(w).start();
    }

}