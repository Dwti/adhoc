package thread;

public class Productor extends Thread{
   Tickes t=null;
   public Productor(Tickes t) {
	// TODO Auto-generated constructor stub
	   this.t=t;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(t.tickeNum<t.count){
	        t.putTickes();
		}
		
	}

}
