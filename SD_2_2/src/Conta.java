public class Conta
{
    private int dinheiro;
    
    public Conta()
    {
        dinheiro = 0;
    }
    public Conta(int ini)
    {
        dinheiro = ini;
    }
    
    public synchronized int consultar()
    {
        return dinheiro;
    }
    public synchronized int credito(int x)
    {
        dinheiro += x;
        return dinheiro;
    }
    public synchronized int debito(int x)
    {
        dinheiro -= x;
        return dinheiro;
    }
}
