package com.du.studyjava;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*功能：实现3个班各4名学员的成绩，然后计算没个班级的学员的平均分
		 * 
		 */
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("请输入班级数：");
//
//         int classNumber=input.nextInt();//班级数
//         int studentNumber;
//         double sum=0;//总分
//         double avg=0;//平均分
//         for(int i=0;i<=classNumber;i++){
//     		Scanner inputnumber=new Scanner(System.in);
//     		System.out.println("请输入学生数：");
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
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
        System.out.println("平均值："+avg);
	}

}
