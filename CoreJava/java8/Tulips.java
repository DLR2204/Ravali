package java8;

public class Tulips {
	
	public static void main(String[] args) {
	
		Flower flower = new Flower() {

			@Override
			public void flower(String name) {
				System.out.println("The flower name is:-" + name);}

			

			
			};
			
			flower.flower("Tulips");
	}
	
	

}
