package io;

public class AWorker implements Worker {
	private Worker worker;
	

	public AWorker(Worker worker) {
		this.worker=worker;
		
	}

	@Override
	public void dosomeWork() {
		System.out.println("ÄãºÃ");
		worker.dosomeWork();
		
	}
																																																																																																																																																		
  
}

