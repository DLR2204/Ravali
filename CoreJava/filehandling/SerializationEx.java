package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException {
		
		Employee emp = new Employee(100, "Ravallika", 943847439, "india");
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Ravallika.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(fo);
		
		obj.writeObject(emp);
		
		System.out.println("work is done");
		
	}

}
