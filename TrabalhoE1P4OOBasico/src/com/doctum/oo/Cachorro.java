package com.doctum.oo;

public class Cachorro {
    
    private String nome;
    private double tamanho;
    private static int quantidade;
    
    public Cachorro(String nome, double tamanho)
{
        this.nome = nome;
        this.tamanho = tamanho;
        quantidade++;
}

    public String getNome()
{
        return nome;
}

    public double getTamanho()
{
        return tamanho;
}

    public void setNome(String nome)
{
        this.nome = nome;
}

    public void setTamanho(float tamanho)
{
        this.tamanho = tamanho;
}
    
    public void brincar()
{
        System.out.println(this.nome + " brincando!");       
}
    
    public void latir()
{
        System.out.println(this.nome + " latindo!"); 
}
    
    public static int mostrarQuantidade()
{
        return quantidade;
}    
}
