package cn;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test54_newScheduledThreadPool {
    public static void main(String[] args) {
        //创建一个定长线程池，支持定时及周期性任务执行--延迟执行
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);

        //延迟1秒执行
        newScheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒执行");
            }
        },1, TimeUnit.SECONDS);

        //延迟1秒后每3秒执行一次
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("延迟1秒后每3秒执行一次");
            }
        }, 1, 3, TimeUnit.SECONDS);

        //newScheduledThreadPool.shutdown();
    }
}




















