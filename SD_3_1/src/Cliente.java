public class Cliente implements Runnable
{
    private int nc;
    private Banco banco;
    
    public Cliente(int c, Banco b)
    {
        nc = c;
        banco = b;
    }
    
    public void run()
    {
        try
        {
            banco.credito(nc, 100);
            Thread.sleep(100);
            banco.debito(nc, 50);
            Thread.sleep(100);
            banco.credito(nc, nc+1);
            Thread.sleep(100);
            banco.transferir(nc, (nc+1)%10, nc+1);
            
            System.out.println("Cliente " + nc + " acabou. " + banco.consultarConta(nc));
        }
        catch(InterruptedException ie) 
        {
            System.out.println("Cliente " + nc + " nao conseguiu acabar.");
        }
    }
}
