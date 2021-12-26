package singletone_class;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee emp1=Employee.getEmployee();
	Employee emp2=Employee.getEmployee();
	
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.getClass());
		
	

	}
}



class Employee {

	private Employee() {

	}
	
	private static Employee emp=new Employee();
	
	public static Employee getEmployee() {
		return emp;
		
	}
}

