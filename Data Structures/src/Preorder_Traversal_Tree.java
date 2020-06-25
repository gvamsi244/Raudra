/**
 * @author Vamsi Krishna Govada on 6/24/2020.
 * @project Raudra
 */
// Test the code in LeetCode Exercise
// Link: https://leetcode.com/problems/binary-tree-preorder-traversal/


import java.util.ArrayList;
import java.util.List;


// Definition for a binary tree node
public class Preorder_Traversal_Tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    List<Integer> output = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            output.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return output;
    }
}
