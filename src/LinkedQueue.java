/**
 * Created by smertmashina on 3/16/16.
 */
public class LinkedQueue<T> implements Queue<T> {
    //Node structure with a payload of type T
    private class Node {
        private T element;
        private Node next;
    }
    //back = head; front = tail or the last list element
    private Node back, front;
    private int size;
    //default constructor
    LinkedQueue() {}
    public void push(T element) {
        Node current = front;
        front = new Node();
        front.element = element;
        if (size++ == 0) {
            back = front;
        }
        else
            current.next = front;


    }
}
