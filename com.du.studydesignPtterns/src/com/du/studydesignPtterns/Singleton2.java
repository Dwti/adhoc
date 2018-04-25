package com.du.studydesignPtterns;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Singleton2 {
/*Í¬²½´úÂë¿é*/
	private volatile static Singleton2 instance;
	private Singleton2() {
	}
	public static Singleton2 getInstance() {
		if(instance==null) {
			synchronized (Singleton2.class) {
				if(instance==null) {
					instance=new Singleton2();
				}
				
			}
		}
		return instance;
	}
	

}
