package collection;

public class Course {
	protected String id;
	protected String name;

	public Course() {
		
	}
	public Course(String id,String name) {
		this.id=id;
		this.name=name;
	
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
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	//ͨ���ж������Ƿ���ȣ��ж��Ƿ�����ȵ�
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		if(obj==null) 
			return false;
		
		if(!(obj instanceof Course))
			return false;
			
	
		Course course=(Course) obj;
		if(this.name==null) {
			if(course.name==null) 
				return true;
			else 
				return false;
			
				
		}else {
			if(this.name.equals(course.getName()))
				return true;
			else 
				return false;
			
			
		}
		
	}
}
