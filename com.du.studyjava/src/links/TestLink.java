package links;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestLink {

	public TestLink() {
		
	}

	public static void main(String[] args) {
		
    MyLink myLink=new MyLink();
    myLink.addNode(9);
    myLink.addNode(10);
    myLink.addNode(1);
	}
	

}
