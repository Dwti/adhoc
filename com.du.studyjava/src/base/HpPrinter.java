package base;
/**
 * 
 * @author dudu
 *
 */

public class HpPrinter implements Printer{

	@Override
	public void open() throws InterruptedException {
		System.out.println("hp��ӡ��������ʽ");
		 Thread.sleep(1000);
		
	}

	@Override
	public void print() {
		System.out.println("hp��ӡ����ӡ��ʽ");
		
	}

	@Override
	public void close() {
		System.out.println("hp��ӡ���ػ���ʽ");
		
	}


}
