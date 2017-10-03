package com.doctum.oo;

public class Retangulo 
{
    
    private int base;
    private int altura;
    
    public Retangulo(int base, int altura) 
{
        this.base = base;
        this.altura = altura;
}

    public int getBase() 
{
        return base;
}

    public int getAltura()
 {
        return altura;
}

    public void setBase(int base)
 {
        this.base = base;
}

    public void setAltura(int altura) 
{
        this.altura = altura;
}
    
    public int area()
{
        return base*altura;
}
    
    public int perimetro()
{
        return 2*base + 2*altura;
}
    
    public boolean eQuadrado()
{
        return altura == base;
}
}
