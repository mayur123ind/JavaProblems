package inheritance;

class Base{
	private int num1;
	private int num2;
	
	public Base() {
		super();
		this.num1 = 10;
		this.num2 =20 ;	
	}
	
	public void print() {
		System.out.println("Num 1 : "+ num1);
		System.out.println("Num 2 : "+ num2);
	}
}
class Derived extends Base{
	
	private int num3;
	
	public Derived() {
		this.num3=30;
	}
	/*
	 * process of redefining method of super class inside sub class is called method overriding.
	 * 
	 */
	public void print() { //method Overriding
		super.print();
		System.out.println("Num 3 : "+ num3);
	}
}
public class ProgramOverride {

	public static void main(String[] args) {
		Base base = new Derived(); // Up-casting
		base.print();	//o/p Num 1 : 10 Num 2 : 20 Num 3 : 30
/* 
 * In compile time binding is done for base and in runtime binding is done for derived class so all three value print
 * Super class reference through sub class method call 
 * Process of calling method of sub class using reference of super class is called  Dynamic Method Dispatch
 *  If super and sub class method name same this process is also called Runtime polymorphism / Dynamic Method Dispatch
*/
	}
	public static void main1(String[] args) {
		Derived der = new Derived();
		der.print();	//o/p Num 1 : 10 Num 2 : 20 Num 3 : 30
	}	 
}
/*
 * sub class overrides method of super class.
 * 1. Access modifier in sub class method should be same or it should be wider than super class method.
 * 2. Return type in sub class method should be same or it should be sub type. In other words it should be covarient    
 * 3. Method name, number of parameters and type of parameters in sub class method must be same.
 * 4. checked exception list in sub class method should be same or it should be sub set
 * 
 *    ##we cannot override method in sub class 
 *    private method
 *    final method
 *    static method
 * */