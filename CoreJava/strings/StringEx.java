package strings;

public class StringEx {
	
	public static void main(String[] args) {
		
		String name = "Hyderabad ";
		
		System.out.println(name.concat("Biryani"));
		
		name.concat("Biryani");
		
		System.out.println(name);
		
		System.out.println("************");
		
		StringBuffer value = new StringBuffer("Hyderabad ");
		
		value.append("Biryani");
		
		System.out.println(value);
		
		
		
	}

}
