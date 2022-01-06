package this_keyword;

//  this keyword can be used to pass as an argument in the method call
class this_ForthUse {

	void m1(this_ForthUse td) {

		System.out.println("I am in m1 method");

	}

	void m2() {
		m1(this);
	}

	public static void main(String[] args) {

		this_ForthUse b = new this_ForthUse();
		b.m2();

	}

}
