package arraylist;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("java Collection Framework");
		
		/*
		 * creating collection
		 * 1)Type Safe /Generic - same type of elements(objects) are added to collection
		 * 2)un-type safe/non-Generic - different type of elements(objects) are added to collection
		 * 
		 * */
		//type safe collection
		/*
		ArrayList<String> names = new ArrayList<>();
		names.add("Mayur");
		names.add("234");
		System.out.println(names);
		System.out.println(names.get(1));
		
		
		//non type safe
		 * LinkedList list = new LinkedList();
			list.add("Mayur");
			list.add(234);
			list.add(true);
			list.add(625.12);
			System.out.println(list);
			
		 * 
		*/
		
		List<Integer> list = new ArrayList<>(/* initial capacity : 20*/);
												//default capacity is 10
		//Add method 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		//Get method for indexer
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		//remove the element from list 
				list.remove(4);
		//check items is there or not 
				System.out.println(list.contains(30));
		//check for empty
				System.out.println(list.isEmpty());
		//remove all element
				//list.clear();
				
				System.out.println();
		/*Iterate to list various way 		
		 1) for loop
		 
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		
		2) foreach loop
			
			for (Integer ele : list) {
			System.out.println(ele);
			}
			
		3) iterator
		4)List iterator
		*/
		for (Integer ele : list) {
			System.out.println(ele);
		}
	}

}
