/**
 * @author Vamsi Krishna Govada on 6/4/2020.
 * @project Raudra
 */

// Implementation of Stack using Array


import java.util.Scanner;

class Stack_Using_Array {

    static class  MyStack{
        private static int top=-1;
        private static int size;
        private static int arr[];
        MyStack(int len){
            this.size = len;
            this.arr= new int[len];
        }

        public static void push(int element){
            if(top>=size-1)
                System.out.println("Stack is Full......Element Not Inserted");
            else
                arr[++top]=element;
        }

        public static void pop() {
            if(top<0)
                System.out.println("Stack is Empty......");
            else
                arr[top--] = 0;
        }

        public static void print() {
            if(top<0)
                System.out.println("Stack is Empty......");

            else{
                System.out.print("[");
                for(int i=0;i<top;i++) {
                    System.out.print(arr[i] + ", ");
                }
                System.out.println(arr[top]+"]");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please provide the size of the stack");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        System.out.println("Stack Created");
        MyStack stack = new MyStack(size);
        while(true){
            System.out.println("********** Stack Options ************");
            System.out.println("Please select one of the following stack operations");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Print");
            System.out.println("4) Exit");

            int t  =s.nextInt();
            if(t==1){
                System.out.println("Enter the element you want to insert");
                int element = s.nextInt();
                stack.push(element);
            }

            else if(t==2){
                stack.pop();
                System.out.println("Element is popped from the stack");
            }

            else if (t==3){
                System.out.println("The elements in stack are:");
                stack.print();
            }

            else if(t==4){
                System.out.println("Thank you for using the Stack Interface");
                break;
            }

            else {
                System.out.println("Please enter valid input");
            }
        }

    }
}