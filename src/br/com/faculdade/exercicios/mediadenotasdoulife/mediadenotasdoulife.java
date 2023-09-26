package br.com.faculdade.exercicios.mediadenotasdoulife;

import java.util.Scanner;

public class mediadenotasdoulife {


    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int N = entrada.nextInt();
           
        Aluno[] aluno = new Aluno[2];
        
        for (int i = 0; i < N; i++ ){
            aluno[i] = new Aluno();
            
            for (int x = 0; x < 3; x++) {
               aluno[i].setNotas(x);
            }
            aluno[i].getMedia();
        }  
    }
}

// criar uma classe Aluno ok
// cria um vetor Aluno[i] -> main ok
// um algoritmo que calcula A1, A2, A3 de quantos alunos quisermos (ok e meio)
// A1 == 0.3 ; A2 == 0.3; A3 == 0.4
// o algoritmo tem ler as notas e printar a media de cada aluno
// tem que imprimir a nota e os alunos que tiraram abaixo de 7