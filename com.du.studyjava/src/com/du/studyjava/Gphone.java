package com.du.studyjava;

public class Gphone extends Telphone {
	  private float screen=4.7f;
	  private float cup;
	  private float mem;
	public void call(){
		
		 super.getScreen();
		 System.out.println("Gphone"+ super.getScreen());
		 System.out.println("Gphone"+ screen);
		
	    }
	//���췽��
	public Gphone(){
		super();//ûд��ʱ������ʽ�ģ�Ĭ�ϵ����޲εĹ��췽����������ڵ�һ��
		super.call();
		call();
		System.out.println("Gphoneִ����");
	}
	//��дtoString()
	@Override
	public String toString() {
		return "Gphone [screen=" + screen + ", cup=" + cup + ", mem=" + mem + "]";
	}
	//��ϣ����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cup);
		result = prime * result + Float.floatToIntBits(mem);
		result = prime * result + Float.floatToIntBits(screen);
		return result;
	}
	//��дequals()����
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//getClass()�õ�������ж���������������Ƿ���ͬ
			return false;
		Gphone other = (Gphone) obj;
		if (Float.floatToIntBits(cup) != Float.floatToIntBits(other.cup))
			return false;
		if (Float.floatToIntBits(mem) != Float.floatToIntBits(other.mem))
			return false;
		if (Float.floatToIntBits(screen) != Float.floatToIntBits(other.screen))
			return false;
		return true;
	}
}
