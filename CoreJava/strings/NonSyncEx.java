package strings;

public class NonSyncEx implements Runnable{

	public void run() {
		for(int i = 1 ;i <=10;i++) {
			System.out.println(i +"Child Thread");
		}
		
	}
	
	public static void main(String[] args) {
		 NonSyncEx obj = new  NonSyncEx();
		
		Thread thread = new Thread(obj);
		
		thread.start();  //run method calling
		
		for(int i = 1;i<=10;i++) {
			System.out.println(i +"Main Thread");
		}
		
	}
	
	

}
