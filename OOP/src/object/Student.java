package object;

public class Student {
	
	private int rollNumber;
	private String name;
	
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}


	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}


//	public Student getStudent() {
//		return new Student();
//	}
	
	
}
