/**
 * Created by smertmashina on 3/16/16.
 */
public class DerivedQueue<T> extends LinkedQueue {
    public DerivedQueue<T> emergencyPush(T element) {
        Node current  = front;
        front = new Node();
        front.setElement(element);
        front.setNext(current);
        return this;
    }
}
