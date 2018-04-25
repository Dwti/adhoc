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
	//构造方法
	public Gphone(){
		super();//没写的时候是隐式的，默认调用无参的构造方法；必须放在第一句
		super.call();
		call();
		System.out.println("Gphone执行了");
	}
	//重写toString()
	@Override
	public String toString() {
		return "Gphone [screen=" + screen + ", cup=" + cup + ", mem=" + mem + "]";
	}
	//哈希方法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cup);
		result = prime * result + Float.floatToIntBits(mem);
		result = prime * result + Float.floatToIntBits(screen);
		return result;
	}
	//重写equals()方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//getClass()得到类对象，判断两个对象的类型是否相同
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
