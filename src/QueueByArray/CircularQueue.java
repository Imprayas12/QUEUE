package QueueByArray;

import java.util.Scanner;

public class CircularQueue<T>{
    T[] queue;
    int front;
    int rear;
    CircularQueue(int n){
        front=rear=-1;
        queue = (T[]) new Object[n];
    }
    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public boolean isFull(){
        return (front==-1 && rear == queue.length-1)||(rear==front-1);
    }
    public void enqueue(T data){
        if(isFull()){
            System.out.println("Value cannot be inserted");
        }
        else {
            if (isEmpty()) {
                queue[++front] = data;
                rear++;
            } else {
                if (rear == queue.length-1) {
                    rear = -1;
                }
                queue[++rear] = data;
            }
        }
    }
    public void iterate(){
        int i;
        for(i=front;i% queue.length!=rear;i++){
            System.out.print(queue[i% queue.length] + " ");
        }
        System.out.print(queue[rear]);
        System.out.println();
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(queue[front% queue.length]);
            front++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue<Integer> CQ = new CircularQueue<>(5);
        /*for (int i = 0; i < 5; i++) {
            CQ.enqueue(sc.nextInt());
        }
        CQ.iterate();
        CQ.dequeue();
        CQ.iterate();
        CQ.enqueue(1);
        CQ.iterate();
        CQ.dequeue();
        CQ.enqueue(2);
        CQ.iterate();*/
    }
}