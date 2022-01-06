package this_keyword;


//1] this keyword can be used to refer current class instance variable....

//2] this keyword can be used to invoke current class method(implicitly)
//3] this keyword can be used to invoke current class constructor
//4] this keyword can be used to pass as an argument in the method call
//5] this keyword can be used to pass as an argument in the constructor call
//6] this keyword can be used to return class instance from the method


public class this_FirstUse {

	int id;
	String name;
	float fee;
	
	
	// this keyword used to be refer carunt class instance variable --- first use of this keyword

	this_FirstUse(int id,String name,float fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
		
		
	}

	void show() {

		System.out.println(id+" "+name+" "+fee);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_FirstUse obj = new this_FirstUse(111,"Vijay",126f);
		this_FirstUse obj1 = new this_FirstUse(222,"Kiran",124f);
		this_FirstUse obj2 = new this_FirstUse(333,"Ajay",124f);
		obj.show();
		obj1.show();
		obj2.show();

	}

}
