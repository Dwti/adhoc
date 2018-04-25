package dealFile;

import java.awt.print.Printable;
import java.io.File;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {
     static ArrayList<String> list;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readfile ll=new readfile();
	/*	ll.readFileName("F:\\v3.0.2");*/
		ll.readFileNameTree("F:\\v3.0.3");

	}

}
