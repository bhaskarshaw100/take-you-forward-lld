package threadsClass1;

import java.util.concurrent.Callable;

public class ETACalculationCallable implements Callable<String> {
    private final String location;

    public ETACalculationCallable(String location) {
        this.location = location;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task 3 ongoing on Thread - "+ Thread.currentThread().getName() + "\n");
        Thread.sleep(8000); // 5-second delay for ETA calculation
        return "ETA to "+location+": 25 minutes";
    }
}
