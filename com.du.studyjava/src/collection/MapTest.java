package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import sun.util.resources.cldr.shi.CalendarData_shi_Latn_MA;

public class MapTest {
	//��װѧ�������map
	private Map<String, Student> students;
//��ʼ��student����
	public MapTest() {
		this.students=new HashMap<String, Student>();
	}
/*��ӣ��Ӽ�������id���ж��Ƿ�ռ��
 * �����ռ�ã����������
 * ���û�б�ռ�ã����½�һ�����󣬲�����ӵ�student��
 * */
	public void putTest() {
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("������ѧ����id��");
			String id=scanner.next();
			Student s1=students.get(id);
			//�ж�id�Ƿ����
			if(s1==null) {
				System.out.println("������ѧ����name��");
				String name=scanner.next();
				//����һ���µ�ѧ������
				Student newStudent=new Student(id, name);
				//ͨ��put�������id-ѧ��ӳ��
				students.put(id, newStudent);
			}
			else {
				System.out.println("ѧ��id�Ѿ����ڣ�������");
				continue;
			}
			System.out.println("�ɹ����ѧ����"+students.get(id).getName());
			i++;
		}
//		System.out.println("�ɹ����ѧ����"+student);
	
	}
	/*����keyset()����
	 * 
	 * */
	public void testkeySet() {
		//ͨ��keySet()�����������Ե�key�ļ���
		Set<String> keyid=students.keySet();
		//��ȡ���е�key��value��ֵ
		for (String stuId : keyid) {
			Student student=students.get(stuId);
			System.out.println(student.getName());
			
		}
	}
	
	/*
	 * ����map�е�Ԫ�أ�remove
	 * 
	 * */
	public void testRemove() {
		System.out.println("������Ҫ�Ƴ���ѧ����id��");
		Scanner scanner=new Scanner(System.in);
	    while(true) {
		String id=scanner.next();
		Student student=students.get(id);
		if(student==null) {
			System.out.println("��ѧ��������");
		}else {
			students.remove(id);
			System.out.println("�Ƴ�"+id+"��ѧ���ɹ�");
			System.out.println(students);
			
		}
		
	}
	}
	
	/*ͨ��entrySet()��������Map
	 * 
	 * */
	public void testEnterySet() {
		Set<Entry<String, Student>> entr=students.entrySet();
		for (Entry<String, Student> entry : entr) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			
		}
	}
	/*ͨ��put()ȥ�޸�Map�е����е�ӳ��
	 * 
	 * */
	public void testModify() {
		System.out.println("������Ҫ�޸ĵ�ѧ����id��");
		Scanner scanner=new Scanner(System.in);
	    while(true) {
		String id=scanner.next();
		Student student=students.get(id);
		if(student==null) {
			System.out.println("��ѧ��������");
			continue;
		}else {
			students.put(id, new Student("1", "�޸ĵ�����"));
			System.out.println(students);
			
		}
		
	}
		
	}
	
	public static void main(String[] args) {
		
      MapTest mTest=new MapTest();
      mTest.putTest();
//      mTest.testkeySet();
  /*    mTest.testRemove();*/
     /* mTest.testEnterySet();*/
      mTest.testModify();
	}

}
