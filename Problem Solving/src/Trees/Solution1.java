package Trees;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Find size of the binary tree

public class Solution1 {
    private static int size(Node root) {
        if (root != null) {
            return 1 + size(root.left) + size(root.right);
        } else return 0;
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("The size of binary tree is : " + size(tree.root));
    }
}