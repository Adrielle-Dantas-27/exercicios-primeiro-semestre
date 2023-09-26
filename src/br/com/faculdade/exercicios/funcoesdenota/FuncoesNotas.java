package br.com.faculdade.exercicios.funcoesdenota;

public class FuncoesNotas {
     public static double calculaMedia(double[]notas,double[]peso){
        double notafinal = 0;
        for(int i = 0; i<3; i++){
            notafinal = notafinal = notas[i]*peso[i];
        }
        return notafinal;
    }
    
    
    public static boolean verificaNota(double nota){
        if ((nota < 0)|| (nota > 10)){
            return false;
        }else{
            return true;
        }
    }
}
