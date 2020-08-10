package cn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test52_newCachedThreadPool {
    public static void main(String[] args) {
        //创建一个可缓存线程池
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        for(int i=0;i<100;i++){

            try{
                //Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

            newCachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    //打印正在执行的缓存线程信息
                    System.out.println(Thread.currentThread().getName()+"正在执行...");
                }
            });

        }

        newCachedThreadPool.shutdown();

    }

}














