package br.com.faculdade.exercicios.exvetor;
import java.util.Scanner;
public class exvetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        int [] A = {6, 7, 8};

        
        for (int i = 0; i <=2; i++){
            System.out.println("O valor de A eh: " + (i + 1));
            A[i] = entrada.nextInt();
        }
        
        int [] B = new int [2];
        
        for (int i = 0; i <= 2; i++){
            System.out.println("O valor de B eh: " + (i + 1));
            B[i] = entrada.nextInt();
        }
        
    }
    
    
}

