package com.du.studyjava;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		//������������ת�����ַ��������ַ���
//		String a1=Integer.toString(a);
//		String a1=String.valueOf(a);
//		String a1=a+"";
		
		String str=new String("hello");
		String str1=new String("hello");
		String srt2="12";
//		int d=Integer.parseInt(srt2);
		int d=Integer.valueOf(srt2);
		System.out.println(d);
//		System.out.println("�Ƿ����"+str==str1);
//		System.out.println("�Ƿ���ȣ�"+str.equals(str1));
//		System.out.println("�Ƿ����"+str==srt2);
//		System.out.println("�Ƿ���ȣ�"+str.equals(srt2));
//		System.out.println( a==b);
		StringBuilder message=new StringBuilder("hehhehehaaaaajdejaajdejadejadejjjoocedjscnaaaaadeenajdejaldea");
		char ch='m';
		int count =0;
		//�Ѷ���ת����String����
		//�Ȱ��ַ�������ת����byte����
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
