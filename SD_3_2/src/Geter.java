
public class Geter implements Runnable {
	
	private BoundedBuffer bb;
	private int x;
    
    public Geter(BoundedBuffer bb)
    {
        this.bb = bb;
        x = 0;
    }
    
    public void run()
    {
        try
        {
            while(x < 5)
            {
                x = bb.get();
            }
        }
        catch(InterruptedException ie) {
        	ie.printStackTrace();
        }
        
        System.out.println("\nGeter out!");
    }
	
	
	
	
	

}
