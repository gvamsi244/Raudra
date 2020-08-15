package Trees;

/**
 * @author Vamsi Krishna Govada on 8/15/2020.
 * @project Raudra
 */

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
}
