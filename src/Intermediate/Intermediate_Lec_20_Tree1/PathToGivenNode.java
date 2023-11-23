package Intermediate.Intermediate_Lec_20_Tree1;

import java.util.ArrayList;
import java.util.List;

public class PathToGivenNode {
    private int B = 5;
    private TreeNode A;

    public void setB(int b) {
        B = b;
    }

    public void setA(TreeNode a) {
        A = a;
    }

    List<Integer> list = new ArrayList<>();
    public int[] solve(TreeNode A, int B){

        findPath(A, B);

        int[] ans = new int[list.size()];
        int j=0;
        for(int i=list.size()-1; i>=0; i--){
            ans[j] = list.get(i);
            j++;
        }

        return ans;
    }

    public boolean findPath(TreeNode A, int B){
        if(A == null){
            return false;
        }

        if(A.data == B){
            list.add(A.data);
            return true;
        }

        if(findPath(A.left,B)){
            list.add(A.data);
            return true;
        }

        if(findPath(A.right, B)){
            list.add(A.data);
            return true;
        }
        return false;
    }


}
