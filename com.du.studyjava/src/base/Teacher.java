package base;
/**
 * �̳�
 *�õ�����ĳ�Ա�����ͳ�Ա����
 *
 */
public class Teacher extends Person {
	//�������еĹ��캯�����У����ֵ��ø���Ĺ��캯����Ĭ�ϵ����޲����Ĺ��캯��
	public Teacher(String name,int age) {
		super(name, age);	
         
	}
	void teach() {
		 System.out.println("������ʦ����������");
	}
	@Override
	void introduce() {
		  System.out.println("��д����ķ���");
	}
     public static void main(String[] args) {
    	 
    	 Teacher teacher=new Teacher("hhh",30);
    	 teacher.eat();
    	 teacher.introduce();
    	 teacher.teach();
    	    
	}

}
