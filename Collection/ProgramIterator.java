package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ProgramIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
			
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");
		
		/*
		 * It is a interface declared in java.util package.
		 * It is used to traverse collection only in forward direction. During
		 * traversing, we can not add or set element but we can remove element from collection.
		 * Methods of Iterator
			1. boolean hasNext() //to check whether element is present or not in next position 
			2. E next() //return next position
			3. default void remove()
			4. default void forEachRemaining(Consumer<? super E> action)
		• Iterator takes the place of Enumeration in the Java
			collections framework.
		• Iterators allow the caller to remove elements from the
			underlying collection during the iteration.
		*/
		
		
		//using Iterator 
			Iterator<String> itr = list.iterator();
			
			while (itr.hasNext()) {
				String str =  itr.next();
				System.out.println(str);
			}
			System.out.println("++++++++++++++ ListIterator ++++++++++++++++++++");
			
		/*
			• It is sub interface of Iterator interface.
			• It is used to traverse only List Collection in bidirectional.
			• During traversing, we can add, set as well as remove element from
			collection.
			• It is introduced in jdk 1.2
			• Methods of ListIterator
				1. boolean hasNext()
				2. E next()
				3. boolean hasPrevious()
				4. E previous()
				5. void add(E e)
				6. void set(E e)
				7. void remove()
		*/
			
			//List iterator
				ListIterator<String> li = list.listIterator();
				//forward
				while (li.hasNext()) {
					String str =  li.next();
					System.out.println(str);
				}
				//backward
				System.out.println("backward");
				while (li.hasPrevious()) {
					String ele = li.previous();
					System.out.println(ele);
					
				}
	}

}
 