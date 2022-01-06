package static_keyword;

 class static_Method {
	 
	 static void display() {
		 System.out.println(" i am inside class");
	 }
	 public static void main(String[] args) {
		 
		display();
		test2.show();
		
	}

}
class test2{
	
 static void show() {
	 System.out.println("I am outside class");
		 
	 }
	
}
