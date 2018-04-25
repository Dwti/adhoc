package com.du.studydesignPtterns;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		

	}

}
