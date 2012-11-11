
public class Numero {

	int x;

	public Numero(int x) {
		this.x = x;
	}

	public synchronized int getX() {
		return x;
	}

	public synchronized void setX(int x) {
		this.x = x;
	}
	
	public synchronized void incX(){
		this.x++;
	}
	
	
	
	
	
	
}
