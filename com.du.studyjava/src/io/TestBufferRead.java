package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferRead {

	public TestBufferRead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileReader=new FileReader("F:/workspace/com.du.studyjava/src/io/from.txt");
			bufferedReader=new BufferedReader(fileReader);
			String line=null;
			while(true) {
				line=bufferedReader.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			bufferedReader.close();
			fileReader.close();
			
		}

	}

}
