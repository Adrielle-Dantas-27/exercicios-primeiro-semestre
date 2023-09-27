package br.com.faculdade.exercicios.herancaconceito;

// sempre verificar se todas as classes e o mmain estao num mesmo file
public class herancaconceito {

    public static void main(String[] args) {
     
     aluno Spencer = new aluno("Spencer", 12345); //todos os construtores padroes vão ser herdados pois n tem nenhum construtor para Aluno
      
      Spencer.setNome("Spencer");
      Spencer.print(2);
      
      //alterar/ permitir que altere o nome, ra, cpf, sobrenome e etc
      
     aluno Derek = new aluno ("Derek",12344, 2193093);
     Derek.print();
     Derek.print(1);
     Derek.print(2);
        
    }
    
}
//herança poo: eh criar subclasse ou classes filhas e elas se espeializam em uma determinada tarefa
/*
diagrama de classes: 

--------------------
       pessoas (tipo base)
--------------------
     (atributos)
- Nome (-) -> private
- CPF
-------------------
     (métodos)
get
set
titulo (saber o que é essa coisa e ela me retorna o tipo que ela tem)
-------------------
*/

/* (classes) -> todos vao vir a partir da classe base (Pessoas)

-------------------
       Aluno (tipo de pessoa) -> além de ser aluno ele tb é uma pessoa
-------------------
RA
turma
-------------------
get
set
titulo (de pessoa (nome))
-------------------

a outra classe:

-------------------
    professor (tipo de pessoa)
-------------------
cracha
horas
-------------------
get
set
titulo
-------------------
*/

// engenharia de componente


/* ex genérico de herança: exemplo de mamifero tem tipo aquatico e um animal tipo é uma baleia (baleia eh um tipo de herança porque voce conhece
toda a herança dela como mamifero por ex, ja que existem varios tipos de mamiferos não só aquaticos.) */