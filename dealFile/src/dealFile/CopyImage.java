package dealFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class CopyImage {
	// π”√FileInputStream ;FileOutputStream∂¡–¥Õº∆¨
	static File file =new File("C:\\Users\\srt-k12001\\Pictures\\Camera Roll\\\\111.png");
	private static String inpath="C:\\Users\\srt-k12001\\Pictures\\Camera Roll\\111.png";
	private static String outpath="C:\\Users\\srt-k12001\\Pictures\\Camera Roll\\222.png";
	private byte[] b;
    public  byte[] readImage(String path) throws IOException{
    	FileInputStream fileInputStream=new FileInputStream(inpath);
    	b=new byte[fileInputStream.available()];
    	fileInputStream.read(b);
    	fileInputStream.close();
		return b;
    	
    	
    }
	public void writeImage(String path) throws IOException{
		FileOutputStream outputStream=new FileOutputStream(outpath);
		outputStream.write(readImage(inpath));
		outputStream.close();
	}
	public static void main(String[] args) throws IOException {
		System.out.println(file.getName());
	    	/*FileInputStream fileInputStream=new FileInputStream(file.getName());
	    	FileOutputStream outputStream=new FileOutputStream(outpath);
	    	byte[]b=new byte[fileInputStream.available()];
	    	fileInputStream.read(b);
			outputStream.write(b);
	    	fileInputStream.close();
	    	outputStream.close();*/
			
		
		
		
		
	}

}
