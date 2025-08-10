package threadsClass1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        // Initiating the order processing by calling the OrderService main method
        // Call the OrderService's main method
//        OrderService.main(args);


//        SMSThread smsThread = new SMSThread();
//        EmailThread emailThread = new EmailThread();
//        ETACalculationThread etaCalculationThread = new ETACalculationThread();

        Thread smsThread = new Thread(new SMSRunnable());
        Thread emailThread = new Thread(new EmailRunnable());
//        Thread etaCalculationThread = new Thread(new ETACalculationRunnable());
        FutureTask<String> etaCalculationFutureTask = new FutureTask<>(new ETACalculationCallable("Kolkata"));
        Thread etaCalculationThread = new Thread(etaCalculationFutureTask);

        System.out.println("Task Started.\n");

        // Start all threads
        smsThread.start();
        System.out.println("Task 1 ongoing on Thread - " + smsThread.getName() + " Current thread - " + Thread.currentThread().getName() + "\n");
        emailThread.start();
        System.out.println("Task 2 ongoing on Thread - "+ emailThread.getName() + " Current thread - " + Thread.currentThread().getName() + "\n");
        etaCalculationThread.start();
//        System.out.println("Task 3 ongoing on Thread - "+ etaCalculationFutureTask + "\n");

        // Wait for all threads to finish
        try {
            smsThread.join();
            System.out.println("Task 1 completed");
            emailThread.join();
            System.out.println("Task 2 completed");
            System.out.println(etaCalculationFutureTask.get());
            System.out.println("Task 3 completed");
            Thread.sleep(1000);
            System.out.println("\nAll tasks Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
