package arraylist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProgramQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> pt = new PriorityQueue<>();
		pt.add(10);
		pt.add(20);
		pt.add(30);
		pt.add(40);
		pt.add(50);
		pt.add(60);
		
		Iterator<Integer> itr = pt.iterator();
		while (itr.hasNext()) {
			Integer string = itr.next();
			System.out.println(string);
		}
		System.out.println("++++++++++++++++++");
		System.out.println(pt.peek());
		//remove head 
			//System.out.println(pt.poll());
	}

}
