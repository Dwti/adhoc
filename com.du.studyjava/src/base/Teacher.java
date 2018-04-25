package base;
/**
 * 继承
 *得到父类的成员变量和成员函数
 *
 */
public class Teacher extends Person {
	//在子类中的构造函数当中，必现调用父类的构造函数，默认调用无参数的构造函数
	public Teacher(String name,int age) {
		super(name, age);	
         
	}
	void teach() {
		 System.out.println("我是老师啦！教书啦");
	}
	@Override
	void introduce() {
		  System.out.println("重写父类的方法");
	}
     public static void main(String[] args) {
    	 
    	 Teacher teacher=new Teacher("hhh",30);
    	 teacher.eat();
    	 teacher.introduce();
    	 teacher.teach();
    	    
	}

}
