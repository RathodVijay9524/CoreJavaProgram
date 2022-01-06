package super_Keyword;

// 2] " super() " can be used to invoke immediate parent class constructor

class SuperDemo3 {
	
	SuperDemo3(){
		System.out.println("parent class super consturctor method");
	}

}
class childeClassSuper extends SuperDemo3 {
	
	
	childeClassSuper(){
		super();   // nahi kiya to bhi chalega ye bidefalt super callkarta hey     // super(); 
		System.out.println("Child class super consturcture method ");
	}
	
	public static void main(String[] args) {
		childeClassSuper ccs=new childeClassSuper();
		
	}
}
