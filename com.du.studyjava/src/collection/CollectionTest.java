package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 实现的功能：
 * 1.通过Collections.sort(),对Integer泛型的List进行排序
 * 2.通过Collections.sort(),对String泛型的List进行排序
 * 3.通过Collections.sort(),对其他的泛型的List进行排序，以Student为例
 * */
public class CollectionTest {
	

	private static final String integers = null;
	public CollectionTest() {
		
	}
	//对Integer泛型的List进行排序
    public void testSort1() {
    	List<Integer> integers=new ArrayList<>();
    	Random random=new Random();
    	Integer k;
    	for(int i=0; i<10;i++) {
    		do {
    		k=random.nextInt(100);
    		}while(integers.contains(k));
    		integers.add(k);
    		System.out.println("添加成功");
    		
    	}
    	System.out.println("--------------排序前---------------");
    	for(Integer num:integers) {
    		System.out.println("元素："+num);
    		
    	}
    	System.out.println("--------------排序后---------------");
//   排序
    	java.util.Collections.sort(integers);
    	for(Integer num:integers) {
    		System.out.println("元素："+num);
    		
    	}
    	}
  //对String泛型的List进行排序
    public void testSort2() {
    	List<String> strings=new ArrayList<>();
    	strings.add("mhtyishjiaj");
    	strings.add("google");
    	strings.add("hello");
    	System.out.println("--------------排序前---------------");
    	for (String string : strings) {
    		
    		System.out.println(string);
		}
    	//0-9，A-Z，a-z排序
    	java.util.Collections.sort(strings);
    	System.out.println("--------------排序后---------------");
    	for (String string : strings) {
    		System.out.println(string);
		}
    	
    }
    /*
     * 高级点点的需求
     * 1.创建一个String的泛型，往其中添加10条随机字符串
     * 2.每条字符串的长度为10以内的随机数
     * 3.每条字符串的每个字符都为随机生成的字符，字符可以重复
     * 4.每条随机字符串不可重复
     * */
    public void mytest() {
    	List<String> strings=new ArrayList<>();
        String baseString="abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random=new Random();
        StringBuffer buffer=new StringBuffer();
        int length=random.nextInt(10);
        for(int i=0;i<length;i++) {
        	buffer.append(baseString.charAt(random.nextInt(62)));
        	strings.add(buffer.toString());
        	
        	
        	
        }
        
    	System.out.println(strings);
        
        for (String string : strings) {
        	System.out.println(string);
		}
//    	strings.add()
    }
    
  //对其他类型的泛型的List进行排序
//    Comparable的接口是默认的，Comparator临时的比较接口
    public void testSort3() {
    List<Student> students=new ArrayList<>();
    students.add(new Student("10", "xiaohomng"));
    students.add(new Student("34", "熊明"));
    students.add(new Student("2", "哈哈哈"));
    System.out.println("--------------排序前---------------");
	for (Student student : students) {
		   System.out.println(student.getName());
	}
	java.util.Collections.sort(students);
	System.out.println("--------------排序后---------------");
	for (Student student : students) {
		   System.out.println(student.getName());
	}
    } 
    
    
	public static void main(String[] args) {
		CollectionTest test=new CollectionTest();
//		test.testSort2();
//		test.mytest();
		test.testSort3();
		

	}

}
