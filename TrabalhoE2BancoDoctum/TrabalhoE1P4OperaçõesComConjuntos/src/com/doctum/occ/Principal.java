package com.doctum.occ;

public class Principal
{

    public static void main(String[] args)
    {
        
        int[] conjA = {1, 3, 5};
        int[] conjB = {8, 2};
        int[] conjC = new int[20];
        int[] conjD = new int[11];
        
        for(int i = 0 ; i < 20; i++)
        {
            conjC[i]=i+1;
        }
        for(int i = 0 ; i < 11; i++)
        {
            conjD[i]=i*10;
        }
        
        System.out.println("4 pertence ao conjunto A: " + OperacaoComConjuntos.pertence(4,conjA));
        System.out.println("2 pertence ao conjunto B : " + OperacaoComConjuntos.pertence(2,conjB));
        System.out.println("3 pertence ao conjunto C: " + OperacaoComConjuntos.pertence(3,conjC));
        System.out.println("9 pertence ao conjunto B: " + OperacaoComConjuntos.pertence(9,conjB));
        System.out.println("7 pertence ao conjunto A: " + OperacaoComConjuntos.pertence(7,conjA));
        System.out.println("5 pertence ao conjunto C: " + OperacaoComConjuntos.pertence(5,conjC));
        System.out.println("18 pertence ao conjunto C: " + OperacaoComConjuntos.pertence(18,conjC));
        System.out.println("13 pertence ao conjunto C: " + OperacaoComConjuntos.pertence(13,conjC));
        System.out.println("30 pertence ao conjunto C: " + OperacaoComConjuntos.pertence(30,conjC));
        System.out.println("15 pertence ao conjunto D: " + OperacaoComConjuntos.pertence(15,conjD));
        System.out.println("60 pertence ao conjunto D: " + OperacaoComConjuntos.pertence(60,conjD));
        System.out.println("95 pertence ao conjunto D: " + OperacaoComConjuntos.pertence(95,conjD));
    }
    
}
