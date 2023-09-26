package br.com.faculdade.exercicios.media;

import java.util.Scanner;

public class notasmedia {

    public static void main(String[] args) {
        double A1 = 0;
        double A2 = 0;
        double A3 = 0;
        double mediafinal = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota A1:");
        A1 = ler.nextDouble();
        for (; (A1 < 0) || (A1 > 30);) {
            System.out.println("Digito invalido! Digite apenas numeros entre 0 e 30");
            A1 = ler.nextDouble();
        }

        System.out.println("Digite a nota A2:");
        A2 = ler.nextDouble();
        for (; (A2 < 0) || (A2 > 30);) {
            System.out.println("Digito invalido! Digite apenas numeros entre 0 e 30");
            A2 = ler.nextDouble();
        }

        System.out.println("Digite a nota A3:");
        A3 = ler.nextDouble();
        for (; (A3 < 0) || (A3 > 40);) {
            System.out.println("Digito invalido! Digite apenas numeros entre 0 e 40");
            A3 = ler.nextDouble();
        }

        mediafinal = A1 + A2 + A3;
        System.out.println("A nota final vale: " + mediafinal);
        /*
        if ((mediafinal >= 0) && (mediafinal <= 50)) {
            System.out.println("Reprovado");
        } else {
            if ((mediafinal >= 50) && (mediafinal < 70)) {
                System.out.println("DP");
            } else {
                System.out.println("Aprovado");
            }
        }
        */
        
        /* 
        if (mediafinal <= 50) {
            System.out.println("Reprovado");
        } else if (mediafinal < 70) {
            System.out.println("DP");
        } else {
            System.out.println("Aprovado");
        }
        */
        
        if (mediafinal >= 70) {
            System.out.println("Aprovado");
        } else if (mediafinal >= 50) {
            System.out.println("DP");
        } else {
            System.out.println("Reprovado");
        }
        
    }

}

