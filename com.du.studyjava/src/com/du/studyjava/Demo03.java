package com.du.studyjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Demo03 test=new Demo03();
		//�����޲��޷���ֵ�ĺ���
		test.show();
		//�����޲��з���ֵ�ĺ���
        int sum =test.show1();
        System.out.println("�޲��޷���ֵ����:"+sum);
        //�в����޷���ֵ
        test.show2("����С��");
        String show=test.show3("����С��");
        System.out.println(show);
        //���غ���
        test.show(20,"С��");
        test.show("С��");
        test.show("С��",21);
        
        int nums[]=test.getArray(8);
        System.out.println(Arrays.toString(nums));
        
        int scores[]={89,-23,64,91,119,52,73};
//        Arrays.sort(scores);
        test.printScores(scores);
	}
	
	
	
	//�޲��޷���ֵ����
	public void show(){
		System.out.println("�޲��޷���ֵ����");
		
	}
	//�޲��з���ֵ
	public int show1(){
		int a=3;
		int b=4;
		int sum;
		sum=a+b;	
		return sum;
	}
	//�в����޷���ֵ
	public void show2(String name){
		System.out.println("�в����޷���ֵ��"+name);
		
	}
	/*
	 * �������ص��ж����ݣ�
	 * 1.��������ͬһ������
	 * 2.��������ͬ
	 * 3.�����Ĳ������������ͺ�˳��ͬ
	 * 4.�뷽�������η�������ֵû�й�ϵ
	 */
	//�в����з���ֵ
	public String show3(String name){
		
		return "�в����з���ֵ:"+name;
		
	}
	//����show()���� ��1������
	public void show(String name){
		
		System.out.println("���ش�1��������"+name);
	}
	//����show()���� ��2������
	public void show(String name,int age){
			
			System.out.println("���ش�2��������"+name+"����:"+age);
		}
		//����show()���� ��2�������Ҳ���λ�ò�һ��
	public void show(int age,String name){	
		
	    System.out.println("���ش�2��������˳��һ����"+name+"����:"+age);
				}
	
	//������������ֵ�ķ���ʵ������������
	public int [] getArray(int arrayLength){
		
		int[] array=new int [arrayLength];
		for(int i=0;i<array.length;i++){
			array[i]=(int) (Math.random()*100);
		}
		
		return array;
	}
	/*
	 * ����ٷ��Ƶĳɼ���ǰ�������ɼ�����{89��-23,64,91,119,52,73}
	 */
    public void printScores(int []scores){
        Arrays.sort(scores);
        int count=0;
        System.out.println("ǰ�����ĳɼ��ǣ�");
    	for(int i=scores.length-1;i>=0;i--){
    		if (scores[i]<0 || scores[i]>100){
    			continue;
    		}
    		else{
    			
    			System.out.print(scores[i]+",");
    			count++;
    			if (count==3){
    				break;
    			}
    			
    		}
		}
    }
}
