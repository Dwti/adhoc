package com.du.studyjava;
import java.util.Scanner;

public class Demo01 {
	public static void main(String [] ags){
		/*1.导入需要的工具包
		 * 2.写输入模块
		 * 3.赋值
		 * 4.循环实现功能分数只要大于60就不加分了
		 * */
	Scanner input=new Scanner(System.in);
	System.out.print("请输入分数：");//print方法是不会换行的，println方法是换行的
	int score=input.nextInt();//把输入的数字成绩并且保存在score变量中
	int count=0;//count 用于计数，初始值为0
	System.out.println("初始的分数："+score);
	if(score<=100&& score>=60){
		System.out.println("你的分数已经大于60分啦！不需要再加分啦");
	}
	 else if(score<0){
		 System.out.println("请输入大于0 的数字");
		
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
	System.out.println("加分次数："+count);
	System.out.println("最后的分数："+score);
	
	}
}
}
