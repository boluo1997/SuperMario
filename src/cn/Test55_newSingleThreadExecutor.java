package cn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test55_newSingleThreadExecutor {
    public static void main(String[] args) {

        //创建一个单线程化的线程池
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();

        for(int i=0;i<10;i++){

            final int index = i;
            newSingleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName()+"正在执行...打印的值是"+index);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
