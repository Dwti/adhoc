package com.du.studydesignPtterns;

public class Singleton3 {
	/*��̬�ڲ���ķ�ʽ
	 * �̰߳�ȫ��
	 * */

	private Singleton3() {
	}
	public static Singleton3 getInstance() {
		return SingletonHolder.instance;
	}
	private static class SingletonHolder{
		private static Singleton3 instance=new Singleton3();
		
	}

}
