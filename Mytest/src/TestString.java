
public class TestString {

	public TestString() {
		
	}

	public static void main(String[] args) {
		String str1="aaa";
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("aaa");
		//String�Ĳ���
		System.out.println(str1.getClass()+"@"+str1.hashCode());
		//StringBuffer�Ĳ���
		System.out.println(stringBuffer.getClass()+"@"+stringBuffer.hashCode());
		
		//��str1��stringBuffer�����޸�
		str1="ccc";
		stringBuffer.append("ccc");
		
		
		//��String�޸ĺ�Ĳ���
		System.out.println(str1+"@"+str1.hashCode());
		//��StringBuffer�޸ĺ�Ĳ���
		System.out.println(stringBuffer.toString()+"@"+stringBuffer.hashCode());
	}

}
