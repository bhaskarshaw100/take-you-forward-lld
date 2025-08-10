package threadsClass1;

public class OrderService {
    public static void main(String[] args) {
        System.out.println("Placing Order....\n");

        // Send SMS and simulate the delay of 2 seconds
        sendSMS();
        System.out.println("Task 1 done.\n");

        // Send Email and simulate the delay of 3 seconds
        sendEmail();
        System.out.println("Task 2 done.\n");

        // Calculate ETA (Estimated Time of Arrival) with a delay of 5 seconds
        String eta = calculateETA();
        System.out.println("Order placed. Estimated Time of Arrival: " + eta);
        System.out.println("Task 3 done.\n");
    }

    private static void sendSMS() {
        try{
            Thread.sleep(2000);
            System.out.println("SMS Sent");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendEmail() {
        try{
            Thread.sleep(3000);
            System.out.println("Email Sent");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static String calculateETA() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "45 mins";
    }
}
