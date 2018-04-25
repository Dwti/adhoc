package thread;

public class Custom extends Thread{
	Tickes t=null;
	public Custom(Tickes t) {
		this.t=t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		///???
		while (t.tickeNum<=t.count&&t.tickeNum>0) {
			t.sell();
			
		}
	}

}
