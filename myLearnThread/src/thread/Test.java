package thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer du=new Customer();
		Customer li=new Customer();
		Customer liu=new Customer();
		Thread  t1=new Thread(du,"�Ÿ�");
		Thread t2=new Thread(li,"���");
		Thread t3=new Thread(liu,"���޹�");
//		t1.start();
//		t2.start();
//		t3.start();
		Tickes tickes=new Tickes(2);
//		Thread t4=new Thread(new Productor(tickes));
//		Thread t5=new Thread(new Custom(tickes));
		
//		t4.start();
//		t5.start();
		new Productor(tickes).start();
		new Custom(tickes).start();
		
	}

}
