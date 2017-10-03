package com.doctum.oo;

import java.util.Calendar;

public class Pessoa
{
    
    private String nome;
    private double altura;
    private double peso;
    private Calendar dataNascimento = Calendar.getInstance();
    private Calendar hoje = Calendar.getInstance();

    public Pessoa (String nome, double altura, double peso, int dia, int mes, int ano)
{
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento.set(Calendar.Dia,dia);
        this.dataNascimento.set(Calendar.Mes,mes);
        this.dataNascimento.set(Calendar.Ano,ano);
}

    public String getNome()
{
        return nome;
}

    public double getAltura()
{
        return altura;
}

    public double getPeso() 
{
        return peso;
}

    public Calendar getDataNascimento() 
{
        return dataNascimento;
}

    public Calendar getHoje() 
{
        return hoje;
}

    public void setNome(String nome) 
{
        this.nome = nome;
}

    public void setAltura(double altura) 
{
        this.altura = altura;
}

    public void setPeso(double peso) 
{
        this.peso = peso;
}

    public void setDataNascimento(int dia, int mes, int ano) 
{
        this.dataNascimento.set(Calendar.Dia,dia);
        this.dataNascimento.set(Calendar.Mes,mes);
        this.dataNascimento.set(Calendar.Ano,ano);
}

    public void setHoje(Calendar hoje)
{
        this.hoje = hoje;
}
    
    public int idade()
{
        
        int idade = hoje.get(Calendar.Ano) - dataNascimento.get(Calendar.Ano);
        
        if(hoje.get(Calendar.Mes) < dataNascimento.get(Calendar.Mes))
{
            idade--;
}
        else{
            if(hoje.get(Calendar.Mes)== dataNascimento.get(Calendar.Mes) && hoje.get(Calendar.Dia)< dataNascimento.get(Dia))
{
                idade--;
            }
        }
        return idade;
    }
    
    public double imc()
{
        return peso/(altura*altura);
    }
    
}
