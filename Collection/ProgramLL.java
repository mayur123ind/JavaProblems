package arraylist;

import java.util.*;

public class ProgramLL {

	public static void main(String[] args) {
		 
		LinkedList<String> list = new LinkedList<>();
		list.add("mayur");
		list.add("Tushar");
		list.add("jayesh");
		list.add("gaurav");
		list.add("ganesh");
		list.add("mayur2");
		
		//remove the element from list 
		list.remove("mayur2");
		//check items is there or not 
				System.out.println(list.contains("jayesh"));
		//check for empty
				System.out.println(list.isEmpty());
		//remove all element
				//list.clear();
				
				System.out.println();
		//print 
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
