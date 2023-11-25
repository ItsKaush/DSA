package Advance.Lec_3_Arrays_III;

import java.util.ArrayList;

public class ArrayIIIClient {

    public static void main(String[] args) {
        /*
        L3_Q1
        RainWaterTrapped waterTrapped = new RainWaterTrapped();
        waterTrapped.setA(new int[] {0, 1, 0, 2});
        System.out.println(waterTrapped.getWaterTrapped());

        L3_Q2
        MergeOverlappingIntervals intervals = new MergeOverlappingIntervals();
        Interval[] intervals1 = new Interval[4];
        intervals1[0] = new Interval(1,3);
        intervals1[1] = new Interval(2,6);
        intervals1[2] = new Interval(8,10);
        intervals1[3] = new Interval(15,18);

        intervals.setIntervals(intervals1);

        System.out.println(Arrays.toString(intervals.getMergedIntervals()));

        */

        MergeNewInterval newInterval = new MergeNewInterval();
        ArrayList<Interval> intervals1 = new ArrayList<>();
        intervals1.add(new Interval(1,2));
        intervals1.add(new Interval(3,6));
        Interval interval = new Interval(10, 8);
        newInterval.setIntervals(intervals1);
        newInterval.setNewInterval(interval);
        System.out.println(newInterval.mergeNewInterval());




    }


}
