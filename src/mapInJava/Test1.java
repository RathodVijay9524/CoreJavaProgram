package mapInJava;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	
	public static void main(String[] args) {
		
		Student student=new Student("Vijay");
		Student student2=new Student("Ajay");
		
		
		Map<Student, String> map1=new HashMap<>();
		Map<Student, String> map2=new HashMap<>();
		
		map1.put(student, "India");
		map2.put(student2, "US");
	
		System.out.println(map1.get(student));
		System.out.println(map2.get(student2));
		
		
	
		
	}

}
 class Student{

	 private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 

	

	
	
}
