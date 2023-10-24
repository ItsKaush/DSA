package Intermediate.Intermediate_Lec_20_Tree1;

public interface Tree {
    public int[] getPreOrderTraversal(TreeNode head);
    public int[] getInorderTraversal(TreeNode head);
    public int[] getPostorderTraversal(TreeNode head);
    public int getHeight(TreeNode head);
    public boolean isTreesEqual(TreeNode head1, TreeNode head2);
    public int getMaxAncestorsCount(TreeNode head);
    public int getNodesCount(TreeNode head);
    public  boolean isSymmetricBinaryTree(TreeNode head);

}
