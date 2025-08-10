package threadsClass1;

public class ETACalculationRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000); // 5-second delay for ETA calculation
            System.out.println("ETA Calculated using Thread. Estimated Time: 25 minutes.");
        } catch(InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
