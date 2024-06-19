package java8;

public class Lambda {
	
	public static void main(String[] args) {

		Flower flower = 
				(name)->System.out.println("The flower name is:-"+name);
				
		flower.flower("Jasmine");
		
	}

}
