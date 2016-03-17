/**
 * Created by smertmashina on 3/16/16.
 */
public class LinkedQueue<T> implements Queue<T> {
    //Node structure with a payload of type T
    protected class Node {
        private T element;
        private Node next;
        public void setNext(Node next) {
            this.next = next;
        }
        public void setElement(T element) {
            this.element = element;
        }
    }
    //back = head; front = tail or the last list element
    protected Node front;
    private Node back;
    private int size;
    //default constructor
    LinkedQueue() {}
    public LinkedQueue<T> push(T element) {
        Node current = back;
        back = new Node();
        back.element = element;
        if (size++ == 0) {
            front = back;
        }
        else
            current.next = back;
        return this;
    }
    public void pop() {
        if (size == 0) throw new java.util.NoSuchElementException();
        front = front.next;
        size--;
    }
    public T front() {
        if (size == 0) throw new java.util.NoSuchElementException();
        return front.element;
    }
    public Boolean isEmpty() {
        return size == 0;
    }
}
