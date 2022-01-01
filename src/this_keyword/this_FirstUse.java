package this_keyword;

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
