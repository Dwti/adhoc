package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import sun.util.resources.cldr.shi.CalendarData_shi_Latn_MA;

public class MapTest {
	//承装学生对象的map
	private Map<String, Student> students;
//初始化student属性
	public MapTest() {
		this.students=new HashMap<String, Student>();
	}
/*添加，从键盘输入id，判断是否被占用
 * 如果被占用，就输出姓名
 * 如果没有被占用，就新建一个对象，并且添加到student中
 * */
	public void putTest() {
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("请输入学生的id：");
			String id=scanner.next();
			Student s1=students.get(id);
			//判断id是否存在
			if(s1==null) {
				System.out.println("请输入学生的name：");
				String name=scanner.next();
				//创建一个新的学生对象
				Student newStudent=new Student(id, name);
				//通过put方法添加id-学生映射
				students.put(id, newStudent);
			}
			else {
				System.out.println("学生id已经存在！！！！");
				continue;
			}
			System.out.println("成功添加学生："+students.get(id).getName());
			i++;
		}
//		System.out.println("成功添加学生："+student);
	
	}
	/*测试keyset()方法
	 * 
	 * */
	public void testkeySet() {
		//通过keySet()方法返回所以的key的集合
		Set<String> keyid=students.keySet();
		//获取所有的key的value的值
		for (String stuId : keyid) {
			Student student=students.get(stuId);
			System.out.println(student.getName());
			
		}
	}
	
	/*
	 * 测试map中的元素，remove
	 * 
	 * */
	public void testRemove() {
		System.out.println("请输入要移除的学生的id：");
		Scanner scanner=new Scanner(System.in);
	    while(true) {
		String id=scanner.next();
		Student student=students.get(id);
		if(student==null) {
			System.out.println("该学生不存在");
		}else {
			students.remove(id);
			System.out.println("移除"+id+"号学生成功");
			System.out.println(students);
			
		}
		
	}
	}
	
	/*通过entrySet()方法遍历Map
	 * 
	 * */
	public void testEnterySet() {
		Set<Entry<String, Student>> entr=students.entrySet();
		for (Entry<String, Student> entry : entr) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			
		}
	}
	/*通过put()去修改Map中的已有的映射
	 * 
	 * */
	public void testModify() {
		System.out.println("请输入要修改的学生的id：");
		Scanner scanner=new Scanner(System.in);
	    while(true) {
		String id=scanner.next();
		Student student=students.get(id);
		if(student==null) {
			System.out.println("该学生不存在");
			continue;
		}else {
			students.put(id, new Student("1", "修改的姓名"));
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
