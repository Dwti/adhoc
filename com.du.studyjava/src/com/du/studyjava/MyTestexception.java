package com.du.studyjava;

import java.io.IOException;
import java.util.Scanner;



public class MyTestexception {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=10;
		int b=input.nextInt();
        int re=a/b;
		if(b==0){
		System.out.println("����Ϊ0���������﷨����");
		
		}
		else{
			System.out.println(re);
		}
		
	}

	
	
}
        
  

        	
