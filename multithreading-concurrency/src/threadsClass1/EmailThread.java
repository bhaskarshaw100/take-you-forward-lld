package threadsClass1;

public class EmailThread extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("Email Sent using Thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
