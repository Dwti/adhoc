package thread;

public class ThirdThead implements Runnable{

	public ThirdThead() {
		
	}
int i=50;
	@Override
	public void run() {
		//ͬ�������
		synchronized (this) {
			while(true) {
				System.out.println(Thread.currentThread().getName()+i--);
				
				Thread.yield();
				if(i<0) {
					break;
				}	
			}
			
			
		}
		
		
	}

}
