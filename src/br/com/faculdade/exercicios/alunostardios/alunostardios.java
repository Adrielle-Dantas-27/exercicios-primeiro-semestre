package br.com.faculdade.exercicios.alunostardios;

public class alunostardios {

  
    public static void main(String[] args) {
       
        //aluno que entrou agora
        Aluno Spencer = new Aluno (2717,"Spencer","FBI Angent");
        
        // aluno tardio com nota da A1
        double[] temp = {6, 7, 8, 9};
        Aluno Prentiss = new Aluno (4931, "Prentiss", "FBI Agent", temp); // a ordem deve se manter -> ra, nome, turma 
        
        // aluno que nao eh da turma
        Aluno Derek = new Aluno (1293, "Derek", "Actor", 4);
        Spencer.imprime(); // vai chamar o public void do class para imprimir os dados dos estudantes 
        Prentiss.imprime();
        Derek.imprime();

    }
    
}
