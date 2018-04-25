package studyInterface;

public class Base {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Student xiaoming =new Student();
	Techer   liuyishou=new Techer();
	xiaoming.sendScuccess();
	System.out.println(xiaoming.sendScuccess());
	System.out.println(liuyishou.select("¿´³µ³µ"));
	
	new Delegate(){

		@Override
		public long startTime() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long endTime() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String sendScuccess() {
			// TODO Auto-generated method stub
			
			System.out.println("nnhdfirei");
			return null;
		}
		
	}.sendScuccess();
   }
}

