package com.du.studydesignPtterns;

public class Singleton1 {
/*����ģʽ*/
	private static Singleton1 instance;
	private Singleton1() {	
	}
	public  static Singleton1 getInstance() {
		if(instance==null) {
			instance=new Singleton1();	
		}
		return instance;
	}

}
