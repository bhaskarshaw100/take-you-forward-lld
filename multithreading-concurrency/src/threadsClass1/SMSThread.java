package threadsClass1;

public class SMSThread extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("SMS Sent using Thread");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
