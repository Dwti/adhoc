package com.du.studydesignPtterns;
/*饿汉模式
 * */
public class Singleton {
//私有化构造函数
//声明唯一的实例
	private static Singleton singleton=new Singleton();
	private Singleton() {
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
