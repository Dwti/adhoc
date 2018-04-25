package collection;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student>{
	private String id;
	private String name;
	protected  Set<Course> courses;//Set类型的泛型
	
	//无参的构造方法
	public Student() {
		
	}
	public Student(String id) {
		this.id=id;
		
	}
	public Student(String id,String name) {
		this(id);
		this.name=name;
		this.courses=new HashSet<Course>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	@Override
	public int compareTo(Student o) {
		//按照id的升序排列的
		return this.id.compareTo(o.id);
	}
	

}
