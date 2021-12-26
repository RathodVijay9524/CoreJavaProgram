package singletone_class;

public class AppConfig {
	
	private AppConfig() {
		
	}
	private static AppConfig obj=new AppConfig();
	
	public static AppConfig getInstance() {
		return obj;
		
	}

}
 
 
 class Test{
	 
	 public static void main(String[] args) {
		AppConfig obj1=AppConfig.getInstance();
		AppConfig obj2=AppConfig.getInstance();
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println(obj1.getClass());
		
				
	}
	
}


