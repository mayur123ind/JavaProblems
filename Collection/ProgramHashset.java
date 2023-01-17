package arraylist;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashset {

	public static void main(String[] args) {
		/*
			• It Set Collection.
			• It can not contain duplicate elements but it can contain null element.
			• It's implementation is based on HashTable.
			• It is unordered collection.
			• It is unsynchronized collection. Using Collections.synchronizedSet()
				method, we can make it synchronized.
			• Note : If we want to manage elements of non final type inside HashSet
			then non final type should override equals and hashCode() method.
			• Instantiation:
			 Set<Integer> set = new HashSet<>();
		*/
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		//set.remove(20);
		//hashset doesnt use indexing thats why get method not used  
		System.out.println(set);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
	}

}
