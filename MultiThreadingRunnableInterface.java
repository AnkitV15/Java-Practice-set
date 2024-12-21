class MyRunnable implements Runnable{

    String someText;

    MyRunnable(){}

    MyRunnable(String someText){
        this.someText = someText;
    }

    @Override
    public synchronized void run() {
        
        for(int i = 0; i < 100; i+=10){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            } finally{
                System.out.println(this.someText + " " + i + " % ");
            }

        }
        System.out.println(someText + " Download Complete ! ");
    }

    
}

public class MultiThreadingRunnableInterface {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable("Thread 0"));
        Thread thread_1 = new Thread(new MyRunnable("Thread 1"));

        thread.start();
        
        thread.join();
        thread_1.start();
        thread_1.join();

    }
}
