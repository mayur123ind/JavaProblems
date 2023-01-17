package Abstraction;
/*
 * ##Abstract method
* According to client's requirement, if implementation of super class method is logically 100%
  incomplete then we should declare super class method abstract.
* we can't provide body to the abstract method.
* 	.A method of class  which is having a body is called concrete  method.(static/non-static) 
* If we declare method abstract then we must declare class abstract.
* It is mandatory to override abstract method in sub class otherwise 
  sub class can be considered as abstract. 
* 
*  ###Abstract Class
*  Abstract class may or may not contain abstract method.
*  Since implementation of abstract class is logically incomplete , we can not instantiate it. 
   but we can create reference it.
*  
*  
 * */

abstract class A{
	public final void f1() {
		System.out.println("a.f1");
	}
	public void f2() {
		System.out.println("a.f2");
	}
	public abstract void f3(); 
}
class B extends A{
	@Override
	public void f2() {
		System.out.println("B.f2");
	}
	@Override
	public void f3() {
		System.out.println("b.f3");	
	}
}
/*##Final Method
 * According to clients requirement , if implementation of super class method is logically
   100% complete then we should declare super class method final.
 * We cannot override final method in sub class.
 * Final method inherit into sub class hence  we can use it with instance of sub class.   
 * 
 * ##Final class
 * If implementation of class is logically 100% complete then we should declare 
   such class is final.    
 * We can instantiate final class but we can not extend it. In other words,we can't create
   sub class of final class.  
 * we can't use abstract and final keyword together.
 * 
 * */

final class C extends B{
	@Override
	public void f3() {
		System.out.println("c.f3");	
	}
}
public class Program {

	public static void main(String[] args) {
		C c = new C();
		c.f1();
		c.f2();
		c.f3(); 
	}

}
