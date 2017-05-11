package com.du.zxing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Testsigner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List filepaths=new ArrayList();
//		String st="\\";
//		st=st.replace("\\", "/");
//		System.out.println(st.toString());
		String path=null;
		String file = "F:\\V1.0.0\\";//需要读取的文件路径
		BufferedReader br = null;
		Process p;
		Readfile cm=new Readfile();
		filepaths=cm.readFilePath(file);
		for(int i=0;i<filepaths.size();i++){
		path=(String) filepaths.get(i);  //强转成String类
		try {
			p = Runtime.getRuntime().exec("jarsigner -verify "+path);
			br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		    String line = null;
			line=br.readLine();
			
			while(line != null){
		    	System.out.println(path+"---- "+line);
		    	break;
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	    
//		System.out.println(path);
		}
		
	}
	}


