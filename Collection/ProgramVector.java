package arraylist;

import java.util.*;

public class ProgramVector {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("mayur");
		list.add("Tushar");
		list.add("jayesh");
		list.add("gaurav");
		list.add("ganesh");
		list.add("mayur2");
		
		List<String> vector = new Vector<>();
		vector.addAll(list);
		System.out.println(vector);
	}

}
