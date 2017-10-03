package com.doctum.bd;

public abstract class Conta
{    
    private int numero;
    private String nome;
    private double saldo;

    public int getNumero()
    {
        return numero;
    }

    public String getNome()
    {
        return nome;
    }

    public double getSaldo()
    {
        return saldo;
    }

    protected void setNumero(int numero)
    {
        this.numero = numero;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    protected void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
}
