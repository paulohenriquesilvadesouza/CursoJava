package com.doctum.principal;

import com.doctum.oo.Cachorro;
import com.doctum.oo.Compra;
import com.doctum.oo.Pessoa;
import com.doctum.oo.Retangulo;

public class Principal
{


    public static void main(String[] args)
{
        
        Cachorro c1 = new Cachorro("Madona", 1.30);
        
        System.out.println("-----Cachorro-----");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Tamanho: " + c1.getTamanho());
        c1.brincar();
        c1.latir();
        System.out.println("Foi(ram) criado(s) " + Cachorro.mostrarQuantidade() + " cachorro(s)!\n" );

        Retangulo r1 = new Retangulo(22,44);
        
        System.out.println("-----Retangulo-----");
        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimetro());
        System.out.println("E um quadrado ? " + r1.eQuadrado() + "\n");
        
        Compra co1 = new Compra(750,10);
        
        System.out.println("-----Compra-----");
        System.out.println("Valor total: " + co1.getValorTotal());
        System.out.println("Quantidade de parcelas: " + co1.getNumeroParcelas());
        System.out.println("O valor de cada parcela e: " + co1.valorParcela() + "\n");
        
        Pessoa p1 = new Pessoa("Ernane",1.80, 84, 12, 06, 1994);
        
        System.out.println("-----Pessoa-----");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("Idade: " + p1.idade());
        System.out.println("IMC: " + p1.imc());
    }    
}
