package learningThreadUsingRunnable;


class Threading implements Runnable{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName()+" is winning");
	}
}

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1= new Thread(new Threading());
		Thread t2= new Thread(new Threading());
		
		t1.setName("Dhoni");
		t2.setName("Virat");
		t1.start();
		t2.start();
	}

}
