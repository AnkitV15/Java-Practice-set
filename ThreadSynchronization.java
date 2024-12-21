

class Ticket {

    public int book = 0;
}

class BookTicketThread extends Thread {
    String threadName;
    Ticket myTicket;

    BookTicketThread(Ticket myTicket,String threadName){
        this.myTicket = myTicket;
        this.threadName = threadName;

    }

    public synchronized void run(){

        // System.out.println("Entered thread: " + this.threadName + " " + this.myTicket.book);
        this.myTicket.book += 1;
        System.out.println("Exit thread: " + this.threadName +  " " + this.myTicket.book + " ticket booked successfully !!");
        // System.out.println(this.threadName + " " + myTicket.book);
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {

        Ticket tk = new Ticket();

        Thread[] threads = new Thread[10];
        for ( int i = 0; i < 10; i++){
            threads[i] = new BookTicketThread(tk,"thread_" + i);
            threads[i].start();
            threads[i].join();
        }

        System.out.println("Total Tickets booked successfully: " + tk.book);
    }
}
