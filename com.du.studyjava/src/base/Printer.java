package base;

interface Printer {
	abstract void open() throws InterruptedException;
	abstract void print();
	abstract void close();
	
}
