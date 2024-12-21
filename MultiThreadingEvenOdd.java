

class EvenThread extends Thread {

    public void run (){
        for(int i = 0; i < 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }
    
}

class OddThread extends Thread {

    public void run (){
        for(int i = 0; i < 20; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }
    
}


public class MultiThreadingEvenOdd {

    public static void main(String[] args) {
        OddThread oddNo = new OddThread();

        // oddNo.start();

        oddNo.run();
    }
}
