package base;

public class ApplePrinter implements Printer{

	public ApplePrinter() {
		
	}

	@Override
	public void open() {
		
		System.out.println("Apple��ӡ��������ʽ");
	}

	@Override
	public void print() {
		System.out.println("Apple��ӡ��������ʽ");
	}

	@Override
	public void close() {
		System.out.println("Apple��ӡ��������ʽ");
	}

}
