package collection;

/*调用父类的无参构造器*/

public class ChildCourse extends Course{
private String xueduan;

public ChildCourse(String id,String name,String xueduan) {
	this.id=id;
	this.name=name;
	this.xueduan=xueduan;
	
}

public String getXueduan() {
	return xueduan;
}

public void setXueduan(String xueduan) {
	this.xueduan = xueduan;
}

@Override
public String toString() {
	return "ChildCourse [xueduan=" + xueduan + ", id=" + id + ", name=" + name + ", getXueduan()=" + getXueduan()
			+ ", getId()=" + getId() + ", getName()=" + getName() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

  

}