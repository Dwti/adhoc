package base;
import collection.*;


//�ͽ�ԭ��
//һ�������ܹ�������Щ��Ա�������ͺ�������ȡ����������õ�����
//ǰ�᣺�����������ͬһ��������һ�����õ��õ�����һ��������ȡ�������������ָ��Ķ���
public class Test {

	public Test() {
		
	}

	public static void main(String[] args) {
		
		
		
		
		//������ת������ת���﷨���򣬲�����Ϊʲô��ô����
		Student student=new Student();
		
		student.name="zhangsha";
		Student student1=student;
		System.out.println(student1.name);
		
		Person person=student;
		Student student2=(Student) person;
	/*���������ת��
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
 