package LinkedLists;

/**
 * @author Vamsi Krishna Govada on 8/14/2020.
 * @project Raudra
 */

// Finding a middle node in list

public class Solution2 {

    private static Node middle(Node head) {
        Node sp=head;
        Node fp=head;
        while (fp!=null){
            fp=fp.next;
            fp=fp.next;
            sp=sp.next;
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
        Node head = list.head;
        System.out.println("Given Linked list");
        printList(head);
        System.out.println("");
        System.out.println("Reversed linked list: "+middle(head).data);
    }
}


