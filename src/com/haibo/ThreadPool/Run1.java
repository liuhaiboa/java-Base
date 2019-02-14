package com.haibo.ThreadPool;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by liuhaibo on 18/12/7.
 *线程池问题注意参数，包括核心线程数和最大线程数还有队列选择，拒绝策略 顺序
 */
public class Run1 {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 2, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        System.out.println(executor.getCorePoolSize());


    }

    /**
     * 测试shutdown()和shutdownNow()
     */
    public static void test(){
        //方法shutdown的作用是使当前未执行完的线 程继续执行，而不添加新的任务。
        // shutdown方法不会阻塞，调用shutdown方法后主线程就马上结束了线程池会继续执行完成。
        ArrayList list=new ArrayList();
        list.stream().count();
    }
}