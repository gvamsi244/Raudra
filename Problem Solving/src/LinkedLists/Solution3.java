package LinkedLists;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Find Kth node from the end of linked list

public class Solution3 {

    private static Node kthNode(Node head, int k) {
        Node sp = head;
        Node fp = head;
        int t = k;
        while(t!=0){
            fp=fp.next;
            t--;
        }
        while (fp!=null){
            sp=sp.next;
            fp=fp.next;
        }
        return sp;
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
        list.head.next.next.next.next = new Node(22);
        list.head.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next = new Node(7);
        Node head = list.head;
        System.out.println("Given Linked list");
        printList(head);
        System.out.println("");
        System.out.println("Kth Node from end linked list: " + kthNode(head,2).data);
    }
}
