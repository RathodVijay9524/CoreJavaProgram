package static_keyword;

public class Employee {

	Integer id;
	String name;
	static String company="VihanTech" ;    // String company;

	/* public Employee(Integer id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	} */
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}

	void display() {
		System.out.println(id + " " + name + " " + company);
	}

}

class Test {
	public static void main(String[] args) {
		
		Employee emp = new Employee(111, "Vijay");
		Employee emp1 = new Employee(222, "Kiran");
		Employee emp2 = new Employee(333, "Ravi");
		/*
		Employee emp = new Employee(111, "Vijay", "VihanTech");
		Employee emp1 = new Employee(222, "Kiran", "VihanTech");
		Employee emp2 = new Employee(333, "Ravi", "VihanTech");
		*/
		emp.display();
		emp1.display();
		emp2.display();
	}
}
