import java.util.*;

public class QueueDequeEx 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new LinkedList<Integer>(); 	//queue is a interface we can not create Queue
		System.out.println(q);
		System.out.println(q.peek()); 	//first element of queue
		//System.out.println(q.element()); 	//first element of queue
		q.add(11);
		q.add(12);
		q.add(33);
		q.add(44);
		q.add(55);
		q.add(66);
		q.add(88);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println("---------------------------------------------");
		Deque<Integer> dq= new LinkedList<Integer>();
		dq.add(1);
		dq.addFirst(23);
		dq.add(34);
		dq.addLast(1234);
		dq.add(45);
		System.out.println(dq);
		dq.remove();
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
		System.out.println(dq.peek());
	}
}
