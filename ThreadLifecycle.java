class MyThread implements Runnable {

    public void run(){
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(i);
            }
        }
    }

}

public class ThreadLifecycle {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}
