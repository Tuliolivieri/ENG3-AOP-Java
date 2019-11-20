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
    private FileWriter arq;
    private PrintWriter gravaArq;
    
    public Boneco(String logLocal)throws IOException
    {
        dir = "";
        arq = new FileWriter(logLocal);
        gravaArq= new PrintWriter(arq);
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
}
