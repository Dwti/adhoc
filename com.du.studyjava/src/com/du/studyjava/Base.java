package com.du.studyjava;
import com.du.studyjava.Telphone;
import com.du.studyjava.Telphone.Inner;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone testphone=new Telphone();
		
		//�����ڲ������
		Inner smallPhone=testphone. new Inner();
//		Telphone testphone2=new Telphone(5.0f,34.3f,64f,"pink");
////		testphone.color="#238993";
//		testphone.call();
//		testphone.sedMessage();
////		System.out.println("�������þ�̬��Ա����"+Telphone.className);
////		System.out.println("������þ�̬��Ա����"+testphone.className);
		//ͨ��set������screen��ֵ
		testphone.setScreen(6.7f);
		System.out.println(testphone.getScreen());
//		System.out.println(testphone.cup);
//		System.out.println(Telphone.className);
		
		//�����ڲ������name
		System.out.println(smallPhone.name);
		smallPhone.print(); 
		Gphone xiaomi=new Gphone();
		Gphone xiaomi1=new Gphone();
		xiaomi.call();
		System.out.println(xiaomi);
		//�ж��Ƿ���ȣ�����==��������һ����
		if(xiaomi.equals(xiaomi1)){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}
		//�������е�ʵ��������
		Moblie iphone7=new Iphone();
		iphone7.callMessage();
		
		//�ӿ�
		IPlayGame iPhone6s=	new Iphone();
		IPlayGame psp1=new 	Psp();
		iPhone6s.playGame();
		psp1.playGame();
		//ʹ�������ڲ���ʹ�ýӿ�
		IPlayGame iPhone6=	new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ʹ�ýӿ�");
			}
			
		};
		iPhone6.playGame();
		
		//ֱ��new�ӿ�
		new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ʹ�ýӿ�2222");
			}
			
		}.playGame(); 
    }
}


