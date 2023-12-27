package multithreading.parallelMergeSort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = Arrays.asList(2,4,3,5,7,6,9,8);

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        MergeSorter mergeSorter = new MergeSorter(executorService, list);

        Future<List<Integer>> promiseOfSortedList = executorService.submit(mergeSorter);

        List<Integer> sortedList = promiseOfSortedList.get();

        System.out.println(sortedList);

        executorService.shutdown();
    }
}
