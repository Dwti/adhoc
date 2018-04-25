package thread;

public class Customer implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<2;i++){
			try {
				Mback.takeMoney(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
