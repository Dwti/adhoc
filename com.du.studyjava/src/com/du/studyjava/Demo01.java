package com.du.studyjava;
import java.util.Scanner;

public class Demo01 {
	public static void main(String [] ags){
		/*1.������Ҫ�Ĺ��߰�
		 * 2.д����ģ��
		 * 3.��ֵ
		 * 4.ѭ��ʵ�ֹ��ܷ���ֻҪ����60�Ͳ��ӷ���
		 * */
	Scanner input=new Scanner(System.in);
	System.out.print("�����������");//print�����ǲ��ỻ�еģ�println�����ǻ��е�
	int score=input.nextInt();//����������ֳɼ����ұ�����score������
	int count=0;//count ���ڼ�������ʼֵΪ0
	System.out.println("��ʼ�ķ�����"+score);
	if(score<=100&& score>=60){
		System.out.println("��ķ����Ѿ�����60����������Ҫ�ټӷ���");
	}
	 else if(score<0){
		 System.out.println("���������0 ������");
		
	}
	 else{
		 while(score<60){
				score++;
				count++;
	 }
//	while(score<60){
//		score++;
//		count++;
//	}
	System.out.println("�ӷִ�����"+count);
	System.out.println("���ķ�����"+score);
	
	}
}
}
