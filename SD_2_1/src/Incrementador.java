
public class Incrementador implements Runnable {

	
	Numero n;
	
	public Incrementador(Numero n){
		this.n = n;
	}
	
	
	
	@Override
	public void run() {
		for(int i=0; i<10000000; i++){
			n.incX();
		}
	}

}
