package cn;

public class Test15_Products {
    public static void main(String[] args) {

    }
}

class Manufacture implements Runnable{

    private Product p;

    public Manufacture(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            synchronized (p){
                while(p.flag == false){
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    int count = 1000-p.getCount();

                    int rancount = (int)(Math.random()*(count+1));
                }
            }
        }
    }
}

class Product{

    private int count;
    boolean flag = true;

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

}