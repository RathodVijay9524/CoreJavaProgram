package this_keyword;

// this keyword can be used to invoke current class constructor

public class this_ThirdUse {
	
	this_ThirdUse(){
		this(10);
		System.out.println(" no-argument constructor ");
	}
	
	this_ThirdUse(int a) {
		
		//this();
		System.out.println(" parameterizes Constructor");
		
	}
	public static void main(String[] args) {
		
		this_ThirdUse ob=new this_ThirdUse();
		
	}
	

}
