
public class BoundedBuffer {
	
	
	private int[] array;
	private int size,index;
	
	
	
	public BoundedBuffer(int size){
		this.array = new int[size];
		this.size=size;
		this.index = 0;
	}
	
	
	public synchronized void put(int v) throws InterruptedException{
		while(index >= size)
			wait();
		
		array[index++]=v;
		notifyAll();
		System.out.println("Put " + v + ": index " + index);
		}
	
	public synchronized int get() throws InterruptedException{
		int res;
		
		while(index<=0)
			wait();
		
		res = array[--index];
		notifyAll();
		System.out.println("Get "+ res+": index " + index);
		return res;
		}

	
	
}
