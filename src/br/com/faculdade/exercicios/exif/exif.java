package br.com.faculdade.exercicios.exif;
import java.util.Scanner;

public class exif {
     //para por nome é so usar
    // string nome = in.nextLine();
   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double nota=0;
        
        System.out.println("Digite sua nota:");
        nota=entrada.nextDouble();
        
        if ((nota>=0)&& (nota<=10)) {
        if (nota>=6) {
           System.out.println("Aprovado");
        }

        else {
            if(nota<5) {
            }
            else { 
               System.out.println("DP" );
            } 
        } 

        }     
    }   
}