package base;

import sun.print.resources.serviceui;

/**
 * 
 * @author dutingting
 * static �ؼ���
 * ��̬��Ա��������ʹ���������ã�Ҳ����ʹ�ö������
 * 
 */
public class TestStatic {
	static String name;
	
	static int i;//�൱��ȫ�ֱ���
	public TestStatic() {
		
	}
	
	 static void talk() {
		System.out.println(name);
	}
	/**
	 * ��̬����
	 * ��ͨ��Ա����ֻ��ʹ�ö������
	 * ��̬�������ܵ��÷Ǿ�̬��Ա����
	 */
	static void fun() {
		System.out.println("���Ǿ�̬����");
	}
/**
 * ��̬�����
 *һ��Ϊ��Ա��������ֵ
 *ʹ�õ�Ƶ�ʺ��ٵ�
 */
	static {
		System.out.println("����һ����̬�Ĵ����");
	}
	
	public static void main(String[] args) {
		TestStatic.i=2;
		TestStatic static1=new TestStatic();
		TestStatic static2=new TestStatic();
//		static1.i=10;
//		System.out.println(static1.i);
//		System.out.println(static2.i);
		TestStatic.fun();
		
	}

}
