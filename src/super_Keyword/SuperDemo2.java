package super_Keyword;

// 2] "super" keyword can be used to invoke immediate parent class method

 class SuperDemo2 {
	
	void m1() {
		System.out.println("this is super m1 method");
	}

}
   class ChildDemo2 extends SuperDemo2 {
	   
	   void m1() {
		   
	   }
	   void m2() {
		   super.m1();
	   }
	   public static void main(String[] args) {
		
		   ChildDemo2 cl=new ChildDemo2();
		   cl.m2();
	}
   }

