package studyInterface;

public class Student implements Delegate{
     
	/*public String test(Gohome gohome){
		
//	System.out.println(gohome.select("�ص�"));
	return gohome.select("�ص�");
	}
	

	@Override
	public  String select(String T) {
		// TODO Auto-generated method stub
		String s="ѧ������"+T;
		return s;
	}*/


	@Override
	public long startTime() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis();
	}


	@Override
	public long endTime() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis();
	}


	@Override
	public String sendScuccess() {
		// TODO Auto-generated method stub
		if(new Rocket(this).isSuccess()){
			return "�ɹ�";
		}else
		return "ʧ��";
	}

}
