package thread;

import java.util.concurrent.CountDownLatch;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import sun.print.resources.serviceui;
import java.lang.Object;

/*ģ�������˻�ȡǮ�Ĳ���
 * 1.������ͬһ���˻��ֱ�ȡ�Ĵ�Ǯ��ÿ��ȡ100��
 * 2.�˻�һ��2000�������
 * 3.ʹ���߳�ͬ��
*/
public class Mback {
	private static int sumcount=2000;
	public  synchronized static void takeMoney(int subcount) throws InterruptedException{
		  sumcount=sumcount-subcount;
		  /*Thread.sleep((int)((1000)*Math.random()));*/
		  System.out.println(Thread.currentThread().getName()+"ȡ��"+subcount+"��"+"�˻����"+sumcount);
		  
		  
		
	}

}
