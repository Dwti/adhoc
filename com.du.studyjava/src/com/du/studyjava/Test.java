package com.du.studyjava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		//基本数据类型转换成字符串的三种方法
//		String a1=Integer.toString(a);
//		String a1=String.valueOf(a);
//		String a1=a+"";
		
		String str=new String("hello");
		String str1=new String("hello");
		String srt2="12";
//		int d=Integer.parseInt(srt2);
		int d=Integer.valueOf(srt2);
		System.out.println(d);
//		System.out.println("是否相等"+str==str1);
//		System.out.println("是否相等？"+str.equals(str1));
//		System.out.println("是否相等"+str==srt2);
//		System.out.println("是否相等？"+str.equals(srt2));
//		System.out.println( a==b);
		StringBuilder message=new StringBuilder("hehhehehaaaaajdejaajdejadejadejjjoocedjscnaaaaadeenajdejaldea");
		char ch='m';
		int count =0;
		//把对象转化成String对象
		//先把字符串数组转化成byte数组
		byte[] mes=message.toString().getBytes();
//		byte[] mes=message.getBytes();
		for(int i=0;i<mes.length;i++){
			if(mes[i]==ch){
				count++;
			}else{
				continue;
			}	
		}
		System.out.println( count);

	}

}
