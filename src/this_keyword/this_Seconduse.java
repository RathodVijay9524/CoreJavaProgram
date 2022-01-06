package this_keyword;

public class this_Seconduse {

	//  2] this keyword can be used to invoke current class method(implicitly) .....
	
	
	void display() {
		System.out.println("this is the second use of this keyword");

	}
	void show() {
		this.display();
	}
	public static void main(String[] args) {
		
		this_Seconduse ob1=new this_Seconduse();
		ob1.show();
		
	}
}
