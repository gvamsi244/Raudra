/**
 * @author Vamsi Krishna Govada on 6/24/2020.
 * @project Raudra
 */
// Test the code in LeetCode Exercise
// Link: https://leetcode.com/problems/binary-tree-postorder-traversal/


import java.util.ArrayList;
import java.util.List;


// Definition for a binary tree node
public class Postorder_Traversal_Tree {

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

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            output.add(root.val);
        }
        return output;
    }
}

