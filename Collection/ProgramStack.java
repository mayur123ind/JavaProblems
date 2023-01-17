package arraylist;

import java.util.Stack;

public class ProgramStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<>();
		
		//push
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack);
		
		//peek
		System.out.println("peek element");
		System.out.println(stack.peek());
		
		//pop
		stack.pop();
		System.out.println("after pop()");
		System.out.println(stack);
		
		//search element in stack
		System.out.println("searching...");
		int position = stack.search(10);
		System.out.println(position);
	}

}
