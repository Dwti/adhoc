package base;

import com.sun.glass.ui.TouchInputSupport;
import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class TestChar {
	//Java��ʹ��Unicode���룬һ���ַ����Դ洢һ������
/*
 * ���캯��
 * 
 * */
	public TestChar() {
		
	}
	
	/*����������
	 * �������߶��������ͬһ���൱��
	 * ��������ͬ
	 * �����б�ͬ
	 * 
	 * */
	void fun() {
		System.out.println("û�в����ĺ���");
	}
	void fun(int i) {
		this.fun();//this�ؼ��ֵ��ó�Ա����
		System.out.println("û�в����ĺ���"+i);
	}

	public static void main(String[] args) {
		char c='��';
		boolean b=false;
		byte a0=1;
		short a1=0;
		int a2=3/2;
		long a3=0;
		float a4=0.1F;
		double a5=3.0/2; 
		boolean m=true;
		boolean n=false;
		boolean j=m&n;
		boolean k=m&&n;
//		System.out.println(k);
		
		char ch='a';
		//switch�ı��ʽ������ֻ����:byte��short��int��char
		switch (ch) {
		case 'b':
			System.out.println(ch);
			break;
		case 'c':
			System.out.println(ch);
			break;
		case 'a':
			System.out.println(ch);
			break;
		default:
			break;
		}
		//whileѭ��
		int l=0; 
		while(l<8) {
			System.out.println(l);
			l++;
		}
		
		TestChar testChar=new TestChar();
		testChar.fun(1);
		testChar.fun();
		

	}

}
