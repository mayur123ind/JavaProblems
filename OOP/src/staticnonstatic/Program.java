package staticnonstatic;

 class Student{
	public static String schoolName="kvn";
	
	String name;
	int id;
	
	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
public class Program {

	public static void main(String[] args) {
		//Class(common) specific properties = static Properties
		//object specific properties = non-static Properties
		Student st = new Student() ;
		st.setName("maddy");
		var one = st.getName();
		 System.out.println(one + " " + Student.schoolName);
		 
		 st.setName("mayur");
		System.out.println( st.getName() + " " + Student.schoolName);
		System.out.println("School name is " + Student.schoolName);
	}

}
