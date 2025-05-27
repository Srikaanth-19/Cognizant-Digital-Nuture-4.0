import java.util.concurrent.*;
import java.util.*;

public class ExecutorService_Callable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            Callable<String> task = () -> {
                String threadName = Thread.currentThread().getName();
                TimeUnit.MILLISECONDS.sleep(500);
                return "Task " + taskId + " executed by " + threadName + " with result: " + (taskId * taskId);
            };
            futures.add(executor.submit(task));
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
