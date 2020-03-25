package cn;

/**
 * 模拟四个线程对同一个数据i进行操作
 * 1号和3号线程做加1
 * 2号和4号线程做减1
 */
public class Test13_Thread {
    public static void main(String[] args) {
        Business bs = new Business();
        for(int i=0;i<4;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    bs.inc();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    bs.dec();
                }
            }).start();
        }
    }
}

class Business{

    int j = 100;
    public synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName()+"-inc:"+j);
    }

    public synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName()+"-dec:"+j);
    }

}
