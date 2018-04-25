
public class TestString {

	public TestString() {
		
	}

	public static void main(String[] args) {
		String str1="aaa";
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append("aaa");
		//String的测试
		System.out.println(str1.getClass()+"@"+str1.hashCode());
		//StringBuffer的测试
		System.out.println(stringBuffer.getClass()+"@"+stringBuffer.hashCode());
		
		//对str1和stringBuffer进行修改
		str1="ccc";
		stringBuffer.append("ccc");
		
		
		//对String修改后的测试
		System.out.println(str1+"@"+str1.hashCode());
		//对StringBuffer修改后的测试
		System.out.println(stringBuffer.toString()+"@"+stringBuffer.hashCode());
	}

}
