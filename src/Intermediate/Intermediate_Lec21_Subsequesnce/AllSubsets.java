package Intermediate.Intermediate_Lec21_Subsequesnce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllSubsets {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int[][] solve(){
        int n = A.length;
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Iterate over total number of subsets
        for(int i=0; i<(1<<n); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            //for each subset iterate over its bits and check if it set or not
            for(int j=0; j<n; j++){
                if((i & (1<<j)) != 0){
                    temp.add(A[j]);
                }
            }
            list.add(temp);
        }
        //Sort the array list
        Collections.sort(list,  (ArrayList<Integer> a, ArrayList<Integer> b) -> {
            for(int i = 0; i <a.size() && i < b.size(); i++){
                if(a.get(i) < b.get(i)) return -1;
                if(a.get(i) > b.get(i)) return 1;
            }
            if(a.size() > b.size()) return 1;
            return -1;
        });

        //Convert arraylist to 2d array
        int[][] ans = new int[list.size()][];
        for(int i=0; i<list.size(); i++){
            ans[i] = new int[list.get(i).size()];
            for(int j=0; j<list.get(i).size(); j++){
                ans[i][j] = list.get(i).get(j);
            }
        }
        return ans;
    }
}
