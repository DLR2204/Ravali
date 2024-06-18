package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Ravallika.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(1234);
		
		bw.newLine();

		bw.write("good \n morning");
 
		bw.newLine();
		
		char ch[] = { 'a', 'b', 'c' };

		bw.write(ch);

		bw.flush();

		bw.close();

		System.out.println("work is \n done");
	}

	// boolean,float dt's are not allowed
	// it's not reading the integer values


}
