import java.util.Scanner;


public class Main {

	private static Scanner input;

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Banco b = new Banco();
		Cliente[] clientes = new Cliente[10];
		
		
		for(int i = 0; i < 10; i++){
			clientes[i] = new Cliente(i, b);
			}
		
		Thread[] ts = new Thread[10];
		        
		for(int i = 0; i < 10; i++)
			ts[i] = new Thread(clientes[i]);
		    
			for(int i = 0; i < 10; i++)
				ts[i].start();
			
			try{
				for(int i = 0; i < 10; i++)
					ts[i].join();
				}
		        
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		        
		    System.out.println("----------------------------------------");
		    input = new Scanner(System.in);
		    input.next();
		    
		    for(int i = 0; i < 10; i++)
		    	System.out.println(b.consultarConta(i));
		        System.out.println("----------------------------------------");
		    }
}
