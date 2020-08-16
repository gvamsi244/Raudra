package Trees;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Implementation of convert the given binary tree into its mirror tree

public class Solution4 {
    private static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + ",");
            inOrder(root.right);
        }
    }

    private static void mirror(Node root) {
        if (root != null) {
            Node tempL = root.left;
            Node tempR = root.right;
            root.left = tempR;
            root.right = tempL;
            mirror(root.left);
            mirror(root.right);
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of input tree is :");
        inOrder(tree.root);
        System.out.println("");
        mirror(tree.root);
        System.out.println("Inorder traversal of binary tree is : ");
        inOrder(tree.root);
    }
}
