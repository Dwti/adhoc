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
			Course[] courses= {new Course("3", "ë��"),new Course("4", "gradle") };
//			Course[] courses1= {new Course("3", "ë��"),new Course("4", "��ɢ��ѧ") };
			//ͨ��Arrays.asList��coursesת��������
			courseToSelect.addAll(Arrays.asList(courses));
//			courseToSelect.addAll(1, Arrays.asList(courses1));
			Course temp3=(Course) courseToSelect.get(2);
			Course temp4=(Course) courseToSelect.get(3);
			Course temp5=(Course) courseToSelect.get(0);
//			System.out.println("��ӵĿγ��ǣ�"+temp3+temp4);  
//			System.out.println("��ӵĿγ��ǣ�"+temp5.getName()); 
//			
			
		}
		/*ͨ��for each�������ʼ���
		 * */
			public void testForEach() {
				System.out.println("�����¿γ̿�ѡ��foreach����");
				for(Course cr:courseToSelect) {
					Course course=(Course) cr;
					System.out.println("�γ̣�"+course.getId()+":"+course.getName());
					
					
				}
			}

	public static void main(String[] args) {
		SetTest s1=new SetTest();
		s1.testAddcourses();
		s1.testForEach();
		//����һ��ѧ����
		Student student=new Student("1", "ƤƤϺ");
		System.out.println("��ӭ"+student.getName()+"ͬѧѡ�Σ�����");
		
		//����Scanner�࣬�Ӽ��̻�ȡ����Ŀγ�id
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("������γ�id��");
			String courseId=scanner.next();
			for (Course cr : s1.courseToSelect) {
				if(cr.id.equals(courseId)) {
					student.courses.add(cr);
//					student.courses.add(cr);//Set�е�Ԫ���ǲ����ظ��ģ����������
					
				}	
				else {
					System.out.println("û�д�id�Ŀγ�����");
					break;
				}
			}
			
		}
		
		//��ӡ���,ѧ����ѡ�Ŀγ�
		for (Course cr : student.courses) {
//			System.out.println("ѡ���˶����ſγ�"+student.courses.size());
			System.out.println("ѡ��Ŀγ��ǣ�"+cr.id+cr.name);
			
		}
		System.out.println(student.courses);

	}

}
