package thread;

public class Test {

	public Test() {
		
	}
	//1.����һ��Runableʵ����Ķ���
	//2.����һ��Thread���󣬲���Runableʵ����Ķ�����Ϊ����������Thread����
	public static void main(String[] args) {
//		FirstThread f1=new FirstThread();
//		f1.start(); 
		
		/*SecondThead secondThead=new SecondThead();
		Thread thread=new Thread(secondThead);
		thread.setPriority(Thread.MAX_PRIORITY);
		//֪ͨThread ����ִ��start����
		System.out.println("���ȼ���"+thread.getPriority());
		thread.start();*/
		
		ThirdThead thirdThead=new ThirdThead();
		Thread t1=new Thread(thirdThead);
		Thread t2=new Thread(thirdThead);
		
		t1.setName("�߳�a��");
		t2.setName("�߳�B��");
		t1.start();
		t2.start();
		
		
	}
}
