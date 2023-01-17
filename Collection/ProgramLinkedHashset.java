package arraylist;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramLinkedHashset {

	public static void main(String[] args) {

		/*
			• It is sub class of HashSet class.
			• Its implementation is based on linked list and Hashtable.
			• It is ordered collection.
			• It is unsynchronized collection. Using Collections.synchronizedSet()
				method we can make it synchronized.
				 Set s = Collections.synchronizedSet(new LinkedHashSet(...));
			• It is introduced in jdk 1.4
			• It can not contain duplicate element but it can contain null element.
		 */
		
			Set<Integer> set = new LinkedHashSet<>();
			
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(40);
			
			for (Integer integer : set) {
				System.out.println(integer);
			}

	}

}
