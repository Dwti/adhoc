package sorts;

public class TestSort {

	public TestSort() {
		
	}
	public static void main(String[] args) {
		int []a= {23,56,1,3,6,8,90,38,46,28,78};
		Sorts sorts=new Sorts();
//		sorts.quickSort(a,4, a.length-1);
//		sorts.bubbleSort(a);
//		sorts.insertSort(a);
		sorts.selectSort(a);
//		sorts.heapSort(a);
//		sorts.shellSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
				
	}

}
