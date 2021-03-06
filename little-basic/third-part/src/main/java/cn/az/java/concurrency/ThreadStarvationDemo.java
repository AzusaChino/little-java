package cn.az.java.concurrency;

/**
 * @author az
 */
public class ThreadStarvationDemo {

    public static void main(String[] args) {
        new ThreadStarvationDemo();
    }

    @Override
    public void finalize() { // FinalReference
        System.out.printf("Thread[%s] executes current object's finalization.\n", Thread.currentThread().getName());
    }
}
