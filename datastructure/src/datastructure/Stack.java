package datastructure;

import exceptions.StackOverflowException;
import exceptions.StackunderflowException;

public class Stack {
	
	private int top;
	private int[] arr;
	
	public Stack() {
		this( 5 );
	}
	
	public Stack(int size) {
		this.top = -1;
		this.arr = new int[size];
	}
	public 	boolean empty() {
		if(top==-1)
			return true;
		else 
			return false;
	}
	public boolean full() {
		return  this.top == this.arr.length-1;
	}
	public void push(int element) throws StackOverflowException {
		if(full())
			throw new StackOverflowException("stack is Full");
		this.arr[++this.top]=element;
		
	}
	public int peek() throws StackunderflowException {
		if(empty())
			throw new StackunderflowException("stack is Empty");
		return this.arr[this.top];																												
	}
	public void pop() throws StackunderflowException																		{
		if(empty())
			throw new StackunderflowException("stack is Empty");
		--this.top;
		
	}





}
