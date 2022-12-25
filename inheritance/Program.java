package inheritance;

class Person{
	protected String name;
	protected int age;

	public Person() {
		this(" ",0);
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	//public void showRecord() {
	  public void displayRecord() {
		System.out.println("name : "+ this.name);
		System.out.println("age : "+ this.age);
	}
}
class Employee extends Person{
	
	private int empid;
	private float salary;
	
	public Employee() {
		
		this.empid=0;
		this.salary=0;
	}

	public Employee(String name, int age, int empid, float salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
	}

	public void displayRecord() {
		/*
		 1) If name or members of super class and sub class  are same and if we try to access these members using 
		  inheritance of sub class then preference is given the sub class members 
		 
		 2) If name or members of super class and sub class  are same and if we try to access these members using 
		  inheritance of sub class then sub class members hides implementation  of super class members 
		   this process is called "shadowing"
		  */
		super.displayRecord(); 
		//this.showRecord();
		System.out.println("empid : "+ this.empid);
		System.out.println("salary : "+ this.salary);
	}
}
public class Program {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		Employee emp = new Employee("mayur",27,109,400000);
	//	emp.showRecord();
		
		emp.displayRecord();

	}

}
