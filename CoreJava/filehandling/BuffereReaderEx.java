package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffereReaderEx {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Videos\\RavalikaDailyNotes.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String value = br.readLine();
		
		while(value!=null) {
			System.out.println(value);
			
			value = br.readLine();
		} 
		
		System.out.println("work is done");
	}

}
