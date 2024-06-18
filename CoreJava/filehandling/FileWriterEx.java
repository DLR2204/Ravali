package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Ravallika.txt");
	
		fw.write(1234);
		
		fw.write("good \n morning");
		
		char ch[] = {'a','b','c'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("work is \n done");
	
	}
//boolean,float dt's are not allowed
	//it's not reading the integer values
	//no new line option
}
