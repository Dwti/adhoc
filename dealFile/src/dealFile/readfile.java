package dealFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import com.sun.javafx.geom.Vec3d;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.wsdl.parser.MexEntityResolver;

import sun.applet.Main;
import java.awt.*;

public class readfile {  
	private String path;
	String strings;
	ArrayList list=new ArrayList<>();
	public readfile() {
		
	}
	
	public void readFileName(String path) {
		File file=new File(path);
		File[] files=file.listFiles();
		for(File subfile:files){
			if(subfile.exists()&&subfile.isDirectory()){
				readFileName(path+subfile.separator+subfile.getName());//�ݹ鷽��
			}
			else{
				
				System.out.println(path+subfile.separator+subfile.getName());
			}
		}
	}
	//�ǵݹ�ȡ�ļ�����
	public void readFileNameTree(String path){
		File rootfile=new File(path);
		File[] files=rootfile.listFiles();
		Stack<String> stack=new Stack<>();//stack�ݴ�path
		for(File f:files){
			if(f.isFile()){
				System.out.println(f.getAbsolutePath());
			}else {
				stack.add(f.getAbsolutePath());//���ļ�·���ӵ�stack��
			}
		}
		while(!stack.isEmpty()){
			String string=stack.pop();//ȡ���ļ�·��
			rootfile=new File(string);
			files=rootfile.listFiles();
			for(File f:files){
				if(f.isFile()){
					System.out.println(f.getAbsolutePath());
				}else {
					stack.push(f.getAbsolutePath());//���ļ���������ļ����зŲ�stack��
				}
			}
			
		}
	}
}
