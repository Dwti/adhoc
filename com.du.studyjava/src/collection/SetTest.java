package collection;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SetTest {
	private List<Course> courseToSelect;

	public SetTest() {
		this.courseToSelect=new ArrayList<Course>();
		
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
			Course[] courses= {new Course("3", "毛概"),new Course("4", "gradle") };
//			Course[] courses1= {new Course("3", "毛概"),new Course("4", "离散数学") };
			//通过Arrays.asList把courses转换成数组
			courseToSelect.addAll(Arrays.asList(courses));
//			courseToSelect.addAll(1, Arrays.asList(courses1));
			Course temp3=(Course) courseToSelect.get(2);
			Course temp4=(Course) courseToSelect.get(3);
			Course temp5=(Course) courseToSelect.get(0);
//			System.out.println("添加的课程是："+temp3+temp4);  
//			System.out.println("添加的课程是："+temp5.getName()); 
//			
			
		}
		/*通过for each方法访问集合
		 * */
			public void testForEach() {
				System.out.println("有如下课程可选：foreach访问");
				for(Course cr:courseToSelect) {
					Course course=(Course) cr;
					System.out.println("课程："+course.getId()+":"+course.getName());
					
					
				}
			}

	public static void main(String[] args) {
		SetTest s1=new SetTest();
		s1.testAddcourses();
		s1.testForEach();
		//创建一个学生类
		Student student=new Student("1", "皮皮虾");
		System.out.println("欢迎"+student.getName()+"同学选课！！！");
		
		//创建Scanner类，从键盘获取输入的课程id
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("请输入课程id：");
			String courseId=scanner.next();
			for (Course cr : s1.courseToSelect) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
//					student.courses.add(cr);//Set中的元素是不可重复的，且是无序的
					
				}	
				else {
					System.out.println("没有此id的课程啦！");
					break;
				}
			}
			
		}
		
		//打印输出,学生所选的课程
		for (Course cr : student.courses) {
//			System.out.println("选择了多少门课程"+student.courses.size());
			System.out.println("选择的课程是："+cr.id+cr.name);
			
		}
		System.out.println(student.courses);

	}

}
