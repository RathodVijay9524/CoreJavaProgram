package static_keyword;

public class staticCount {
	
	
	static int count=0;
	staticCount(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		staticCount sc=new staticCount();
		staticCount sc1=new staticCount();
		staticCount sc2=new staticCount();
		
	}

}
