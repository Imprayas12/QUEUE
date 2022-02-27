package QueueByLL;

/*Implementation of queue by a singly linked list.*/

import NODES.NodeS;

public class QueueByLinkedList <T> {
    NodeS front;
    NodeS rear;
    QueueByLinkedList(){
        front = rear = null;
    }
    public boolean isEmpty(){
        return rear==null;
    }
    public void enqueue(T data){
        NodeS<T> newNode = new NodeS(data);
        if(isEmpty()){
            front = newNode;
            rear = front;
        }
        else {
            rear.setNext(newNode);
            rear = rear.getNext();
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(front.getData());
            front = front.getNext();
        }
    }

    public static void main(String[] args) {
        /*Methods can be implemented here*/
    }
}
