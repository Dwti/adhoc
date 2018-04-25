package studyInterface;

public class Techer implements Gohome{

	@Override
	public String select(String T) {
		// TODO Auto-generated method stub
		String t="老师"+T;
		return "老师实现了此接口";
	}

}
