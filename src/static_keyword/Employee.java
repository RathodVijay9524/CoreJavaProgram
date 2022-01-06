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

       // static use for memory mgmt .... for memory eficency
      // .... static can share memory for manny objects (stack area) ---stored
/* 1]  A "static" methods belongs to the class, not to the object
 * 2]  A "static" method can be accessed directly by class name and does'nt need any object
 * 3]  A "static" method can access only static data. it cannot access non-static data(instance data)
 * 4]  A "static" method can call only other static method and cannot call a non-static method
 * 5]  A "static" method cannot refer to "this" or "super" keyword in anyway
 * 
 * */

