package br.com.faculdade.exercicios.exfor;

import java.util.Scanner;

public class NotasComFor {
    
    public static void main(String[] args) {

        double A1 = 0;
        double A2 = 0;
        double A3 = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite A1:");
        
        //tratando erro em caso de entrada de caractere que nao seja numero

        do {
            try {
                A1 = ler.nextDouble();
                for (; (A1 < 0) || (A1 > 30);) {
                    System.out.println("Digito invalido! Digite apenas numeros entre 0 e 30");
                    A1 = ler.nextDouble();
                }
                break;
            } catch (Exception e) {
                System.out.println("O digito: " + ler.next() + ", nao e valido!");
                ler = new Scanner(System.in);
            }
        } while (true);
        // fechou 
        System.out.println("Digite A2:");
        A2 = ler.nextDouble();

        for (; (A2 < 0) || (A2 > 30);) {
            System.out.println("Digitou errado, digite novamente: ");
            A2 = ler.nextDouble();
        }

        System.out.println("Digite A3:");
        A3 = ler.nextDouble();

        for (; (A3 < 0) || (A3 > 40);) {
            System.out.println("Digitou errado, digite novamente: ");
            A3 = ler.nextDouble();
        }
        System.out.println("finalizado com sucesso");
    }
}
