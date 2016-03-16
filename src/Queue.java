/**
 * Created by smertmashina on 3/16/16.
 */
public interface Queue<T> {
    //add an element to the back of the queue
    Queue<T> push(T element);
    //remove an element from the front of the queue
    void pop();
    //access an element at the front of the queue
    T front();
    //test if the queue is empty
    Boolean isEmpty();
}
//