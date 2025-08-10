package threadsClass1;

public class EmailRunnable implements Runnable {
    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            System.out.println("Email Sent using Thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
