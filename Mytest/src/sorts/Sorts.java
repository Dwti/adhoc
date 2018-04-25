package sorts;

public class Sorts {

	public Sorts() {
		
	}
	/*
	 * ��������
	 * ˼�룺ͨ��һ�����򽫴������¼�ָ�ɶ����������֣�����һ���ּ�¼�Ĺؼ��־�����һ���ֹؼ���С��
	 * ��ֱ���������ּ�����������ֱ��������������
	 * ʱ�临�Ӷȣ�ƽ��nlog2n,��ã�nlog2n���n^2
	 * �ռ临�Ӷȣ�nlog2n
	 * �ȶ��ԣ����ȶ�
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
		int temp=a[low];//����һ����ʱ�ı���������ҳ��Ļ�׼��
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
	/*ð������
	 * ˼·����Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ����������ν��бȽϺ͵�����
	 *     �ýϴ�������³�����С������ð������ÿ�������ڵ����ȽϺ������ǵ�����������Ҫ���෴ʱ���ͽ����ǻ�����
	 * ʱ�临�Ӷȣ�ƽ��n^2,��ã�n���n^2
	 * �ռ临�Ӷȣ�1
	 * �ȶ��ԣ��ȶ�
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
	/*ѡ������
	 * ˼·����Ҫ�����һ�����У�ѡ����С��������󣩵�һ�������1��λ�õ���������
	 * Ȼ����ʣ�µ�������������С��������󣩵����2��λ�õ���������
	 * �������ƣ�ֱ����n-1��Ԫ�أ������ڶ��������͵�n��Ԫ�أ����һ�������Ƚ�Ϊֹ��
	 * ʱ�临�Ӷȣ�ƽ��n^2,��ã�n^2���n^2
	 * �ռ临�Ӷȣ�1
	 * �ȶ��ԣ����ȶ�
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
	/*������
	 * ˼·����ʼʱ��Ҫ�����n���������п�����һ��˳��洢�Ķ�������һά����洢��������
	 * ���������ǵĴ洢��ʹ֮��Ϊһ���ѣ����Ѷ�Ԫ��������õ�n ��Ԫ������С(�����)��Ԫ�أ�
	 * ��ʱ�ѵĸ��ڵ������С��������󣩡�Ȼ���ǰ��(n-1)��Ԫ�����µ���ʹ֮��Ϊ�ѣ�
	 * ����Ѷ�Ԫ�أ��õ�n ��Ԫ���д�С(��δ�)��Ԫ�ء�
	 * �������ƣ�ֱ��ֻ�������ڵ�Ķѣ��������������������õ���n���ڵ���������С����������Ϊ������
	 * ʱ�临�Ӷȣ�ƽ��nlog2n,��ã�nlog2n���nlog2n
	 * �ռ临�Ӷȣ�1
	 * �ȶ��ԣ����ȶ�
	 * 
	 * */
	//1.�����ѣ������Ѷ������һ��Ҷ�ӽڵ�   
	int[] heapSort(int []a) {
		//ѭ��������
		for(int i=0;i<a.length-1;i++) {
			buildMaxHeap(a,a.length-1-i);
			//�����Ѷ������һ��Ԫ��
			swap(a,0,a.length-1-i);
			
		}
		
		
		return a;
		
	}
	//�����ķ���
	private void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	//�����󶥶�,��0��lastIndex�����󶥶�
	private void buildMaxHeap(int[] a, int lastIndex) {
		//��lastIndex���ڵ�ĸ��ڵ㿪ʼ
		for(int i=(lastIndex-1)/2;i>=0;i--) {
			//k�������������жϵĽڵ�
			int k=i;
			//�����ǰK�ڵ���ӽڵ����
			while(k*2+1<=lastIndex) {
				//K�ڵ�����ӽڵ������
				int biggerIndex=k*2+1;
				//���biggerIndexС��lastIndex��˵��K�ڵ�������ӽڵ㣬��biggerIndex+1�����k�ڵ�����ӽڵ� 
				if(biggerIndex<lastIndex) {
					//������ӽڵ�������Ӽ���
					if(a[biggerIndex]<a[biggerIndex+1]) {
						//biggerIndex��ʱ��Ӧ�ü�¼�ϴ��Լ����������biggerIndex��ʱ����Ҫ+1
					biggerIndex=biggerIndex+1;
					}
					
				}
				//���k�ڵ��ֵС�ڽϴ�ڵ��ֵ���ͽ�������
				if(a[k]<a[biggerIndex]) {
					swap(a, k, biggerIndex);
					//��biggerIndex��ֵ��k,��ʼwhileѭ������һ��ѭ�������±�֤k�ڵ��ֵ�����������ӽڵ��ֵ
					k=biggerIndex;
				}else {
					break;
				}
			}
			
		}
		
		
		
	}
	/*ֱ�Ӳ�������
	 * ˼·����һ����¼���뵽������õ�������У��Ӷ��õ�һ���£���¼����1�������
	 * �����Ƚ����еĵ�1����¼������һ������������У�Ȼ��ӵ�2����¼������в��룬ֱ��������������Ϊֹ��
	 * Ҫ�㣺�����ڱ�����Ϊ��ʱ�洢���ж�����߽�֮�á�
	  * ʱ�临�Ӷȣ�ƽ��n^2,��ã�n���n^2
	 * �ռ临�Ӷȣ�1
	 * �ȶ��ԣ��ȶ�
	 * */
	int []insertSort(int []a){
		int temp;//��Ҫ�������
		for(int i=1;i<a.length;i++) {
			temp=a[i];
		    int j=i-1;//�Ѿ��ź����Ԫ�صĸ���
		    while(j>=0&&a[j]>temp) {
		    	a[j+1]=a[j];
		    	j--;
		    }
			a[j+1]=temp;
		}
		return a;
		
	}
	/*shell����
	 * ˼·��������������ļ�¼���зָ��Ϊ���������зֱ����ֱ�Ӳ�������
	 * �����������еļ�¼����������ʱ���ٶ�ȫ���¼��������ֱ�Ӳ�������
	  * ʱ�临�Ӷȣ�ƽ��n^2,��ã�n���n^
	 * �ռ临�Ӷȣ�1
	 * �ȶ��ԣ����ȶ�
	 * 
	 * */
	int [] shellSort(int a[]) {
		//d������
		int d=a.length/2;
		//���d����1
		while(d>=1) {
			//�԰��������ֵ��飬���в�������
			shellInsertSort(a,d);
			//��ϸ�ֵ����ٴη���
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
				//ͨ��ѭ�����������һλ�ҵ�Ҫ�����λ�á�  
				for( j=i-d;j>=0&&temp<a[j];j=j-d) {
					a[j+d]=a[j];
					
				}
				a[j+d]=temp;
			}
		}
		
		
	}
	

}
