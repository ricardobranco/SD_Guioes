public class Contador implements Runnable {
	public void run(){
		int i= 0;
		
		while(true){
			System.out.println(i++);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
