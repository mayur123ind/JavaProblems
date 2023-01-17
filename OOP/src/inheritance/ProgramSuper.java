package inheritance;

class Person1{
	
	private String name;
	private int age;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person1() {
		super();
		this.name="null";
		this.age=0;
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void showRecord() {
		System.out.println("person.showRecord()");
		System.out.println("name : "+ this.name);
		System.out.println("age : "+this.age);
	}
	
}
class Employee1 extends Person1{
	
	private int empid;
	private float salary;
	
	public Employee1() {
		super();
		this.empid=02;
		this.salary=0;
		
	}
	public Employee1(String name, int age,int empid,float salary) {
		super(name, age);
		this.empid=empid;
		this.salary=salary;
	}
	
	public void displayRecord() {
		super.showRecord(); //can write this.showRecord()
		System.out.println("empid : "+ this.empid);
		System.out.println("salary : "+this.salary);
	}
	
}
public class ProgramSuper {
	
	public static void main(String[] args) {
		//Up-casting
		Person1 person = new Employee1();
		System.out.println("name : "+ person.getName());
		System.out.println("age : " + person.getAge());
		person.showRecord();
		
		//Down-casting
		Employee1 emp = (Employee1) person; //Down-casting : Ok
		System.out.println(emp.getName());
		emp.displayRecord();
 	}
	
	public static void main1(String[] args) {
		Employee1 emp =new Employee1();
		emp.displayRecord();
		
			//Up-casting
		/*. process of converting reference of sub class into reference of super class is called upcasting.
			In other words, super class reference can contain reference of sub class instance.
			Person1 per = new Employee1;
		  . In case of up-casting,from sub class instance , Super class reference variable can access only member of super
		    class. it is also called object slicing
		  . up-casting help us to reduce maintenance of the application
		
		*/
		//Person1 per = (Person1) emp;  // up-casting : ok
		Person1 per = emp;  // up-casting : ok
	 	per.showRecord();
	 	
	 		//Down-casting
	 	/*
	 	  . process of converting reference of super class into reference of sub class is called down-casting.
	 	  . In case of down-casting , explicit type-casting is mandatory.
	 	*/	 	
	}
}
