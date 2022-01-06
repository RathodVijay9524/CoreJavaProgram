package function_interface;

public class ThreadDemo {
	
	// inbuild functional interfce
	
	public static void main(String[] args) {
		
		Runnable runnable=()->{
			for(int i=1; i<=10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(runnable);
		t.start();
	}
}
