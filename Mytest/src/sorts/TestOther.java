package sorts;

public class TestOther {

	public TestOther() {
		
	}

	public static void main(String[] args) {
		int a[]= {10,22,56,78,90,112,345,678};
//		int a=50;
//		int b=a/10;
//		int c=a%10;
//		char ch=(char) a;
//		System.out.println(ch);
//		System.out.println(3.0/4);
		exchangeInttoChar(6780);
//		 int result=halfSearch(a, 0,a.length-1, 112);
//		 System.out.println(result);
		
	}
	//��һ��int����,���ÿ⺯��(String,StringBuilder,StringBuffer),ת�����ַ�����
	static char[] exchangeInttoChar(int n) {
		char  result;
		while(n>0) {
			result=(char) (n%10+48);//0-9��ASCII����48~57
			n=n/10;
			System.out.println(result);
		}
		
		return null;
		
	}
	//���ֲ����㷨����������������1.�ǵݹ�2.�ݹ�
	//a�Ǵ�������飬keyҪ�ҵ�������low-highλ�ÿ�ʼ����
	//�ǵݹ�
	static int halfSearch(int a[],int low,int high, int key) {
		int middle;//�м��λ��
		if(key<a[low]||key>a[high]||low>high) return -1;
		while(low<high) {
			middle=(low+high)/2;
			if(a[middle]==key) {
				return middle;
			}else if(a[middle]<key) {
				low=middle+1;
			}else {
				high=middle-1;
			}
		}
		
		return -1;
		
	}
	//�ݹ�
	static int halfSearch1(int a[],int low,int high, int key) {
		int middle;//�м��λ��
		if(key<a[low]||key>a[high]||low>high) return -1;
		middle=(low+high)/2;
		if(a[middle]==key) {
			return middle;
		}else if(a[middle]<key) {
			return halfSearch1(a, middle+1, high, key);
		}else {
			return halfSearch1(a, low, middle-1, key);
			
		}
		
	
	}

}
