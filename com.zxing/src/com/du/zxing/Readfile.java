package com.du.zxing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readfile {
public List readFilePath(String path){
		
        List filepaths=new ArrayList();
		File f = new File(path);
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//��Ҫ����׳��쳣  ִ������һ���ļ�
		File files[] = new File(path).listFiles();
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){//�ļ��е��ļ�
				String filename = files[i].getName();
				String filepath = files[i].getPath();
//				filepath.replaceAll("\\", "/");
				filepaths.add(filepath.replace("\\", "/" ));//��"\"����"/"
//				System.out.println(filename);
			}
			
		}
//		System.out.println(filepaths);
		return filepaths;
	}
}
