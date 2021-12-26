package singletone_class;

public class NarmalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1=new Student();
		Student st2=new Student();
		
		System.out.println(st1.equals(st2));
		System.out.println(st1==st2);
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		System.out.println(st2.getClass());
		
	
		

	}

}

class Student {

}
