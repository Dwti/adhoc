package studyInterface;

public class Student implements Delegate{
     
	/*public String test(Gohome gohome){
		
//	System.out.println(gohome.select("回调"));
	return gohome.select("回调");
	}
	

	@Override
	public  String select(String T) {
		// TODO Auto-generated method stub
		String s="学生乘坐"+T;
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
			return "成功";
		}else
		return "失败";
	}

}
