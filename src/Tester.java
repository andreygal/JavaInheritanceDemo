/**
 * Created by smertmashina on 3/16/16.
 */
public class Tester {
    public static void main(String args[]) {
        LinkedQueue<Integer> myQueue = new LinkedQueue<Integer>();
        myQueue.push(5);
        myQueue.push(8);
        System.out.println(myQueue.front());
        myQueue.pop();
        System.out.println(myQueue.front());
        System.out.println(myQueue.isEmpty());
        myQueue.pop();
        System.out.println(myQueue.isEmpty());
    }
}
