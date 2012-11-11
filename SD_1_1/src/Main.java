public class Main {
	
	public static void main(String args[]) {
		Thread contador = new Thread(new Contador());
		Thread eco = new Thread(new Echo());
		
		contador.start();
		eco.start();

		try {
			contador.join();
			eco.join();
			} catch (InterruptedException e) {}
		System.out.println("Fim");
		}

}
