package du.yanxiu.action;

import java.nio.file.attribute.UserPrincipalLookupService;

import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport {
	
	//添加成员变量
	public String mobile,password;
	

	public void login(){
		
		System.out.println(mobile+"  "+password);
//		return mobile;
	
	}
	
	
    public void index() {
		// TODO Auto-generated method stub
    	System.out.println(mobile+"  "+password);
//		return mobile+password;

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
