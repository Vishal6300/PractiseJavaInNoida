package learningThread;

 class MultiThread extends Thread {
	 public void run() {
		 for(int i=0;i<10;i++)
		 System.out.println(Thread.currentThread().getName()+" is playing");
	 }
}

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread mt=new MultiThread();
		MultiThread mt1=new MultiThread();
		
		mt.setName("CSK");
		mt1.setName("RCB");
		
		mt.start();
		try {
			mt.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt1.start();
		
	}

}
