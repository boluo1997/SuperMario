package cn;

public class Test07_Thread {
    //循环打印1A2B3C4D5E6F7G

    static Thread t1 = null;
    static Thread t2 = null;

    public static void main(String[] args) {
        Object ob = new Object();

        char[] c1 = "1234567".toCharArray();
        char[] c2 = "ABCDEFG".toCharArray();

        t1 = new Thread(){
            public void run(){
                synchronized (ob){
                    for(char c : c1){
                        System.out.println(c);

                        try{
                            ob.notify();
                            ob.wait();
                        }catch (Exception e){
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
                    for(char c : c2){
                        System.out.println(c);

                        try{
                            ob.notify();
                            ob.wait();
                        }catch (Exception e){
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
