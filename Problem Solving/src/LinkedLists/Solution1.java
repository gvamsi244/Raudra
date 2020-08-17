package LinkedLists;

/**
 * @author Vamsi Krishna Govada on 8/13/2020.
 * @project Raudra
 */

// Implementation of reverse a linked list

class Solution1 {
    public static Node reverseList(Node head) {
        return reverse(null, head);
    }

    public static Node reverse(Node tail, Node head) {
        if (head != null) {
            Node temp = head.next;
            head.next = tail;
            tail = head;
            return reverse(tail, temp);
        }
        return tail;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        Node head = list.head;
        System.out.println("Given Linked list");
        printList(head);
        head = reverseList(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        printList(head);
    }
}
