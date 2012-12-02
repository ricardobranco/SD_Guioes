
public class Puter implements Runnable{
	
	
	private BoundedBuffer bb;
    private int x, id;
    
    public Puter(int xx, BoundedBuffer bb)
    {
        this.bb = bb;
        x = xx;
        id = x;
    }
    
    public void run()
    {
        while(x <= 5)
			try {
				bb.put(x++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
        System.out.println("\nPuter " + id + " out!");
    }

}
