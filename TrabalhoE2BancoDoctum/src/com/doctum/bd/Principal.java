package com.doctum.bd;

public class Principal
{

    public static void main(String[] args)
    {
        
        ContaCorrente cc1 = new ContaCorrente(1, "Ernane", 1850);
        
        System.out.println("Conta Corrente: " + cc1.getNumero() + ", " + cc1.getNome());
        System.out.println("Saldo: " + cc1.getSaldo());
        cc1.depositar(500);
        System.out.println("Saldo: " + cc1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente cc2 = new ContaCorrente(2, "Katia", 6000);
        
        System.out.println("Conta corrente: " + cc2.getNumero() + ", " + cc2.getNome());
        System.out.println("Saldo: " + cc2.getSaldo());
        cc2.depositar(500);
        System.out.println("Saldo: " + cc2.getSaldo());
        cc2.sacar(500);
        System.out.println("Saldo: " + cc2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrente cc3 = new ContaCorrente(3, "Taty", 1500);
        
        System.out.println("Conta corrente: " + cc3.getNumero() + ", " + cc3.getNome());
        System.out.println("Saldo: " + cc3.getSaldo());
        cc3.sacar(1100);
        System.out.println("Saldo: " + cc3.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial(1, "Ernane", 2000, 4000);
        
        System.out.println("Conta corrente especial: " + cce1.getNumero() + ", " + cce1.getNome() + ", Limite: " + cce1.getLimite());
        System.out.println("Saldo: " + cce1.getSaldo());
        cce1.depositar(1000);
        System.out.println("Saldo: " + cce1.getSaldo());
        cce1.sacar(1000);
        System.out.println("Saldo: " + cce1.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce2 = new ContaCorrenteEspecial(2, "Katia", 3000, 2000);
        
        System.out.println("Conta corrente especial: " + cce2.getNumero() + ", " + cce2.getNome() + ", Limite: " + cce2.getLimite());
        System.out.println("Saldo: " + cce2.getSaldo());
        cce2.depositar(1000);
        System.out.println("Saldo: " + cce2.getSaldo());
        cce2.sacar(3000);
        System.out.println("Saldo: " + cce2.getSaldo());
        
        System.out.println("\n");
        
        ContaCorrenteEspecial cce3 = new ContaCorrenteEspecial(3, "Taty", 6000, 2000);
        
        System.out.println("Conta corrente especial: " + cce3.getNumero() + ", " + cce3.getNome() + ", Limite: " + cce3.getLimite());
        System.out.println("Saldo: " + cce3.getSaldo());
        cce3.depositar(1000);
        System.out.println("Saldo: " + cce3.getSaldo());
        cce3.sacar(6000);
        System.out.println("Saldo: " + cce3.getSaldo());        
        System.out.println("\n");                           
    }
    
}
