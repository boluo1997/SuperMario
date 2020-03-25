package cn;

public class Test12_Thread {

    static Thread t1 = null;
    static Thread t2 = null;

    public static void main(String[] args) {

        char[] c1 = "1234567".toCharArray();
        char[] c2 = "ABCDEFG".toCharArray();

        Object ob = new Object();

        t1 = new Thread(){
            public void run(){
                synchronized (ob){
                    for(char c : c1){
                        System.out.println(c);

                        try {
                            ob.notify();
                            ob.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    ob.notify();
                }
            }
        };


        t2 = new Thread(){
            public void run(){
                synchronized (ob){
                    for(char c :c2){
                        System.out.println(c);
                        try {
                            ob.notify();
                            ob.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    ob.notify();
                }
            }
        };


        t1.start();
        t2.start();
    }

}
