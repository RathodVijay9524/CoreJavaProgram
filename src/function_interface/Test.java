package function_interface;

class Test {

	public static void main(String[] args) {

		// seprate class for interface
		System.out.println("================ Seprate class ==================");
		MyInter myInter = new MyInterImpl();
		myInter.sayHello();
		
		
		System.out.println("================ using anonymous class ==================");
		MyInter myInter1 = new MyInter() {

			@Override
			public void sayHello() {
				System.out.println("this is the first anonymous class");

			}
		};
		myInter1.sayHello();
		
		System.out.println("======= Lambda expression using functional interface  ==================");
		
		MyInter myInter2= () -> {
			System.out.println("this is the firt time i am using lambda expression");
		};
		myInter2.sayHello();
		
		 // in one line code
		MyInter myInter3= () ->System.out.println("this is the firt time i am using lambda expression");
		myInter3.sayHello();
		
		
		System.out.println("======= call another interface method  ==================");
		SumInter si= (int a,int b)->{
			return a+b;
		};
		System.out.println(si.sum(10, 20));
		System.out.println(si.sum(20, 30));
		si.sum(10, 20);
		
		System.out.println("======= Length of the string from anothe interface  ==================");
		LengthString ls= (str)-> str.length();
		System.out.println("Get String output of given  =" + ls.getLenghtStrings("Vijay Rathod"));
		
	}

}

interface MyInter {
	public abstract void sayHello();

}

interface SumInter {
	int sum(int a, int b);
}

interface LengthString {
	int getLenghtStrings(String str);
}

class MyInterImpl implements MyInter {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("I am saying hellow from MyInterImpl");

	}

}
