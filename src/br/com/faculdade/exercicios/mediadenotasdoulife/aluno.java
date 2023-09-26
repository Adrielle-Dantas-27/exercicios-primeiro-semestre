package br.com.faculdade.exercicios.mediadenotasdoulife;


import java.util.Scanner;


class Aluno {
    // atributos
    private double notas[] = new double [3];
    private String status; // para aprovado/reprovado
    private double media = 0;
    Scanner entrada = new Scanner (System.in);

    public Aluno() { } // metodo construtor

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(int Av) { // int eh do contador
        this.notas[Av] = entrada.nextDouble(); // setar a nota
        
        while (this.notas[Av] <= 0 || this.notas[Av] > 10){
        
        System.out.println("A nota vale entre 0 e 10. ");
        }
    }

    public String status (){
        if (this.media<7){
        status = "reprovado";
        }else{
            status = "aprovados";
        }
        return status;
    }
    
    
    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = notas[0]*0.3 + notas[1]*0.3 + notas[3]*0.4; // podia fazer tres private double para a1,a2,a3; mas desse jeito q ta escrito fica mais facil de entender e mais limpo
    }
}

// precisa de alguns ajustes