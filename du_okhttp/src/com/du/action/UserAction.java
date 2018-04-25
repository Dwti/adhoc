package com.du.action;

import java.awt.print.Printable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.apache.coyote.Response;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	public String mobile,password;
	
	public String  postString() throws IOException {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		ServletInputStream iServletInputStream=request.getInputStream();
		String dir=ServletActionContext.getServletContext().getRealPath("files");
		
		File file=new File(dir,"9999.png");
		FileOutputStream foStream=new FileOutputStream(file);
		int len=0;
		byte[] buf=new byte[1024];
		while ((len=iServletInputStream.read(buf))!=-1) {
			foStream.write(buf, 0, len);
			
		}
		foStream.flush();
		foStream.close();
		return null;
		
	}

	
	public File login() throws IOException{
		
		HttpServletRequest request=ServletActionContext.getRequest();
		ServletInputStream iServletInputStream=request.getInputStream();
		String dir=ServletActionContext.getServletContext().getRealPath("files");
		
		File file=new File(dir,"9999.png");
		FileOutputStream foStream=new FileOutputStream(file);
		int len=0;
		byte[] buf=new byte[1024];
		while ((len=iServletInputStream.read(buf))!=-1) {
			foStream.write(buf, 0, len);
			
		}
		foStream.flush();
		foStream.close();
		return file;	
	}
	
		
	/*	System.out.println("mobile="+mobile +"password="+password);
		String str="success";
		HttpServletResponse response =ServletActionContext.getResponse();
		try {
			PrintWriter writer=response.getWriter();
			writer.write(str);
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*return str;*/

		
	
	
	

	private void printStackTrace() {
		// TODO Auto-generated method stub
		
	}



	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
