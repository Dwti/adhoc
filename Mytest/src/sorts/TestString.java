package sorts;

import java.util.ArrayList;
import java.util.List;

import com.sun.accessibility.internal.resources.accessibility;

public class TestString {

	public TestString() {
		
	}

	public static void main(String[] args) {
		String s="hello ni hao";
		exchangeSectence( s);
		
	}
	static  byte [] test(String[] ss) {
		List<String> rList=new ArrayList<String>();
		for(int i=1;i<ss.length;i++) {
			if(!rList.contains(ss[i])) {
				rList.add(ss[i]);
			}
			String a=" ";
		     for(String b :rList) {
		    	  a=b+a;
		      }
			
			System.out.println(a);
		}
		return null;
	}
	/*��һ��Ӣ�ģ�����֮��ʹ�õ��ո�����������ӡ���ʣ����ʵ���ĸ������*/
	static List<String> exchangeSectence(String s){
		String [] temp;
		StringBuffer result=new StringBuffer();
		temp =s.split(" ");
		for(int i=temp.length-1;i>=0;i--) { 
		     result.append(temp[i]+" ");
			
		}
		System.out.println(result.toString());
		
		return null;
	}

}
