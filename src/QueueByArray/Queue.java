package QueueByArray;

public class Queue <T>{
    T[] queue;
    int front;
    int rear;
    Queue(int size){
        queue = (T[]) new Object[size];
        front = rear = -1;
    }
    public boolean isFull(){
        return rear == queue.length -1;
    }
    public boolean isEmpty(){
        return rear == -1 || front == queue.length - 1;
    }
    public void enqueue(T data){
        if(isFull()) System.out.println("Queue is full");
        else if(isEmpty()){
            queue[++front] = data;
            rear++;
        }
        else{
            queue[++rear] = data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("No element to be deleted");
        }
        else{
            System.out.println(queue[front++]);
        }
    }
}
