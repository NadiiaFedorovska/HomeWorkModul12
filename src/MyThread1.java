public class MyThread1 implements Runnable{
    long startTime = System.currentTimeMillis();

    @Override
    public void run() {
        while (true){
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            try {
                Thread.sleep(1000);
                System.out.println("Total time passed: " + totalTime/1000 + " sec");
            } catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
