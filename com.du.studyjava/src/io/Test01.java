package io;

import sun.print.resources.serviceui;

public class Test01 {

	public Test01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//生成一个A公司水管工对象
		PlumWorker plumWorker=new PlumWorker();
		AWorker aworker=new AWorker(plumWorker);
		aworker.dosomeWork();
	}

}
