public class MyThread2 implements Runnable{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
                System.out.println("5 seconds have passed");
            } catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
