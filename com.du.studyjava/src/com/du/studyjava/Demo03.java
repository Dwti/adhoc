package com.du.studyjava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Demo03 test=new Demo03();
		//调用无参无返回值的函数
		test.show();
		//调用无参有返回值的函数
        int sum =test.show1();
        System.out.println("无参无返回值方法:"+sum);
        //有参数无返回值
        test.show2("我是小明");
        String show=test.show3("我是小明");
        System.out.println(show);
        //重载函数
        test.show(20,"小红");
        test.show("小红");
        test.show("小明",21);
        
        int nums[]=test.getArray(8);
        System.out.println(Arrays.toString(nums));
        
        int scores[]={89,-23,64,91,119,52,73};
//        Arrays.sort(scores);
        test.printScores(scores);
	}
	
	
	
	//无参无返回值方法
	public void show(){
		System.out.println("无参无返回值方法");
		
	}
	//无参有返回值
	public int show1(){
		int a=3;
		int b=4;
		int sum;
		sum=a+b;	
		return sum;
	}
	//有参数无返回值
	public void show2(String name){
		System.out.println("有参数无返回值："+name);
		
	}
	/*
	 * 方法重载的判断依据：
	 * 1.必须是在同一个类中
	 * 2.方法名相同
	 * 3.方法的参数个数、类型和顺序不同
	 * 4.与方法的修饰符、返回值没有关系
	 */
	//有参数有返回值
	public String show3(String name){
		
		return "有参数有返回值:"+name;
		
	}
	//重载show()方法 带1个参数
	public void show(String name){
		
		System.out.println("重载带1个参数："+name);
	}
	//重载show()方法 带2个参数
	public void show(String name,int age){
			
			System.out.println("重载带2个参数："+name+"年龄:"+age);
		}
		//重载show()方法 带2个参数且参数位置不一样
	public void show(int age,String name){	
		
	    System.out.println("重载带2个参数且顺序不一样："+name+"年龄:"+age);
				}
	
	//带参数带返回值的方法实现输出随机数组
	public int [] getArray(int arrayLength){
		
		int[] array=new int [arrayLength];
		for(int i=0;i<array.length;i++){
			array[i]=(int) (Math.random()*100);
		}
		
		return array;
	}
	/*
	 * 输出百分制的成绩的前三名，成绩数据{89，-23,64,91,119,52,73}
	 */
    public void printScores(int []scores){
        Arrays.sort(scores);
        int count=0;
        System.out.println("前三名的成绩是：");
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
