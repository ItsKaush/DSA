package Intermediate.Intermediate_Lec_20_Tree1;

import java.util.ArrayList;

public class TreeTraversalRecursive implements Tree{
    @Override
    public int[] getPreOrderTraversal(TreeNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrderHelper(list, head);

        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public void preOrderHelper(ArrayList<Integer> list, TreeNode head){
        if(head == null){
            return ;
        }

        list.add(head.data);
        preOrderHelper(list, head.left);
        preOrderHelper(list, head.right);
    }

    @Override
    public int[] getInorderTraversal(TreeNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderHelper(list, head);

        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public void inOrderHelper(ArrayList<Integer> list, TreeNode head){
        if(head == null){
            return ;
        }

        inOrderHelper(list, head.left);
        list.add(head.data);
        inOrderHelper(list, head.right);
    }
    @Override
    public int[] getPostorderTraversal(TreeNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrderHelper(list, head);

        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public void postOrderHelper(ArrayList<Integer> list, TreeNode head){
        if(head == null){
            return;
        }

        postOrderHelper(list, head.left);
        postOrderHelper(list, head.right);
        list.add(head.data);
    }

    @Override
    public int getHeight(TreeNode head) {
        //Height of tree is 1 + height of (max of left and right subtree)
        if(head == null){
            return 0;
        }

        return 1 + Math.max(getHeight(head.left), getHeight(head.right));
    }

    @Override
    public boolean isTreesEqual(TreeNode head1, TreeNode head2) {
        //equal if value is equal and also left subtrees and right subtrees are equal
        //Base Case: if both the nodes are null then return true, if any one node is equal then return false
        if(head1==null && head2==null){
            return true;
        } else if (head1==null || head2==null) {
            return false;
        }

        return head1.data == head2.data && isTreesEqual(head1.left, head2.left) && isTreesEqual(head1.right, head2.right);
    }

    int count;
    @Override
    public int getMaxAncestorsCount(TreeNode head) {
        int  max = Integer.MIN_VALUE;
        return maxAncestorsCountHelper(head,max);
    }

    @Override
    public int getNodesCount(TreeNode head) {
        if(head == null){
            return 0;
        }
        return 1 + getNodesCount(head.left) + getNodesCount(head.right);
    }

    public int maxAncestorsCountHelper(TreeNode head, int max){
        count = 0;
        //Base case if encountered null then return 0
        if(head == null){
            return 0;
        }

        if(head.data > max){
            count++;
            max = head.data;
        }

        count += maxAncestorsCountHelper(head.left,max);
        count += maxAncestorsCountHelper(head.right,max);

        return count;
    }
    @Override
    public boolean isSymmetricBinaryTree(TreeNode head) {
        return symmetricCheckHelper(head.left, head.right);
    }

    public boolean symmetricCheckHelper(TreeNode left, TreeNode right){
        //if both the nodes are null then return true else return false
        if(left == null && right == null){
            return true;
        } else if (left==null || right==null) {
            return false;
        }
        if(left.data == right.data && symmetricCheckHelper(left.left,right.right) && symmetricCheckHelper(left.right, right.left)){
            return true;
        }else {
            return false;
        }
    }
}
