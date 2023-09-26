package br.com.faculdade.exercicios.orientacaoobjeto;

// classe conceito
public class aluno {   // cada objeto é uma cápsula
/*atributos*/    
    private String nome;
    private long ra = 0; // se numero for mt grande pode mudar para long (inteiro dobrado) em vez de int (so aceita ate 10 nums)
    private String curso;
    private double A1 = 0; // esse private nao aparece na interfac do usuário
    private double A2 = 0;
    private double A3 = 0;
    private double presenca = 0;
/* contrutor*/
    public aluno (String nome, long RA, String curso){ // isso vai especificar o dado que eu colocar la no main
        this.nome = nome; // o nome vai cair na classe aluno
        this.ra = ra;
        this.curso = curso;   
    }
    
// métodos são funções
   public String getNome(){ // vai retornar o nome
    return this.nome;
   }
}
