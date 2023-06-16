import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class MyQueue {

    BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
    private AtomicInteger integer;
    private int n;

    public MyQueue(int n) {
        this.integer = integer;
    }

    public void fizzbuzz(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        while (i > 1) {
            i = atomicInteger.get();
            if (i % 3 == 0 && i % 5 == 0) {
                blockingQueue.add("fizzbuzz");
                atomicInteger.decrementAndGet();
            }
        }
    }

    public void fizz(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        while (i > 1) {
            i = atomicInteger.get();
            if (i % 3 == 0 && i % 5 != 0) {
                blockingQueue.add("fizz");
                atomicInteger.decrementAndGet();
            }
        }
    }

    public void buzz(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        while (i > 1) {
            i = atomicInteger.get();
            if (i % 5 == 0 && i % 3 != 0) {
                blockingQueue.add("buzz");
                atomicInteger.decrementAndGet();
            }
        }
    }

    public void number(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        while (i > 1) {
            i = atomicInteger.get();
            if ((i % 5 != 0) && (i % 3 != 0)) {
                blockingQueue.add(Integer.toString(i));
                atomicInteger.decrementAndGet();
            }
        }
    }
}

