package final_keyword;

public class finalDemo2 {

	void m1() {    
		// we can not override final method if we parent method as final //final void m1() ....
		// you can try with final you will get error
		System.out.println("parent m1 method");
		
	}
}
class test extends finalDemo2 {
	
	void m1() {
		
		System.out.println("child m1 mehtod ");
		
	}
	
	public static void main(String[] args) {
		
		test t=new test();
		t.m1();
		
	}
	
}
