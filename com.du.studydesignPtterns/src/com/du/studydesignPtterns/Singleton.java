package com.du.studydesignPtterns;
/*����ģʽ
 * */
public class Singleton {
//˽�л����캯��
//����Ψһ��ʵ��
	private static Singleton singleton=new Singleton();
	private Singleton() {
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
