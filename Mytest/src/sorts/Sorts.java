package sorts;

public class Sorts {

	public Sorts() {
		
	}
	/*
	 * 快速排序
	 * 思想：通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
	 * 则分别对这两部分继续进行排序，直到整个序列有序。
	 * 时间复杂度：平均nlog2n,最好：nlog2n，最坏n^2
	 * 空间复杂度：nlog2n
	 * 稳定性：不稳定
	*/	
	int[] quickSort(int []a,int low,int hight){
		if(low<hight) {
			int middle=getMiddle(a, low, hight);
			quickSort(a, 0, middle-1);
			quickSort(a, middle+1, hight);
		}
		
		return a;
		
	}
	int getMiddle(int a[],int low,int hight){
		int temp=a[low];//创建一个临时的变量，存放找出的基准数
		while(low<hight) {
			while(low<hight && temp<=a[hight]) {
				hight--;
			}
			a[low]=a[hight];
			while(low<hight && temp>=a[low]) {
				low++;
			}
			a[hight]=a[low];
		}
		a[low]=temp;
		return hight;
	}
	/*冒泡排序
	 * 思路：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
	 *     让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
	 * 时间复杂度：平均n^2,最好：n，最坏n^2
	 * 空间复杂度：1
	 * 稳定性：稳定
	 * */
	
	int [] bubbleSort(int []a){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				int temp;
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		return a;
		
	}
	/*选择排序
	 * 思路：在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
	 * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
	 * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
	 * 时间复杂度：平均n^2,最好：n^2，最坏n^2
	 * 空间复杂度：1
	 * 稳定性：不稳定
	 * */
	int[] selectSort(int []a) {
		int temp;
		int index;
		for(int i=0;i<a.length;i++) {
			temp=a[i];
			index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<temp) {
					temp=a[j];
					index=j;
				}
			}
			a[index]=a[i];
			a[i]=temp;
			
		}
		return null;
		 
	}
	int[] selectSort1(int []a) {
		int index;
		int temp;
		for(int i=0;i<a.length;i++) {
			temp=a[i];
			for(int j=i+1;j<a.length;j++){
				if(a[j]<temp) {
					index=j;
				}
			}
			
			
		}
		return null;
	}
	/*堆排序
	 * 思路：初始时把要排序的n个数的序列看作是一棵顺序存储的二叉树（一维数组存储二叉树）
	 * ，调整它们的存储序，使之成为一个堆，将堆顶元素输出，得到n 个元素中最小(或最大)的元素，
	 * 这时堆的根节点的数最小（或者最大）。然后对前面(n-1)个元素重新调整使之成为堆，
	 * 输出堆顶元素，得到n 个元素中次小(或次大)的元素。
	 * 依此类推，直到只有两个节点的堆，并对它们作交换，最后得到有n个节点的有序序列。称这个过程为堆排序。
	 * 时间复杂度：平均nlog2n,最好：nlog2n，最坏nlog2n
	 * 空间复杂度：1
	 * 稳定性：不稳定
	 * 
	 * */
	//1.建立堆，交换堆顶与最后一个叶子节点   
	int[] heapSort(int []a) {
		//循环创建堆
		for(int i=0;i<a.length-1;i++) {
			buildMaxHeap(a,a.length-1-i);
			//交换堆顶和最后一个元素
			swap(a,0,a.length-1-i);
			
		}
		
		
		return a;
		
	}
	//交换的方法
	private void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	//创建大顶堆,从0到lastIndex建立大顶堆
	private void buildMaxHeap(int[] a, int lastIndex) {
		//从lastIndex处节点的父节点开始
		for(int i=(lastIndex-1)/2;i>=0;i--) {
			//k用来保存正在判断的节点
			int k=i;
			//如果当前K节点的子节点存在
			while(k*2+1<=lastIndex) {
				//K节点的左子节点的索引
				int biggerIndex=k*2+1;
				//如果biggerIndex小于lastIndex，说明K节点存在右子节点，即biggerIndex+1代表的k节点的右子节点 
				if(biggerIndex<lastIndex) {
					//如果右子节点大于左子几点
					if(a[biggerIndex]<a[biggerIndex+1]) {
						//biggerIndex这时候应该记录较大自己点的索引，biggerIndex这时候需要+1
					biggerIndex=biggerIndex+1;
					}
					
				}
				//如果k节点的值小于较大节点的值，就交换他们
				if(a[k]<a[biggerIndex]) {
					swap(a, k, biggerIndex);
					//将biggerIndex覆值给k,开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值
					k=biggerIndex;
				}else {
					break;
				}
			}
			
		}
		
		
		
	}
	/*直接插入排序
	 * 思路：将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
	 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
	 * 要点：设立哨兵，作为临时存储和判断数组边界之用。
	  * 时间复杂度：平均n^2,最好：n，最坏n^2
	 * 空间复杂度：1
	 * 稳定性：稳定
	 * */
	int []insertSort(int []a){
		int temp;//需要插入的数
		for(int i=1;i<a.length;i++) {
			temp=a[i];
		    int j=i-1;//已经排好序的元素的个数
		    while(j>=0&&a[j]>temp) {
		    	a[j+1]=a[j];
		    	j--;
		    }
			a[j+1]=temp;
		}
		return a;
		
	}
	/*shell排序
	 * 思路：将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
	 * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
	  * 时间复杂度：平均n^2,最好：n，最坏n^
	 * 空间复杂度：1
	 * 稳定性：不稳定
	 * 
	 * */
	int [] shellSort(int a[]) {
		//d是增量
		int d=a.length/2;
		//如果d大于1
		while(d>=1) {
			//对按照增量分的组，进行插入排序
			shellInsertSort(a,d);
			//对细分的组再次分组
			d=d/2;
			
		}
		
		return a;
		
	}
	private void shellInsertSort(int[] a, int d) {
		for(int i=d;i<a.length;i++) {
			if(a[i]<a[i-d]) {
				int j;
				int temp=a[i];
				a[i]=a[i-d];
				//通过循环，逐个后移一位找到要插入的位置。  
				for( j=i-d;j>=0&&temp<a[j];j=j-d) {
					a[j+d]=a[j];
					
				}
				a[j+d]=temp;
			}
		}
		
		
	}
	

}
