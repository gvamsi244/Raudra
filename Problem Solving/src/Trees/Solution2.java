package Trees;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Check wheather given two trees are identical or not

public class Solution2 {

    private static boolean identicalTrees(Node root1, Node root2) {
        if((root1==null) && (root2==null))
            return true;
        else if((root1!=null) && (root2!=null)){
            if(root1.val==root2.val){
                return identicalTrees(root1.left,root2.left) && identicalTrees(root1.right,root2.right);
            }
            else
                return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);

        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);

        if (identicalTrees(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }
}

