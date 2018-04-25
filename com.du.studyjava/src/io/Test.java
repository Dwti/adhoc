package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.jmx.snmp.SnmpStringFixed;

public class Test {

	public Test() {

   
    
	}
	public static void main(String[] args) throws IOException {
		 FileInputStream fileInputStream=null;
		 FileOutputStream fileOutputStream=null;
		 try {
			fileInputStream=new FileInputStream("F:/workspace/com.du.studyjava/src/io/from.txt");
			fileOutputStream=new FileOutputStream("F:/workspace/com.du.studyjava/src/io/to.txt");
			byte [] buffer=new byte[20];
			int temp=fileInputStream.read(buffer,0,buffer.length);
			fileOutputStream.write(buffer,0,temp);
			String string=new String(buffer);
			//String 的 trim()方法，将会去掉首位的空格
			string=string.trim();
//			for (byte b : buffer) {
//				System.out.println(b);
//			}
			System.out.println(string);
//		
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		 finally {
			 fileInputStream.close();
			 fileOutputStream.close();
		 }
	}

}
