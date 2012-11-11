import java.util.Scanner;

public class Echo implements Runnable{
	    
	public void run() {
		Scanner input = new Scanner(System.in);
	    int flag=0;
	    
	    while(flag==0){
	    	String string = input.nextLine();
	        if (string.equals("EXIT"))
	        	flag=1;
	        else
	        	System.out.println(string);
	        }
	    
	    input.close();
	    }

}
