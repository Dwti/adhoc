package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
	/*	ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("hhhh");
		 
		System.out.println(arrayList.size());*/
		
		
		/*HashSet<String> hashSet=new HashSet<>();
		//向上转型为Set
		Set<String> set=hashSet;
		set.add("1111");
		set.add("sss");
		set.add("ddd");
		set.add("ccc");
		set.isEmpty();
//		set.clear();
		for (String string : set) {
			System.out.println(	string);
		}
		//迭代器   
		Iterator<String> iterator=set.iterator();  
		
		System.out.println(	set.isEmpty());
	
*/
		
		
		/*HashMap<String, String> map=new HashMap<>();
		Map<String,String> map2=map;
		map2.put("1", "张三");
		map2.put("2", "李四");
		map2.put("3", "王五");
		map2.put("4", "小明");
		System.out.println(map.get("4"));
		map.get("1");*/
		HashMap<User, String> map=new HashMap<>();
		Map< User, String> map2=map;
		User u1=new User("zhangsan",1);
		map2.put(u1, "acbfdddd");
		String string=map2.get(new User("zhangsan",1));
		System.out.println(string);
		System.out.println(map2);
		System.out.println(u1.hashCode());
	}
	
}
