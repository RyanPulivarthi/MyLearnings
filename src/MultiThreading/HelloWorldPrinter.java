package MultiThreading;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Thread "+i+" is printed by "+Thread.currentThread().getName());
        }
    }
}
