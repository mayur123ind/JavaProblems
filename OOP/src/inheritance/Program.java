package inheritance;

//Single Inheritance

class Person{
	
	String name;
	int age;
	
	public Person() {
		super();
		this.name="mayur";
		this.age=25;
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


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
	
	public void showRecord() {
		System.out.println("person.showRecord()");
		System.out.println("name : "+ this.name);
		System.out.println("age : "+age);
	}
	
	public void printRecord() {
		System.out.println("person.printRecord()");
		System.out.println("name : "+ name);
		System.out.println("age : "+this.age);
	}
	
}

class Employee extends Person{
	
}
public class Program {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("name :" +emp.name);
		System.out.println("age :" +emp.age);
		emp.showRecord();
		//p.printRecord();

	}
	
	public static void main2(String[] args) {
		Person p = new Person("mayur",28);
		p.showRecord();
		p.printRecord();

	}
	public static void main1(String[] args) {
		Person p = new Person();
		p.showRecord();
		p.printRecord();

	}

}
