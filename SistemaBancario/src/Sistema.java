
public class Sistema {
    
    public static void main(String[] args) {
        
        Conta c1 = new ContaCorrente(01, 4001, "Bill Gates");
        Conta c2 = new Contapoupanca(02, 4002, "Silvio Santos");
        Conta c3 = new ContaSalario(03, 4003, "Aristovaldo");
        Conta c4 = new ContaCorrente(04, 4004, "Samuel");  
        
        c1.depositar(1000);
        c1.sacar(500);
        
        c2.depositar(1000);
        c2.sacar(500);
        
        c3.depositar(1000);
        c3.sacar(500);
        
        c4.depositar(1000);
        c4.sacar(500);
        
        Relatorio r1= new Relatorio();
        r1.adicionarContas(c1);
        r1.adicionarContas(c2);
        r1.adicionarContas(c3);
        r1.adicionarContas(c4);
        
        System.out.println(r1.getValorTotalTarifa());
        
    }
    
}
