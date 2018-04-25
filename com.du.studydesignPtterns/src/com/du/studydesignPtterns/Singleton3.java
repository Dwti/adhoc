package com.du.studydesignPtterns;

public class Singleton3 {
	/*静态内部类的方式
	 * 线程安全的
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
