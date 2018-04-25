package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * ʵ�ֵĹ��ܣ�
 * 1.ͨ��Collections.sort(),��Integer���͵�List��������
 * 2.ͨ��Collections.sort(),��String���͵�List��������
 * 3.ͨ��Collections.sort(),�������ķ��͵�List����������StudentΪ��
 * */
public class CollectionTest {
	

	private static final String integers = null;
	public CollectionTest() {
		
	}
	//��Integer���͵�List��������
    public void testSort1() {
    	List<Integer> integers=new ArrayList<>();
    	Random random=new Random();
    	Integer k;
    	for(int i=0; i<10;i++) {
    		do {
    		k=random.nextInt(100);
    		}while(integers.contains(k));
    		integers.add(k);
    		System.out.println("��ӳɹ�");
    		
    	}
    	System.out.println("--------------����ǰ---------------");
    	for(Integer num:integers) {
    		System.out.println("Ԫ�أ�"+num);
    		
    	}
    	System.out.println("--------------�����---------------");
//   ����
    	java.util.Collections.sort(integers);
    	for(Integer num:integers) {
    		System.out.println("Ԫ�أ�"+num);
    		
    	}
    	}
  //��String���͵�List��������
    public void testSort2() {
    	List<String> strings=new ArrayList<>();
    	strings.add("mhtyishjiaj");
    	strings.add("google");
    	strings.add("hello");
    	System.out.println("--------------����ǰ---------------");
    	for (String string : strings) {
    		
    		System.out.println(string);
		}
    	//0-9��A-Z��a-z����
    	java.util.Collections.sort(strings);
    	System.out.println("--------------�����---------------");
    	for (String string : strings) {
    		System.out.println(string);
		}
    	
    }
    /*
     * �߼���������
     * 1.����һ��String�ķ��ͣ����������10������ַ���
     * 2.ÿ���ַ����ĳ���Ϊ10���ڵ������
     * 3.ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ����ַ������ظ�
     * 4.ÿ������ַ��������ظ�
     * */
    public void mytest() {
    	List<String> strings=new ArrayList<>();
        String baseString="abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random=new Random();
        StringBuffer buffer=new StringBuffer();
        int length=random.nextInt(10);
        for(int i=0;i<length;i++) {
        	buffer.append(baseString.charAt(random.nextInt(62)));
        	strings.add(buffer.toString());
        	
        	
        	
        }
        
    	System.out.println(strings);
        
        for (String string : strings) {
        	System.out.println(string);
		}
//    	strings.add()
    }
    
  //���������͵ķ��͵�List��������
//    Comparable�Ľӿ���Ĭ�ϵģ�Comparator��ʱ�ıȽϽӿ�
    public void testSort3() {
    List<Student> students=new ArrayList<>();
    students.add(new Student("10", "xiaohomng"));
    students.add(new Student("34", "����"));
    students.add(new Student("2", "������"));
    System.out.println("--------------����ǰ---------------");
	for (Student student : students) {
		   System.out.println(student.getName());
	}
	java.util.Collections.sort(students);
	System.out.println("--------------�����---------------");
	for (Student student : students) {
		   System.out.println(student.getName());
	}
    } 
    
    
	public static void main(String[] args) {
		CollectionTest test=new CollectionTest();
//		test.testSort2();
//		test.mytest();
		test.testSort3();
		

	}

}
