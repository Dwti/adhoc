package base;

public class ApplePrinter implements Printer{

	public ApplePrinter() {
		
	}

	@Override
	public void open() {
		
		System.out.println("Apple打印机开机方式");
	}

	@Override
	public void print() {
		System.out.println("Apple打印机开机方式");
	}

	@Override
	public void close() {
		System.out.println("Apple打印机开机方式");
	}

}
