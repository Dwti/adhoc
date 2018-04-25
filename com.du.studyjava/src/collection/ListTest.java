package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.util.resources.cldr.shi.CalendarData_shi_Latn_MA;

public class ListTest {
//	用于备选课程的存储
	public List courseToSelect;
	public ListTest() {
		this.courseToSelect=new ArrayList<>();
	}
	//添加备选课程
	public void testAddcourses() {
		//创建一个课程对象，添加到备选的课程list中
		Course c1=new Course("1", "JAVA基础");
		courseToSelect.add(c1);
		//当一个对象被添加到集合中后变成了object类型，所以获取的时候需要强制转换类型
		Course temp=(Course) courseToSelect.get(0);
		System.out.println("添加的课程是："+temp.getName()+temp.getId());
		
		Course c2=new Course("2", "python语言");
		
		courseToSelect.add(0, c2);//指定位置添加元素
		Course temp1=(Course) courseToSelect.get(0);
		System.out.println("添加的课程是："+temp1.getName()+temp1.getId());
		
		//创建课程对象
		Course[] courses= {new Course("3", "php"),new Course("4", "gradle") };
		Course[] courses1= {new Course("3", "毛概"),new Course("4", "离散数学") };
		//通过Arrays.asList把courses转换成数组
		courseToSelect.addAll(Arrays.asList(courses));
		courseToSelect.addAll(2, Arrays.asList(courses1));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course) courseToSelect.get(3);
		Course temp5=(Course) courseToSelect.get(0);
//		System.out.println("添加的课程是："+temp3+temp4);  
//		System.out.println("添加的课程是："+temp5.getName()); 
//		
		
	}
	//for循环取出课程
	public void getAllcourses() {
		System.out.println("有如下课程可选：");
		
		for(int i=0;i<courseToSelect.size();i++) {
			Course course=(Course) courseToSelect.get(i);
			System.out.println("课程："+course.getId()+":"+course.getName()); 
		}
	}
//	通过迭代器遍历List
	public void testIterator() {
		Iterator iterator=courseToSelect.iterator();
		System.out.println("有如下课程可选：通过迭代器访问");
		while (iterator.hasNext()) {
		
			Course course=(Course) iterator.next();
			System.out.println("课程："+course.getId()+":"+course.getName());
			
			
		}
	}
/*通过for each方法访问集合
 * */
	public void testForEach() {
		System.out.println("有如下课程可选：foreach访问");
		for(Object cr:courseToSelect) {
			Course course=(Course) cr;
			System.out.println("课程："+course.getId()+":"+course.getName());
			
			
		}
	}
//	修改list中的元素。
	public void modify() {
		
		courseToSelect.set(4, new Course("8", "HELLO"));
	}
//	删除元素
	public void testRemove() {
		courseToSelect.remove(0);
		Course[] courses= {(Course) courseToSelect.get(1),(Course) courseToSelect.get(2)};
//		courseToSelect.removeAll(Arrays.asList(courses));
		testForEach();
	}
	
	
	/*往list中添加其他的东西
	 * */
	
	public void testTpype() {
		System.out.println("能否在list中添加其他类型的对象呢");
		courseToSelect.add("我不是课程对象，只是一个字符串而已啦");
		
	}
	
	/*测试List的 contains方法
	 * 测试是否包含课程
	 * course1跟course对象不是同一个对象
	 * contains其实底层是使用的equals()方法
	 * */
	public void testListContains() {
		//创建一个新的课程对象，Id和名称，与course对象完全一样

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
