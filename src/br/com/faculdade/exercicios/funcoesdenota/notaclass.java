package br.com.faculdade.exercicios.funcoesdenota;


import java.util.Scanner;

public class notaclass {
// função numero 1
    public static double calculaMedia(double[]notas,double[]peso){
        double notafinal = 0;
        for(int i = 0; i < 3; i++){
            notafinal = notafinal = notas[i]*peso[i]; // codigos reutilizados
        }
        return notafinal; // retorna a notafinal para dentro do método
    }
    
// função numero 2    
    public static boolean verificaNota(double nota){
        if ((nota < 0)|| (nota > 10)){ // codigos reutilizados
            return false;
        }else{
            return true;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        double[]notas = new double[3];
        double notafinal = 0;
        double[]peso = {0.3,0.3,0.4}; 
         
        int idAluno = 0;
         
        for (int i = 0; i < 3; i++){
          do {
                System.out.println("digite a nota A" + (i + 1) + ":" );
                notas[i] = ler.nextDouble();
            if (!FuncoesNotas.verificaNota(notas[i])){ // so vai chamar a verific da nota da biblio se a nota for condizente às operaçoes da função criada
                System.out.println("nota inválida");
                // com "!" o intervalo do for fica entre 0 e 10
                // sem "!" o intervalo fica fora do entre 0 e 10
                // sem "!" tudo que é false vira true e vise versa
             }
           }while(!FuncoesNotas.verificaNota(notas[i])); // vai chamar a função de verificar nota dentro da biblioteca FuncoesNotas
        } 
 
        for (int i = 0; i<3; i++) {
            notafinal = notafinal + notas[i]*peso[i]; // som a nota final e multiplica pelo peso
            System.out.println("sua nota final é: " +  notafinal);
        }
        
    }  
}
