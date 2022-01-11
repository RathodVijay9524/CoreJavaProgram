package SerilizationAndDesirilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int st_id;
	String name;
	String address;
	
	public static void main(String[] args) throws FileNotFoundException {
		Student st=new Student();
		st.st_id=111;
		st.name="Vijay";
		st.address="pune";
		
		try {
			FileOutputStream fileOut=new FileOutputStream("E:/Video Programin/s.txt");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(st);
			out.close();
			fileOut.close();
			System.out.println("Object serialized and saved in s.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
