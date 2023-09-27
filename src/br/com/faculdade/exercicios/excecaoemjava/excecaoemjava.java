package br.com.faculdade.exercicios.excecaoemjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecaoemjava {

  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      
        int notas = 0;
        
        notinhas nt = new notinhas();
      
        boolean flag = false;
        do {
            System.out.println("digite um numero de 1 a 10: ");
            try { // execução do código
                // flag = false; // resetar o try
                notas = ler.nextInt();
                 // flag = true; // o problema na linha 17 como se tivesse correto
                 /* if ((notas < 0)||(notas > 10)) {
                      System.out..println("nota invalida");  // isso tb eh uma exceção // erro de execução
                    throw new MinhaExc ("nota invalida"); // que tipo de progreção aconteça || invoca uma nova exceção
                     } // forçando a execução de um erro
                */
            
            nt.verificaNota(notas);
            flag = true;  
            }catch (minhaexc erro){
                System.out.println(erro.getMessage);
            }catch (InputMismatchException erro){
                System.out.println("voce não digitou errado");
            }catch (Exception erro){ // caso algo acont~ça ele vai para o tratamento de exceção (exception é uma classe)
                System.out.println("deu erro");
                System.out.println(erro.getClass()); // informar qual foi o real motivo da exceção
            }finally {
                ler.nextLine(); // deu certo por casa do finally tb
            }
        } while ((notas < 0)||(notas < 10)|| (flag == false));
        
        System.out.println("A nota digitada: " + notas);
    } // dizer ao java o que deve ser feito no tratamento
}

/* tratar erro de se digitar errado como resolver com try e catch
    try o qu quer que ele faça e o catch pra fazer operação
    identificar a falha
 
*/