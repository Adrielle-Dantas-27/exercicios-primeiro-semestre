package br.com.faculdade.exercicios.media;

import java.util.Scanner;

public class Nota {
    public void calculaMedia() {
       
       double A1 = 0;
       double A2 = 0;
       double A3 = 0;
       double mediafinal = 0;

       Scanner entrada = new Scanner(System.in);

       System.out.println("Digite a nota A1: ");
       A1 = entrada.nextDouble();

       System.out.println("Digite a nota A2: ");
       A2 = entrada.nextDouble();

       System.out.println("Digite a nota A3: ");
       A3 = entrada.nextDouble();
       
       mediafinal = 0.3 * A1 + 0.3 * A2 + 0.4 * A3;
       System.out.println("A nota final vale: " + mediafinal);
    }
}
