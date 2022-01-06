

package this_keyword;


//5] this keyword can be used to pass as an argument in the constructor call

class this_FifthUse {
 
	this_FifthUse(Test1 td){
	 
	 System.out.println("Test class constructor");
	 
 }

}

class Test1 {


void m2() {
	
	this_FifthUse ob=new this_FifthUse(this);
	
}
public static void main(String[] args) {

	
	
	Test1 t=new Test1();
	t.m2();
	
	
}
}


