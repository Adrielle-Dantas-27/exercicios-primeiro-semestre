package br.com.faculdade.exercicios.imparoupar;
import java.util.Scanner;

public class ImparOuPar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println(" O numero " + (num) + " é par.");
        } else {
            System.out.println(" O numero " + (num) + " é ímpar.");
        }
    }
}
// para indentar o código no netbeans eh so apertar ALT + SHIFT + F