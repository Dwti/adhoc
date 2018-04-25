package base;
import collection.*;


//就近原则
//一个引用能够调用哪些成员（变量和函数），取决于这个引用的类型
//前提：父类和子类有同一个方法，一个引用调用的是哪一个方法，取决于这个引用所指向的对象
public class Test {

	public Test() {
		
	}

	public static void main(String[] args) {
		
		
		
		
		//先向上转，再下转，语法规则，不明白为什么这么做？
		Student student=new Student();
		
		student.name="zhangsha";
		Student student1=student;
		System.out.println(student1.name);
		
		Person person=student;
		Student student2=(Student) person;
	/*错误的向下转型
	 * Person person=new Person();
	Student student=(Student)person;*/
		collection.Student student3=new collection.Student();
		student3.getId();
		MakePrinter makePrinter=new MakePrinter();
		Printer printer=makePrinter.getPrinter(0);
		 printer=makePrinter.getPrinter(1);
		 try {
			printer.open();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        System.out.println(printer);
	}

}
 