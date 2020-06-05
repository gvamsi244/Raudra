/**
 * @author Vamsi Krishna Govada on 6/4/2020.
 * @project Raudra
 */


// Implementation of Stack using LinkedList


import java.util.Scanner;

class Stack_Using_LinkedList {

    static class Node {

        int val = 0;
        Node next;

        Node(int val) {
            this.val = val;// try this: Node(int d) { data = d; }
            next = null;
        }
    }

    static class MyStack {

        static Node tail = null;  // tail = top;
        static Node head = null;  // tail = top;

        public static void push(int element) {
            Node temp = new Node(element);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        public static void pop() {
            Node temp = head;
            if (head == null)
                System.out.println("Stack is Empty......");
            else {
                if (head == tail) {
                    head = null;
                } else {
                    while (temp.next != tail) {
                        temp = temp.next;
                    }
                    tail = null;
                    temp.next = null;
                    tail = temp;
                }
            }
        }

        public static void print() {
            Node temp = head;
            if (head == null)
                System.out.println("Stack is Empty......");
            else {
                while (temp != tail) {
                    System.out.print(temp.val+", ");
                    temp = temp.next;
                }
                System.out.print(tail.val);
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please provide the size of the stack");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        System.out.println("Stack Created");
        MyStack stack = new MyStack();
        while (true) {
            System.out.println("********** Stack Options ************");
            System.out.println("Please select one of the following stack operations");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Print");
            System.out.println("4) Exit");

            int t = s.nextInt();
            if (t == 1) {
                System.out.println("Enter the element you want to insert");
                int element = s.nextInt();
                stack.push(element);
            } else if (t == 2) {
                stack.pop();
                System.out.println("Element will be popped if stack is not empty");
            } else if (t == 3) {
                System.out.println("The elements in stack are:");
                stack.print();
            } else if (t == 4) {
                System.out.println("Thank you for using the Stack Interface");
                break;
            } else
                System.out.println("Please enter valid input");
        }

    }
}