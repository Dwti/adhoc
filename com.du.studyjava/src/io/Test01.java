package io;

import sun.print.resources.serviceui;

public class Test01 {

	public Test01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//����һ��A��˾ˮ�ܹ�����
		PlumWorker plumWorker=new PlumWorker();
		AWorker aworker=new AWorker(plumWorker);
		aworker.dosomeWork();
	}

}
