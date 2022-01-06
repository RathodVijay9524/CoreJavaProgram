package this_keyword;


//1] this keyword can be used to refer current class instance variable....

//2] this keyword can be used to invoke current class method(implicitly)
//3] this keyword can be used to invoke current class constructor
//4] this keyword can be used to pass as an argument in the method call
//5] this keyword can be used to pass as an argument in the constructor call
//6] this keyword can be used to return class instance from the method


public class ThisTest1_FirstUser {
	
	int a;
	
	
	void setValue(int a) {
		
		this.a=a;
		
	}
	void showValue() {
		System.out.println("This is the first rull output = " +a);
	}
	
	public static void main(String[] args) {
		
		
		ThisTest1_FirstUser ob=new ThisTest1_FirstUser();
		ob.setValue(10);
		ob.showValue();
		
	}
	

}
