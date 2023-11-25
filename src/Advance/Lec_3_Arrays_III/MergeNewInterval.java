package Advance.Lec_3_Arrays_III;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeNewInterval {
    private ArrayList<Interval> intervals;
    private Interval newInterval;

    public void setNewInterval(Interval newInterval) {
        this.newInterval = newInterval;
    }

    public void setIntervals(ArrayList<Interval> intervals) {
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
    public ArrayList<Interval> mergeNewInterval(){
        int n = intervals.size();
        int left = Math.min(newInterval.start, newInterval.end), right = Math.max(newInterval.end, newInterval.start);
        System.out.println("new Interval Start: " + left + ", new Interval End: " + right);
        //find the start and end of merged intervals
        int start = -1, end = -1;
        for(int i=0; i<n; i++){
            if(intervals.get(i).start <= right && left <= intervals.get(i).end){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }

        System.out.println("start of merged interval: " + start + " End of merged Interval:  " + end);
        //Add all intervals in ans
        ArrayList<Interval> ans_interval = new ArrayList<>();
        if(start != -1){
            //Add all intervals from left of start
            for(int i=0; i<start; i++){
                ans_interval.add(intervals.get(i));
            }

            //Add merged interval
            ans_interval.add(new Interval(Math.min(intervals.get(start).start,left), Math.max(intervals.get(end).end,right)));

            //Add intervals to right of end
            for(int i=end+1; i<n; i++){
                ans_interval.add(intervals.get(i));
            }
        } else{ //If there are no merged intervals then need add new interval at its correct position
            boolean done = false;
            for(int i=0; i<n; i++){
                if(left > intervals.get(i).end && !done){ //there is no overlapping adjust the new interval at its correct position
                    ans_interval.add(new Interval(left, right));
                    done = true;
                }
                //Add all other intervals
                ans_interval.add(intervals.get(i));
            }
            //if new interval lies at end add it
            if(!done){
                ans_interval.add(newInterval);
            }
        }
        Collections.sort(ans_interval, new condition());
        return ans_interval;

    }
}
