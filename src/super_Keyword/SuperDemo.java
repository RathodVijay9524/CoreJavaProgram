package super_Keyword;


// 1]  " super " keyword refer to the immediate parent class instance variable 

class SuperDemo {
	int i=10;

}
class ChildClass extends SuperDemo{
	
	int i=20;
	
	void show(int i) {
		
		System.out.println(i);             // 30
		System.out.println("this output is child class this keyword " +this.i);  // 20
		System.out.println("this outputfor super   keyword         " +super.i);  // 10
	} 

	public static void main(String[] args) {
		
		ChildClass sd=new ChildClass();
		sd.show(30);
		
		
	}
}
