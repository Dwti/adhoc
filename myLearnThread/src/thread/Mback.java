package thread;

import java.util.concurrent.CountDownLatch;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import sun.print.resources.serviceui;
import java.lang.Object;

/*模拟银行账户取钱的操作
 * 1.两个人同一个账户分别取四次钱，每次取100块
 * 2.账户一共2000块人民币
 * 3.使用线程同步
*/
public class Mback {
	private static int sumcount=2000;
	public  synchronized static void takeMoney(int subcount) throws InterruptedException{
		  sumcount=sumcount-subcount;
		  /*Thread.sleep((int)((1000)*Math.random()));*/
		  System.out.println(Thread.currentThread().getName()+"取走"+subcount+"块"+"账户余额"+sumcount);
		  
		  
		
	}

}
