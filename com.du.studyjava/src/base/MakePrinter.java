package base;

public class MakePrinter {
	private int flag;
	
    
	public MakePrinter() {
	}
	Printer printer;
	 Printer getPrinter(int flag){
		if(flag==0) {
			printer=new HpPrinter();
		
		}
		else if(flag==1) {
			printer=new CanonPrinter();
		}
		else if(flag==2) {
			printer=new ApplePrinter();
		}
		
		
		return printer;
		
		
	}

}
