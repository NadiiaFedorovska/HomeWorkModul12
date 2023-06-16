
public class Task1 {
    public static void main(String[] args){
        Runnable task1 = new MyThread1();
        Runnable task2 = new MyThread2();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}