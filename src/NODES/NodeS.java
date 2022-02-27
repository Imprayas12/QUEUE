package NODES;

public class NodeS <T>{
    private T data;
    NodeS<T> next;
    public NodeS(T data){
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeS<T> getNext() {
        return next;
    }

    public void setNext(NodeS<T> next) {
        this.next = next;
    }
}
