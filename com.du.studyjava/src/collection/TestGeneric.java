package collection;

import java.util.ArrayList;
import java.util.List;

import sun.print.resources.serviceui;

public class TestGeneric {
	//带有泛型--Course,的list类型属性
	public List<Course> courses;
	public TestGeneric() {
		this.courses=new ArrayList<Course>();
	}
	//测试添加
	public void testAdd() {
		Course c1=new Course("1", "新概念英语");
		courses.add(c1);
		//泛型集合中，不能添加泛型规定的类及其子类类型以外的对象，否在会报错
//		courses.add("hhhhhhhh");
		Course c2=new Course("2", "新概念英语222");
		courses.add(c2);
	}
   /*测试foreach去遍历集合
    * */
	
	public void testForeach() {
		for (Course course : courses) {
			System.out.println(course);
			
		}
	}
	
	/*泛型集合可以添加泛型的子类型的对象实例
	 * 
	 * */
	
	public void testChild() {
		ChildCourse children=new ChildCourse("9","子类对象","小学");
		children.setId("9");
		children.setName("子类对象");
		children.setXueduan("小学");
		courses.add(children);
	}
	
	/*泛型不能使用基本类型
	 * */
	
	public void testBasicType() {
//		List<int> list=new ArrayList<>(int);//必须使用基本类型的包装类
		List<Integer> list=new ArrayList<Integer>();
		list.add(11);
		System.out.println(list.get(0));
		
	}
	public static void main(String[] args) {
		TestGeneric t1=new TestGeneric();
//		t1.testAdd();
//		t1.testForeach();
//		t1.testChild();
//		t1.testForeach();
		t1.testBasicType();

	}

}
