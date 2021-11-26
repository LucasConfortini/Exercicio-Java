package exemplo;

public class Conta {
    int numero;
    String nome_titular;
    double saldo;
    
    void depositar(double valor){
        this.saldo=this.saldo+valor;
        System.out.println("Saldo atual: R$ "+String.format("%.2f", saldo));
    }
    
    boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            System.out.println("Saldo atual: R$ "+String.format("%.2f", saldo));
            return(true);
        }
        else{
            return false;
        }
    }
    
}
