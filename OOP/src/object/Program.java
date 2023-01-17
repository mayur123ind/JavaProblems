package object;

public class Program {

	public static void main(String[] args) {
		//object class is parent of all other classes
		//top most class in hierarchy
		/*
		 * The Object class is beneficial if you want to refer any object whose type you don't know. 
		 * Notice that parent class reference variable can refer the child class object,
		 * know as up-casting.
		 * */
//		Student st= new Student();
//		Object s1 = st.getStudent();
//		System.out.println(s1);
		
		Student st = new Student(1, "mayur");
		System.out.println(st);
		
		
		Employee emp = new Employee();
		Object emp1 = emp.getEmployee();
		System.out.println(emp1);

	}

	
}
