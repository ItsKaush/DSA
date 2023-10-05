package Intermediate.Intermediate_Lec_12_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber implements Comparator<Integer> {
    private int[] num;



    public LargestNumber(int[] num) {
        this.num = num;
    }

    public String getLargestNumber(){
        Integer[] num1 = new Integer[num.length];
        for(int i=0; i<num.length; i++){
            num1[i] = Integer.valueOf(num[i]);
        }
        //Use above comparator to sort the array
        Arrays.sort(num1, this);
        String largest_number = "";
        for(int i=0; i<num.length; i++){
            largest_number += num1[i];
        }

        if(Long.parseLong(largest_number) == 0){
            return "0";
        }
        return largest_number;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        String X = String.valueOf(o1);
        String Y = String.valueOf(o2);
        String XY = X+Y;
        String YX = Y+X;

        if(Long.parseLong(XY) == Long.parseLong(YX)){
            return 0;
        }else if(Long.parseLong(XY) > Long.parseLong(YX)){
            return -1;
        }else{
            return 1;
        }
    }
}


