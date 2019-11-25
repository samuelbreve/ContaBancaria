
public class ContaSalario extends Conta{

    public ContaSalario(int agencia, int numeroConta, String titular) {
        super(agencia, numeroConta, titular);
    }
    
    int quantidadeSaque;
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.quantidadeSaque = ++quantidadeSaque;
        
        if(quantidadeSaque >=1){
            valorTarifa(50);
        }
        else{
            valorTarifa(0);
        } 
    } 
}
