package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import sun.print.resources.serviceui;

public class TestCharStream {

	public TestCharStream() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException {
		FileReader reader=null;
		FileWriter writer=null;
		try {
			
			reader=new FileReader("F:/workspace/com.du.studyjava/src/io/from.txt");
			writer=new FileWriter("F:/workspace/com.du.studyjava/src/io/to.txt");
			char [] c=new char[10];
			int temp=reader.read(c, 0, c.length);
			writer.write(c, 0, temp);
			for (char d : c) {
				System.out.println(d);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		}
		
	}

}
