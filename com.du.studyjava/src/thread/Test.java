package thread;

public class Test {

	public Test() {
		
	}
	//1.生成一个Runable实现类的对象
	//2.生成一个Thread对象，并将Runable实现类的对象作为参数传给该Thread对象
	public static void main(String[] args) {
//		FirstThread f1=new FirstThread();
//		f1.start(); 
		
		/*SecondThead secondThead=new SecondThead();
		Thread thread=new Thread(secondThead);
		thread.setPriority(Thread.MAX_PRIORITY);
		//通知Thread 对象执行start方法
		System.out.println("优先级："+thread.getPriority());
		thread.start();*/
		
		ThirdThead thirdThead=new ThirdThead();
		Thread t1=new Thread(thirdThead);
		Thread t2=new Thread(thirdThead);
		
		t1.setName("线程a：");
		t2.setName("线程B：");
		t1.start();
		t2.start();
		
		
	}
}
