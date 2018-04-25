package studyInterface;

public class Rocket {
	private Delegate deletimer;
	public Rocket(Delegate d){
		super();
		this.deletimer=d;
		}
	
      public long getStartTime(){
    	  long starttime=deletimer.startTime();
    	  return starttime;
      }
      public long getEndtTime(){
    	  long endtime=deletimer.endTime();
    	  return endtime;
      }
      public boolean isSuccess(){
    	  if(getEndtTime()-getStartTime()<=0.1){
    		  return true;
    	  }
    	  deletimer.sendScuccess();  
    	  return false;
    	  
      }
}
