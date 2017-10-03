package com.doctum.bd;

public class ContaCorrente extends Conta
{
    
    public ContaCorrente(int numero, String nome, double saldo)
    {
       
        this.setNumero(numero);
        this.setNome(nome);
        this.setSaldo(saldo);
    }    
    public void depositar(double valorDeposito)
    {
        if(valorDeposito > 0)
        {
            this.setSaldo(this.getSaldo()+ valorDeposito);
            System.out.println("Deposito efetuado!");
        }
        else
        {
            System.out.println("Valor de deposito inválido!");
        }
    }
    public void sacar(double valorSaque)
    {
        if(valorSaque > 0)
        {
            if(valorSaque <= this.getSaldo())
            {
                this.setSaldo(this.getSaldo()- valorSaque);
                System.out.println("Saque efetuado!");
            }
            else
            {
                System.out.println("Valor de saque inválido!");
            }
        }
        else
        {
            System.out.println("Valor de saque inválido!");
        }
    }
}
