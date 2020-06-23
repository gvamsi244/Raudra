/**
 * @author Vamsi Krishna Govada on 6/5/2020.
 * @project Raudra
 */

import java.util.Scanner;

class MyQueue{
    private static int end=-1;
    private static int start=-1;
    private static int size;
    private static int [] arr;

    MyQueue(int size){
        this.size=size;
         arr= new int[size];
    }

    static void enqueue(int element){
        if(start == -1){
            start =0;end=0;
            arr[end] = element;
        }
        else{
            if(start == (end+1)%size)
               System.out.println("Queue is Full");
            else {
                end = (end+1)%size;
                arr[end] = element;

            }
        }
    }

    static void dequeue(){
        if(start == -1)
            System.out.println("Queue is Empty");
        else{
            if(start == end)
            {
                arr[start] = 0;
                start=-1;end=-1;
            }
            else {
                arr[start] = 0;
                start=(start+1)%size;
            }
        }
    }

    static void print(){
        if(start == -1)
            System.out.println("Queue is Empty");
        else {
            int i = start;
            while(i!=end){
                System.out.print(arr[i]+",");
                i=(i+1)%size;
            }
            System.out.print(arr[end]);
        }
    }
}
public class Queue_Using_CircularArray {

    public static void main(String[] args) {
        System.out.println("Please provide the size of the queue");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        MyQueue myQueue = new MyQueue(size);
        System.out.println("Queue Created");
        while(true){
            System.out.println("********** Queue Options ************");
            System.out.println("Please select one of the following queue operations");
            System.out.println("1) Enqueue");
            System.out.println("2) Dequeue");
            System.out.println("3) Print");
            System.out.println("4) Exit");

            int t  =s.nextInt();
            if(t==1){
                System.out.println("Enter the element you want to insert");
                int element = s.nextInt();
                myQueue.enqueue(element);
            }

            else if(t==2){
                myQueue.dequeue();
                System.out.println("Element is deleted from the Queue");
            }

            else if (t==3){
                System.out.println("The elements in Queue are:");
                myQueue.print();
            }

            else if(t==4){
                System.out.println("Thank you for using the Queue Interface");
                break;
            }

            else {
                System.out.println("Please enter valid input");
            }
        }
    }
}
