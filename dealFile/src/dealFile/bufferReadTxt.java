package dealFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;

public class bufferReadTxt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count = 0;//��ȡ������
		FileReader reader=new FileReader("C:\\Users\\srt-k12001\\Desktop\\��ѧ.txt");//�����ļ�·��
		FileWriter writer=new FileWriter("C:\\Users\\srt-k12001\\Desktop\\��ѧ1.txt");
		BufferedReader bufferedReader=new BufferedReader(reader);
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		while (bufferedReader.readLine()!=null) {
			count++;
			bufferedWriter.write(bufferedReader.readLine());
			
//			System.out.println(bufferedReader.readLine());
		}
		bufferedWriter.flush();//���������Ķ���ȫ��д���ļ�
		System.out.println(count);
		bufferedReader.close();
		bufferedWriter.close();

	}

}
