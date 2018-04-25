package base;
/**
 * 
 * @author dudu
 *
 */

public class HpPrinter implements Printer{

	@Override
	public void open() throws InterruptedException {
		System.out.println("hp打印机开机方式");
		 Thread.sleep(1000);
		
	}

	@Override
	public void print() {
		System.out.println("hp打印机打印方式");
		
	}

	@Override
	public void close() {
		System.out.println("hp打印机关机方式");
		
	}


}
