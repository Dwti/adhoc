package base;

import com.sun.glass.ui.TouchInputSupport;
import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class TestChar {
	//Java是使用Unicode编码，一个字符可以存储一个汉字
/*
 * 构造函数
 * 
 * */
	public TestChar() {
		
	}
	
	/*函数的重载
	 * 两个或者多个函数在同一个类当中
	 * 函数名相同
	 * 参数列表不同
	 * 
	 * */
	void fun() {
		System.out.println("没有参数的函数");
	}
	void fun(int i) {
		this.fun();//this关键字调用成员函数
		System.out.println("没有参数的函数"+i);
	}

	public static void main(String[] args) {
		char c='中';
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
		//switch的表达式的类型只能是:byte、short、int、char
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
		//while循环
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
