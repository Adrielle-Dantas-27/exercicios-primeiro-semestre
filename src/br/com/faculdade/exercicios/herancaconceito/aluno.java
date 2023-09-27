package br.com.faculdade.exercicios.herancaconceito;

// falar para o computadpr que aluno é uma pessoa: 

public class aluno extends pessoa { // vai extender os dados de pessoa para ca 
    private int RA;
    
 /* private Avaliacao notas; // conceito de classe dentro de uma classe
    // qual a diferença de herança e composição? 
        - composição entre classe, usou uma classe omo 'parte' de outra classe, composição faz parte do Aluno (notas, ra de aluno) classe pronta usa como atributo para outra
          usa a classe para fazer parte de outra e ela eh atributo de classe que está criando.
      
        - herança é a relação e um tipo, ex aluno é uma pessoa, Aluno É uma pessoa.
    || tras para a subclasse todas as coisas que ja tem na superclasse, acrescenta novas coisas || especialização. */
    
    public aluno () {
    /* superclasse é a pessoa e a subclasse é this que está nessa classe*/
       super(); // vai puxar la da classe pessoa
       this.RA = 55555;
    }
    
    public aluno(String nome, int RA) {
        super(nome); // vai chamar tudo do atributo nome, o get, set e etc.
        this.RA = RA;
    }
    
    /*public Aluno (String nome, int CPF) { // erro porque a assinatura está errada (sobrecarga)
        super (nome, CPF);
        this.RA = 55555;    
    }*/
    
    public aluno(String nome, int CPF, int RA) {
        super(nome, CPF);
        this.RA = RA;
    }/* agora a assinatra está diferente, logo vai reconhecer*/
 
    // inserir separadamente o nome e o sobrenome somente em uma variavel
    public aluno(String nome,String sobrenome, int CPF, int RA) {
    // colocar o separadorde texto|| escolher um valer q nunca vai usar para poder ser a regra ou espaços 
        super(nome + " " + sobrenome);
        setCPF(CPF); // igual para settar
        this.RA = RA;
    } 
    // precisa criar um print especifico para mostrar todos os dados dos alunos não so de pessoa
    
    @Override // tudo que for sobreescrever tem q por ele antes
    public void print() { // nomes iguais so que formas diferentes de imprimir polimorfismo de sobreescrita -> sobreescreva aquilo que foi criado pela Pessoa
        System.out.println("nome: " + super.getNome()); // assim vai puxar o nome da classe pessoa super la no get nome
        System.out.println("RA: " + this.RA);
        System.out.println("------------------------");
    }
    
    public void print (int op) {
        switch (op) {
            case 1:
                super.print();
            break;
            case 2:
                this.print();
            break;
            default: System.out.println("op inválida");
            break;
        }
    }

    public int getRA() {
        return this.RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
    
}
