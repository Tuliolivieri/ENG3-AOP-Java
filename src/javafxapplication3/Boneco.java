/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Aluno
 */
public class Boneco 
{
    private String dir;
    private int x, y;
    private FileWriter arq;
    private PrintWriter gravaArq;
    
    public Boneco(String logLocal)throws IOException
    {
        dir = "";
        arq = new FileWriter(logLocal);
        gravaArq= new PrintWriter(arq);
        x = y = 0;
    }
    
    public String getDirection()
    {
        return dir;
    }
    
    public void andaCima()
    {
        dir = "Cima";
        System.out.println(dir);
    }
    
    public void andaBaixo()
    {
        dir = "Baixo";
        System.out.println(dir);
    }
    
    public void andaDireita()
    {
        dir = "Direita";
        System.out.println(dir);
    }
    
    public void andaEsquerda()
    {
        dir = "Esquerda";
        System.out.println(dir);
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public void gravaLog()
    {
        String s = "X: " + x + "Y: " + y + "Direction: " + dir;
        gravaArq.printf(s);
        System.out.println(s);
    }
}
