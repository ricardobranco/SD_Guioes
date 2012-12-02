import java.util.ArrayList;


public class Banco
{
    private ArrayList<Conta> contas;
   
    public Banco()
    {
        contas = new ArrayList<Conta>(10);
        for(int i = 0; i < 10; i++)
            contas.add(new Conta());
        }
    
    public String consultarConta(int nc)
    {
        return "Conta " + nc + ": " + contas.get(nc).consultar();
    }
    
    
    public int credito(int nc, int x)
    {
        int saldoFinal = contas.get(nc).credito(x);
        return saldoFinal;
    }
    public int debito(int nc, int x)
    {
        int saldoFinal = contas.get(nc).debito(x);
        return saldoFinal;
    }
    public void transferir(int src, int dst, int x)
    {
        if(src != dst)
        {
            int max, min;
            if(src < dst)
            {
                min = src;
                max = dst;
            }
            else
            {
                min = dst;
                max = src;
            }
            
            synchronized(contas.get(min))
            {
                synchronized(contas.get(max))
                {
                    contas.get(dst).credito(x);
                }
            }
        }
    }
    
    
   
}
