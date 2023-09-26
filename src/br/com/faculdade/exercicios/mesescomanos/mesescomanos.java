package br.com.faculdade.exercicios.mesescomanos;

public class mesescomanos {

    public static void main(String[] args) {
       String mes [] = {"Jan", "Feb", "Mar", "Jun", "Jul", "Aug", "Out", "Sep", "Out", "Nov", "Dez"};
       int dias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31, 30, 31};
        
        for(int c = 0; c < mes.length; c++) {
            System.out.println("O mes de " + mes[c] + " tem " + dias[c] + " dias ao todo.");
        }
    }
    
}
