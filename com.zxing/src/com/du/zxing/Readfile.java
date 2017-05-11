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
		}//需要添加抛出异常  执行新增一个文件
		File files[] = new File(path).listFiles();
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){//文件夹的文件
				String filename = files[i].getName();
				String filepath = files[i].getPath();
//				filepath.replaceAll("\\", "/");
				filepaths.add(filepath.replace("\\", "/" ));//把"\"换成"/"
//				System.out.println(filename);
			}
			
		}
//		System.out.println(filepaths);
		return filepaths;
	}
}
