package collection;

import java.util.ArrayList;
import java.util.List;

import sun.print.resources.serviceui;

public class TestGeneric {
	//���з���--Course,��list��������
	public List<Course> courses;
	public TestGeneric() {
		this.courses=new ArrayList<Course>();
	}
	//�������
	public void testAdd() {
		Course c1=new Course("1", "�¸���Ӣ��");
		courses.add(c1);
		//���ͼ����У�������ӷ��͹涨���༰��������������Ķ��󣬷��ڻᱨ��
//		courses.add("hhhhhhhh");
		Course c2=new Course("2", "�¸���Ӣ��222");
		courses.add(c2);
	}
   /*����foreachȥ��������
    * */
	
	public void testForeach() {
		for (Course course : courses) {
			System.out.println(course);
			
		}
	}
	
	/*���ͼ��Ͽ�����ӷ��͵������͵Ķ���ʵ��
	 * 
	 * */
	
	public void testChild() {
		ChildCourse children=new ChildCourse("9","�������","Сѧ");
		children.setId("9");
		children.setName("�������");
		children.setXueduan("Сѧ");
		courses.add(children);
	}
	
	/*���Ͳ���ʹ�û�������
	 * */
	
	public void testBasicType() {
//		List<int> list=new ArrayList<>(int);//����ʹ�û������͵İ�װ��
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
