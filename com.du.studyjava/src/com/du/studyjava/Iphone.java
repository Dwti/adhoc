package com.du.studyjava;

public class Iphone extends Moblie implements IPlayGame{

	@Override
	public void callMessage() {
		// TODO Auto-generated method stub
		System.out.println("重写抽象类中的方法");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("iosphone可以玩游戏");
	}

}
