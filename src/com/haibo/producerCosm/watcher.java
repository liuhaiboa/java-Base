package com.haibo.producerCosm;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/22/022
 */
public class watcher implements Runnable {
    private Move m;

    public watcher(Move m) {
        this.m=m;
    }
    @Override
    public void run() {
        for(int i=0;i<20;i++)
            m.watch();
    }

}