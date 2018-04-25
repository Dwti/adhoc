package com.du.studyjava;
import com.du.studyjava.Telphone;
import com.du.studyjava.Telphone.Inner;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone testphone=new Telphone();
		
		//创建内部类对象
		Inner smallPhone=testphone. new Inner();
//		Telphone testphone2=new Telphone(5.0f,34.3f,64f,"pink");
////		testphone.color="#238993";
//		testphone.call();
//		testphone.sedMessage();
////		System.out.println("类名调用静态成员变量"+Telphone.className);
////		System.out.println("对象调用静态成员变量"+testphone.className);
		//通过set方法给screen赋值
		testphone.setScreen(6.7f);
		System.out.println(testphone.getScreen());
//		System.out.println(testphone.cup);
//		System.out.println(Telphone.className);
		
		//访问内部类对象name
		System.out.println(smallPhone.name);
		smallPhone.print(); 
		Gphone xiaomi=new Gphone();
		Gphone xiaomi1=new Gphone();
		xiaomi.call();
		System.out.println(xiaomi);
		//判断是否相等，跟“==”运算是一样的
		if(xiaomi.equals(xiaomi1)){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		//抽象类中的实例化对象
		Moblie iphone7=new Iphone();
		iphone7.callMessage();
		
		//接口
		IPlayGame iPhone6s=	new Iphone();
		IPlayGame psp1=new 	Psp();
		iPhone6s.playGame();
		psp1.playGame();
		//使用匿名内部类使用接口
		IPlayGame iPhone6=	new IPlayGame(){

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类使用接口");
			}
			
		};
		iPhone6.playGame();
		
		//直接new接口
		new IPlayGame(){
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类使用接口2222");
			}
			
		}.playGame(); 
    }
}


