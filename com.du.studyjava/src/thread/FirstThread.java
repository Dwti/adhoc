package thread;

public class FirstThread extends Thread {

	public FirstThread() {
		
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
		
		
	}

}
