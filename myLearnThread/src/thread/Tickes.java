package thread;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.glass.ui.Size;

public class Tickes {
	int count;//Ʊ������
	int tickeNum=0;//Ʊ��
	boolean isTicke=false;//�Ƿ���Ʊ��Ĭ��û��
	//���캯��������Ʊ������
	public Tickes(int count) {
		this.count=count;
	}
	//ͬ������ʵ�ִ�Ʊ����
	public synchronized void putTickes(){
		if(isTicke){//�����Ʊ����Ʊ�̵߳ȴ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�����"+(++tickeNum)+"��Ʊ");
			isTicke=true;
			notify();//����֮������Ʊ���߳�
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
			System.out.println("������"+(++tickeNum)+"��ƱƱ");
			isTicke=false;
			notify();
			if(tickeNum==count){
				tickeNum=count+1;
			}
		}
	}

}
