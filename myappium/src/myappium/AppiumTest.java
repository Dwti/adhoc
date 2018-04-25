package myappium;

public class AppiumTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        try{
        	YixueyilianTesting.startapp();
        	YixueyilianTesting.login();
        	Thread.sleep(1000);
        }catch  (Exception e){
        	
        	
        }
        finally{
        	YixueyilianTesting.quit();
		}
	}

}
