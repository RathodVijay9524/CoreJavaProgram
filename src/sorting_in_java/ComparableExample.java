package sorting_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();
		student.add(new Student(111, "Vihan Rathod"));
		student.add(new Student(222, "Rohan Rathod"));
		student.add(new Student(333, "Ajay Rathod"));
		student.add(new Student(444, "Kiran Rathod"));
		student.add(new Student(555, "Neha Rathod"));
		
		student.forEach(System.out::println);
		
		System.out.println("===========================");

		Collections.sort(student);

		student.forEach(System.out::println);

	}

}

class Student implements Comparable<Student> {
	private int mark;
	private String name;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", name=" + name + "]";
	}

	public Student(int mark, String name) {
		super();
		this.mark = mark;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		
		if(this.mark > obj.mark)
		return -1;
		else if(this.mark < obj.mark)
			return 1;
		return 0;
	}

}
