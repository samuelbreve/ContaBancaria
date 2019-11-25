
public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroConta, String titular) {
        super(agencia, numeroConta, titular);
    }
    
    int quantidadeSaque; 
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.quantidadeSaque = ++quantidadeSaque;
        
        if(quantidadeSaque >=1 && quantidadeSaque<=5 ){
            valorTarifa(28);
        }
        else if(quantidadeSaque >=6 && quantidadeSaque<=10 ){
            valorTarifa(45);  
        }
        else if(quantidadeSaque >10){
            valorTarifa(60);            
        }
        else{
            valorTarifa(0);
        } 
    }    
}