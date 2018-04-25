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
	//求一个int整数,不用库函数(String,StringBuilder,StringBuffer),转化成字符数组
	static char[] exchangeInttoChar(int n) {
		char  result;
		while(n>0) {
			result=(char) (n%10+48);//0-9的ASCII码是48~57
			n=n/10;
			System.out.println(result);
		}
		
		return null;
		
	}
	//二分查找算法针对升序的有序数组1.非递归2.递归
	//a是待查的数组，key要找的数，从low-high位置开始查找
	//非递归
	static int halfSearch(int a[],int low,int high, int key) {
		int middle;//中间的位置
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
	//递归
	static int halfSearch1(int a[],int low,int high, int key) {
		int middle;//中间的位置
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
