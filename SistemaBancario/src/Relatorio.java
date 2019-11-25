
import java.util.ArrayList;
import java.util.List;


public class Relatorio {
    
    private double valorTotalTarifa;
    private List<Conta> contasAdicionadas = new ArrayList<>();    
    
    public Conta adicionarContas(Conta conta){
        
        Conta contas = new Conta(conta.getAgencia(), conta.getNumeroConta(), conta.getTitular());
        double tarifas = 0;
        this.contasAdicionadas.add(contas);
        tarifas = conta.getTarifa();
        valorTotalTarifa(tarifas);     
        
        return contas;
    }

    public double getValorTotalTarifa() {
        System.out.print("O total arrecadado pelo Banco foi de: R$");        
        return valorTotalTarifa;
    }
    
    void valorTotalTarifa(double tarifas){            
        this.valorTotalTarifa = valorTotalTarifa + tarifas;        
    }    
}
