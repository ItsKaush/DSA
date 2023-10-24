package Intermediate.Intermediate_Lec_20_Tree1;

import java.util.Arrays;

public class TreeClient {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        node.left = node1;
        node.right = node2;

        TreeNode head2 = new TreeNode(1);
        TreeNode head21 = new TreeNode(2);
        TreeNode head22 = new TreeNode(3);
        head2.left = head21;
        head2.right = head22;

        Tree tree = new TreeTraversalRecursive();
        System.out.println("Pre Order Traversal: " + Arrays.toString(tree.getPreOrderTraversal(node)));
        System.out.println("In Order Traversal: " + Arrays.toString(tree.getInorderTraversal(node)));
        System.out.println("Post Order Traversal: " + Arrays.toString(tree.getPostorderTraversal(node)));
        System.out.println("Height of Tree is: " + tree.getHeight(node));
        System.out.println("Are tress equal: " + tree.isTreesEqual(node,head2));
        System.out.println("Max Ancestor count: " + tree.getMaxAncestorsCount(node));
        System.out.println("No of Nodes: " + tree.getNodesCount(head2));
        System.out.println("Is tree is Symmetrical: " + tree.isSymmetricBinaryTree(node));



    }
}
