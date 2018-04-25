package base;

import sun.print.resources.serviceui;

/**
 * 
 * @author dutingting
 * static 关键字
 * 静态成员变量可以使用类名调用，也可以使用对象调用
 * 
 */
public class TestStatic {
	static String name;
	
	static int i;//相当于全局变量
	public TestStatic() {
		
	}
	
	 static void talk() {
		System.out.println(name);
	}
	/**
	 * 静态函数
	 * 普通成员变量只能使用对象调用
	 * 静态函数不能调用非静态成员变量
	 */
	static void fun() {
		System.out.println("我是静态函数");
	}
/**
 * 静态代码块
 *一般为成员变量赋初值
 *使用的频率很少的
 */
	static {
		System.out.println("我是一个静态的代码块");
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
