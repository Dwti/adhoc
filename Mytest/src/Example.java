
public class Example {
	static int i;
	
		public Example() {
			// TODO Auto-generated constructor stub
		}
		StringBuilder stBuilder=new StringBuilder("ceshi");
		String str=new String("good");
		char[]ch={'a','b','c'};
		public static void main(String args[]){
		
		Example ex=new Example();
		ex.change(ex.str,ex.ch);
//		ex.change(ex.stBuilder, ex.ch);
		System.out.print(ex.stBuilder+" and ");
		System.out.print(ex.ch);
		System.out.print(i);
		double m=5.0;
		System.out.print(3.0/4);
		}
		
		public void change(String str,char ch[]){
			str="test ok";
		    ch[0]='g';
	
		}
		
		
		/*public static void main(String args[]){
			StringBuffer a=new StringBuffer("a");
			StringBuffer b=new StringBuffer("b");
			append(a, b);
			System.out.print(a.toString()+","+b.toString());
			b=a;
			System.out.print("////");
			System.out.print(a.toString()+","+b.toString());
			
			String  str1="a";
			String str2="a";

			String str3=new String("b");
			
			System.out.println(str1.hashCode());
			System.out.print("------");
			System.out.println(str2.hashCode());
			System.out.print("------");
			System.out.println(str3.hashCode());
			
			
		}*/
		
		public static void append(StringBuffer a,StringBuffer b) {
			a.append(b);
			b=a;
		}
	}

