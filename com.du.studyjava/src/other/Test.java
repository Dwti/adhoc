package other;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public Test() {
		
	}

	public static void main(String[] args) {
		printSelfpowerNumbers();
		
	}
	/*打印1-999999999中的自幂数*/
	int  getSum(){
		List<Integer> numbers1=new ArrayList<>();
					numbers1=getSum(7788);
					   int sum=0;
				for (Integer integer : numbers1) {
				
				sum=sum+integer;
					
				}
				System.out.println(sum);
				return sum;
	}
	
	private static void printSelfpowerNumbers(){
		List<Integer> numbers=new ArrayList<>();
		for(int i=100;i<9999;i++) {
			numbers=getSum(i);
			   int sum=0;
			   int j=numbers.size();
//			   System.out.print(j);
				for (Integer integer : numbers) {
				sum=(int) (sum+(Math.pow(integer, j)));	
				}

			if(i==sum) {
				System.out.println(i);
				
			}
		}
	}

	private static List<Integer>  getSum(int i) {
		List<Integer> result = new ArrayList<>();
		while(i>0) {
		result.add(i%10);
		i=i/10;
		}
		return result;
	}
	
	
	
}
