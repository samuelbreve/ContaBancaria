
public class Conta {
    
    private int agencia;
    private int numeroConta;
    private String titular;
    private double saldo;
    private double tarifa; 
    
    public Conta(int agencia, int numeroConta, String titular){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTarifa() {
        return tarifa;
    }    
    
    public void valorTarifa(double valor) {
        this.tarifa = valor;
    }
    
    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade; 
        this.saldo = novoSaldo;
        
    }
    
    void depositar(double quantidade) {
        this.saldo += quantidade;
    }    
}
