import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {
    public static void main(String[] args) {
        int n = 15;
        MyQueue task2 = new MyQueue(n);
        AtomicInteger atomic = new AtomicInteger(n);

        Thread threadA = new Thread(() -> task2.fizz(atomic));
        Thread threadB = new Thread(() -> task2.buzz(atomic));
        Thread threadC = new Thread(() -> task2.fizzbuzz(atomic));
        Thread threadD = new Thread(() -> task2.number(atomic));

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
            threadD.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> array = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            try {
                array.add(task2.blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Collections.reverse(array);
        System.out.println(array);
    }
}
