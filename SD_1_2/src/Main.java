import java.util.ArrayList;


public class Main {
	
	public static void main(String args[]) {
		
		Numero n = new Numero(0);
		
		ArrayList<Thread> al = new ArrayList<Thread>();
		Incrementador inc = new Incrementador(n); 
		
		for(int i=0; i<10; i++){
			al.add(new Thread(inc));
		}
		
		for(int i=0; i<10; i++){
			al.get(i).start();
		}
		
		for(int i=0; i<10; i++){
			
			try {
				al.get(i).join();
			} catch (InterruptedException e) {}
		}
		
		System.out.println("O valor final é: " + n.getX());
	}

}
