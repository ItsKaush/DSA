package Advance.Lec_3_Arrays_III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    private Interval[] intervals;

    public void setIntervals(Interval[] intervals) {
        this.intervals = intervals;
    }

    public static class condition implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2){
            if(o1.start<o2.start) return -1;
            else if(o1.start>o2.start) return 1;
            else return 0;
        }
    }
    public Interval[] getMergedIntervals(){
        int n = intervals.length;
        int left = intervals[0].start;
        int right = intervals[0].end;
        ArrayList<Interval> list = new ArrayList<>();
        Arrays.sort(intervals, new condition());

        for(int i=1; i<n; i++){
            if(intervals[i].start <= right){ //intervals are overlapping
                right = Math.max(right,intervals[i].end);
            }else{ //if not overlapping then add this interval to answer and update left and right
                Interval interval = new Interval(left, right);
                list.add(interval);
                left = intervals[i].start;
                right = intervals[i].end;
            }
        }
        //add the last interval as well
        list.add(new Interval(left,right));

        //Convert arraylist to array
        Interval[] intervals1 = new Interval[list.size()];
        for(int i=0; i<list.size(); i++){
            intervals1[i] = list.get(i);
        }
        return intervals1;
    }
}
