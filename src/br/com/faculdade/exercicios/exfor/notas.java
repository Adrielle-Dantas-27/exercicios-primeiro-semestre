package br.com.faculdade.exercicios.exfor;

import java.util.Scanner;

public class notas {

  
    public static void main(String[] args) {
       
      double A1=0;
      double A2=0;
      double A3=0;
     
      Scanner ler = new Scanner(System.in);
      
      System.out.println("Digite sua nota da A1: ");
      A1=ler.nextDouble();
      
      for(;(A1<0)||(A1>30);){
          System.out.println("Digitou a nota incorreta, digite novamente: ");
          A1 = ler.nextDouble();
        }
       
      System.out.println("Digite sua nota da A2: ");
      A2=ler.nextDouble();
      
      for(;(A2<0)||(A2>30);){
          System.out.println("Digitou a nota incorreta, digite novamente: ");
          A2 = ler.nextDouble();
        }
      
      System.out.println("Digite sua nota da A3: ");
      A3=ler.nextDouble();
      
      for(;(A3<0)||(A3>40);){
          System.out.println("Digitou a nota incorreta, digite novamente: ");
          A3 = ler.nextDouble();   
        }
      
    }
    
}
