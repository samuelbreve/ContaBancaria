
public class Contapoupanca extends Conta{ 

    public Contapoupanca(int agencia, int numeroConta, String titular) {
        super(agencia, numeroConta, titular);
    }
    
    int quantidadeSaque;
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.quantidadeSaque = ++quantidadeSaque;
        
        if(quantidadeSaque >=1 && quantidadeSaque<=3 ){
            valorTarifa(12);
        }
        else if(quantidadeSaque >3){
            valorTarifa(20);  
        }
        else{
            valorTarifa(0);
        } 
    }    
}