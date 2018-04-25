package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.util.resources.cldr.shi.CalendarData_shi_Latn_MA;

public class ListTest {
//	���ڱ�ѡ�γ̵Ĵ洢
	public List courseToSelect;
	public ListTest() {
		this.courseToSelect=new ArrayList<>();
	}
	//��ӱ�ѡ�γ�
	public void testAddcourses() {
		//����һ���γ̶�����ӵ���ѡ�Ŀγ�list��
		Course c1=new Course("1", "JAVA����");
		courseToSelect.add(c1);
		//��һ��������ӵ������к�����object���ͣ����Ի�ȡ��ʱ����Ҫǿ��ת������
		Course temp=(Course) courseToSelect.get(0);
		System.out.println("��ӵĿγ��ǣ�"+temp.getName()+temp.getId());
		
		Course c2=new Course("2", "python����");
		
		courseToSelect.add(0, c2);//ָ��λ�����Ԫ��
		Course temp1=(Course) courseToSelect.get(0);
		System.out.println("��ӵĿγ��ǣ�"+temp1.getName()+temp1.getId());
		
		//�����γ̶���
		Course[] courses= {new Course("3", "php"),new Course("4", "gradle") };
		Course[] courses1= {new Course("3", "ë��"),new Course("4", "��ɢ��ѧ") };
		//ͨ��Arrays.asList��coursesת��������
		courseToSelect.addAll(Arrays.asList(courses));
		courseToSelect.addAll(2, Arrays.asList(courses1));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course) courseToSelect.get(3);
		Course temp5=(Course) courseToSelect.get(0);
//		System.out.println("��ӵĿγ��ǣ�"+temp3+temp4);  
//		System.out.println("��ӵĿγ��ǣ�"+temp5.getName()); 
//		
		
	}
	//forѭ��ȡ���γ�
	public void getAllcourses() {
		System.out.println("�����¿γ̿�ѡ��");
		
		for(int i=0;i<courseToSelect.size();i++) {
			Course course=(Course) courseToSelect.get(i);
			System.out.println("�γ̣�"+course.getId()+":"+course.getName()); 
		}
	}
//	ͨ������������List
	public void testIterator() {
		Iterator iterator=courseToSelect.iterator();
		System.out.println("�����¿γ̿�ѡ��ͨ������������");
		while (iterator.hasNext()) {
		
			Course course=(Course) iterator.next();
			System.out.println("�γ̣�"+course.getId()+":"+course.getName());
			
			
		}
	}
/*ͨ��for each�������ʼ���
 * */
	public void testForEach() {
		System.out.println("�����¿γ̿�ѡ��foreach����");
		for(Object cr:courseToSelect) {
			Course course=(Course) cr;
			System.out.println("�γ̣�"+course.getId()+":"+course.getName());
			
			
		}
	}
//	�޸�list�е�Ԫ�ء�
	public void modify() {
		
		courseToSelect.set(4, new Course("8", "HELLO"));
	}
//	ɾ��Ԫ��
	public void testRemove() {
		courseToSelect.remove(0);
		Course[] courses= {(Course) courseToSelect.get(1),(Course) courseToSelect.get(2)};
//		courseToSelect.removeAll(Arrays.asList(courses));
		testForEach();
	}
	
	
	/*��list����������Ķ���
	 * */
	
	public void testTpype() {
		System.out.println("�ܷ���list������������͵Ķ�����");
		courseToSelect.add("�Ҳ��ǿγ̶���ֻ��һ���ַ���������");
		
	}
	
	/*����List�� contains����
	 * �����Ƿ�����γ�
	 * course1��course������ͬһ������
	 * contains��ʵ�ײ���ʹ�õ�equals()����
	 * */
	public void testListContains() {
		//����һ���µĿγ̶���Id�����ƣ���course������ȫһ��

		Course course=(Course) courseToSelect.get(0);
		Course course1=new Course("333",course.name);
		boolean b1=courseToSelect.contains(course1);
		System.out.println(b1);
		   
		boolean b=courseToSelect.contains(course);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		ListTest l1=new ListTest();
		l1.testAddcourses();
		/*l1.getAllcourses();
		l1.modify();
		l1.testIterator();
		l1.testForEach();*/
//		l1.testRemove(); 
//		l1.testTpype();
//		l1.testForEach();
		l1.testListContains();
		
		
	}

}
