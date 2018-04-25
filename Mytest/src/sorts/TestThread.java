package sorts;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestThread implements Runnable{
	private String name;
	private Object pre;//前一个线程对象
	private Object self;//自己当前的线程对象
	public TestThread(String name, Object pre, Object self) {
		super();
		this.name = name;
		this.pre = pre;
		this.self = self;
	}

	public TestThread() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		Object a=new Object();
		Object b=new Object();
		Object c=new Object();
		TestThread pa=new TestThread("A", c, a);
		TestThread pb=new TestThread("B", a, b);
		TestThread pc=new TestThread("C", b, c);
		new Thread(pa).start();
		Thread.sleep(100);//保证顺序执行
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);
		
	}

	@Override
	public void run() {
		int count=10;
		while(count>0) {
			synchronized (pre) {
				synchronized (self) {
					System.out.print(name);
					count--;
			    self.notify();//去唤醒其他的线程
				}
				try {
					pre.wait();//让前一个线程处于阻塞状态
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

}
