package multithreading.parallelMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> listToSort;
    private ExecutorService executorService;

    public MergeSorter(ExecutorService executorService, List<Integer> listToSort) {
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        System.out.println(listToSort + "Processed by " + Thread.currentThread().getName());
        //Base Case
        if(listToSort.size() <= 1){
            return listToSort;
        }

        //Split the list in two half
        List<Integer> listToSortFirstHalf = new ArrayList<>();
        List<Integer> listToSortSecondHalf = new ArrayList<>();
        for(int i=0; i<listToSort.size(); i++){
            if(i<listToSort.size()/2){
                listToSortFirstHalf.add(listToSort.get(i));
            }else{
                listToSortSecondHalf.add(listToSort.get(i));
            }
        }

        //Sort these splitted list
        MergeSorter sorterForFirstHalf = new MergeSorter(executorService,listToSortFirstHalf);
        MergeSorter sorterForSecondHalf = new MergeSorter(executorService,listToSortSecondHalf);
//        List<Integer> sortedFirstHalf = sorterForFirstHalf.call();
//        List<Integer> sortedSecondHalf = sorterForSecondHalf.call();

        //Need to call left and right on separate threads
        Future<List<Integer>> promiseOfsortedFirsthalf = executorService.submit(sorterForFirstHalf);
        Future<List<Integer>> promiseOfSortedSecondHalf = executorService.submit(sorterForSecondHalf);

        List<Integer> sortedFirstHalf = promiseOfsortedFirsthalf.get();
        List<Integer> sortedSecondHalf = promiseOfSortedSecondHalf.get();




        List<Integer> ansList = new ArrayList<>();

        //merge these two sorted lists
        int i=0, j=0;
        while (i<sortedFirstHalf.size() && j<sortedSecondHalf.size()){
            if(sortedFirstHalf.get(i) <= sortedSecondHalf.get(j)){
                ansList.add(sortedFirstHalf.get(i));
                i++;
            }else {
                ansList.add(sortedSecondHalf.get(j));
                j++;
            }
        }
        //Add the remaining elements
        while (i<sortedFirstHalf.size()){
            ansList.add(sortedFirstHalf.get(i));
            i++;
        }

        while (j<sortedSecondHalf.size()){
            ansList.add(sortedSecondHalf.get(j));
            j++;
        }

        return ansList;
    }
}
