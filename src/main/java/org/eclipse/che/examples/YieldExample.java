package org.eclipse.che.examples;

// Example on usage of Yield method
public class YieldExample {
    public static void main (String[] args) {
        YieldExample obj = new YieldExample();
        System.out.println("Example of Thread Yield");
        Thread producer = new Producer();
        Thread consumer = new Consumer();
        producer.setPriority(Thread.MIN_PRIORITY);
        consumer.setPriority(Thread.MAX_PRIORITY);
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {

    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(i+ " Producer THread :" + Thread.currentThread().getName());
           Thread.yield();
        }
        
    }
}
class Consumer extends Thread {
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(i+ " Consumer THread :" + Thread.currentThread().getName());
            Thread.yield();
        }
    }
}