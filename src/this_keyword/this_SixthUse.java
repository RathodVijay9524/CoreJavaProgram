package this_keyword;

public class this_SixthUse {
	
	//6] this keyword can be used to return class instance from the method
	
   
	this_SixthUse m1(){
		return this;
	}
	
	public static void main(String[] args) {
		
		this_SixthUse ob=new this_SixthUse();
		ob.m1();
		
	}

}
