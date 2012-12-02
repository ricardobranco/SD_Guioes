
public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoundedBuffer bb = new BoundedBuffer(5);
		Puter[] puters = new Puter[5];
        Geter[] geters = new Geter[5];
        Thread[] ts = new Thread[10];
        for(int i = 0; i < 5; i++){
        	puters[i] = new Puter(i, bb);
            geters[i] = new Geter(bb);
            }
        
        
        for(int i = 0; i < 5; i++){
        	ts[i] = new Thread(puters[i]);
        	}
        
        for(int i = 5; i < 10; i++){
            ts[i] = new Thread(geters[i-5]);
        	}
        
        for(int i = 0; i < 10; i++)
            ts[i].start();
        
        
        try{
        	for(int i = 0; i < 10; i++)
                ts[i].join();
        	}
        catch(InterruptedException ie) {
        	ie.printStackTrace();
        	}
        }
}


