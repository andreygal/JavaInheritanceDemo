/**
 * Created by smertmashina on 3/16/16.
 */
public class Tester {
    public static void main(String args[]) {
        LinkedQueue<Integer> myQueue = new LinkedQueue<>();
        myQueue.push(5);
        myQueue.push(8);
        System.out.println(myQueue.front());
        myQueue.pop();
        System.out.println(myQueue.front());
        System.out.println(myQueue.isEmpty());
        myQueue.pop();
        System.out.println(myQueue.isEmpty());
        DerivedQueue<Integer> myDq = new DerivedQueue<>();
        myDq.push(9);
        myDq.push(5);
        myDq.push(4);
        myDq.emergencyPush(11);
        System.out.println(myDq.front());
        myDq.pop();
        System.out.println(myDq.front());
    }
}
