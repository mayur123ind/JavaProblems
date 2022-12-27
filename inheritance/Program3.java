package arr;

class Employee2{
	private String name;
	private int empid;
	private String depart;
	private float salary;
	
	public Employee2() {}

	public Employee2(String name, int empid, String depart, float salary) {
		
		this.name = name;
		this.empid = empid;
		this.depart = depart;
		this.salary = salary;
	}
	
	public void printRecord() {
		System.out.println(" name : " + this.name);
		System.out.println(" empid : " + this.empid);
		System.out.println(" depart : " + this.depart);
		System.out.println(" salary : " + this.salary);
		
	}

	@Override
	public String toString() {
		//return this.name + " "+ this.empid + " " + this.salary;
		return String.format("%-15s%-4d%-10.2f" , this.name ,this.empid,this.salary);
	}
	
}
public class Program3 {
	public static Employee2[] getemployees() {
		
		Employee2[] arr = new Employee2[3];
		arr[0] = new Employee2("maddy",10,"dev",50000);
		arr[1] = new Employee2("mayur",20,"engg",430000);
		arr[2] = new Employee2("krishna",30,"god",60000);
		return arr;
		
	}

	public static void main(String[] args) {
		Employee2[] employees = Program3.getemployees();
		for (Employee2 employee : employees) {
			System.out.println(employee.toString());
		}
	}

}
