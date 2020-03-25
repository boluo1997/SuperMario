package cn;

public class Test14_Sell_Tickets {
    public static void main(String[] args) {

        Ticket t = new Ticket();
        t.setTickets(100);

        SellTickets s = new SellTickets(t);

        Thread t1 = new Thread(s,"售票员1");
        Thread t2 = new Thread(s,"售票员2");
        Thread t3 = new Thread(s,"售票员3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class SellTickets implements Runnable{

    private Ticket t;

    public SellTickets(Ticket t){
        this.t = t;
    }

    @Override
    public synchronized void run() {
        while(true){
            if(t.getTickets()<=0){
                break;
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            t.setTickets(t.getTickets()-1);
            System.out.println(Thread.currentThread().getName()+"卖了一张票,还剩"+t.getTickets()+"张票!");
        }

    }
}

class Ticket{

    private int tickets;

    public void setTickets(int tickets){
        this.tickets = tickets;
    }

    public int getTickets(){
        return tickets;
    }

}
