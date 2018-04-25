package thread;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.glass.ui.Size;

public class Tickes {
	int count;//票的总数
	int tickeNum=0;//票号
	boolean isTicke=false;//是否有票，默认没有
	//构造函数，传入票的总数
	public Tickes(int count) {
		this.count=count;
	}
	//同步方法实现存票功能
	public synchronized void putTickes(){
		if(isTicke){//如果有票，存票线程等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("存入第"+(++tickeNum)+"号票");
			isTicke=true;
			notify();//存完之后唤醒售票的线程
		}
		
	}
	public synchronized void sell(){
		if(!isTicke){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("卖出了"+(++tickeNum)+"号票票");
			isTicke=false;
			notify();
			if(tickeNum==count){
				tickeNum=count+1;
			}
		}
	}

}
