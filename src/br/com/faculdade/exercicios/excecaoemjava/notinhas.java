package br.com.faculdade.exercicios.excecaoemjava;


public class notinhas {
    
    public notinhas() {
    
    }
    
  /*  public boolean verificaNota(int notas) throws MinhaExc {
        if ((notas < 0)||(notas > 10)) {
            return false; // se for falso manda a exceção
        } else {
            return true;
        }
    }*/
    
    public void verificaNota(int notas) throws minhaexc{
        if((notas < 0)||(notas > 10)) {
            throw new minhaexc("nota invalida"); // invocar erro de exceção e o catch tem que capturar ele
        }
    }
}

//diferença de throw e throws