package com.du.studyjava;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*���ܣ�ʵ��3�����4��ѧԱ�ĳɼ���Ȼ�����û���༶��ѧԱ��ƽ����
		 * 
		 */
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("������༶����");
//
//         int classNumber=input.nextInt();//�༶��
//         int studentNumber;
//         double sum=0;//�ܷ�
//         double avg=0;//ƽ����
//         for(int i=0;i<=classNumber;i++){
//     		Scanner inputnumber=new Scanner(System.in);
//     		System.out.println("������ѧ������");
//     		studentNumber=input.nextInt();
//        	 for (int j=0;j<=studentNumber;j++){
//        		 
//        		 
//        	 }
		double  max = 0;
		double  min = 4 ;
		double  avg=0;
		double  sum=0;
		int score[]=new int[]{61,23,4,13,148,20};
		for(int i=0;i<score.length;i++){
			if(score[i]>max){
				max=score[i];
			}
			else if(score[i]<=min){
				min=score[i];
			}
		    sum+=score[i];
        	avg=sum/score.length;
        	
         }
		System.out.println("���ֵ��"+max);
		System.out.println("��Сֵ��"+min);
        System.out.println("ƽ��ֵ��"+avg);
	}

}
