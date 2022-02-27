package NODES;

public class NodeD <T>{
    T data;
    NodeD<T> next;
    NodeD<T> prev;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeD<T> getNext() {
        return next;
    }

    public void setNext(NodeD<T> next) {
        this.next = next;
    }

    public NodeD<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeD<T> prev) {
        this.prev = prev;
    }
}
