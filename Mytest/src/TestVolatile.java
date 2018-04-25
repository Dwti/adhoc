import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestVolatile {  
    public  int inc = 0;
    Lock  lock=new ReentrantLock();
// public AtomicInteger inc=new AtomicInteger();
    public synchronized void increase() {
    	 lock.lock();
         try {
             inc++;
         } finally{
             lock.unlock();
         }
    }
 
    public static void main(String[] args) {
        final TestVolatile test = new TestVolatile();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }
 
        while(Thread.activeCount()>1)  //��֤ǰ����̶߳�ִ����
            Thread.yield();
        System.out.println(test.inc);
    }
}