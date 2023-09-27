package br.com.faculdade.exercicios.herancaconceito;

public class pessoa {// conceito
    private String nome; // recebe um nome apenas
    private int CPF;
    private String nomeSocial = nome; // campo social precisa ter ai (caso n tenham colocado) e coloca ele na superclasse que é essa de Pessoa
    
    // inicialização dentro do construtor, logo eh aconselhável ser o primeiro
    
    public pessoa() { // consturtor n tem retorno (void) 
        this.CPF = 999999;
        this.nome = "Seu nome";
        this.nomeSocial = "Nome social"; // assim n precisa mudar nenhua classe (pois foi agregado dps da superclasse quase pronta)   
    }
    
    public pessoa (String nome) {
        this.nome = nome;
        this.CPF = 999999; // aqui verifica a informação por isso o cpf aq tb
    }
    
    public pessoa (String nome, int CPF) {
        this.nome = nome;
        this.CPF = this.validaCPF(CPF);
    }
    
      public pessoa (String nome, String nomeSocial, int CPF) {
        this.nome = nome;
        this.CPF = CPF;
        this.nomeSocial = nomeSocial; // acrescentando novas funções para pessoas
    }
    
    public int validaCPF (int CPF) {
        return CPF; // vai retornar cpf no Pessoa com validaCPF
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) { // n tem regra se o nome for certo ou errado
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = this.validaCPF(CPF); // aqui vai validar o cpf (modo simples)
    }

    public void print() {
    
        System.out.println("nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("------------------");
    }
    public String toString() { // para console imprime a msg e na interface aparece janela do site
        String txt = " ";
        txt = txt + "nome: " + this.nome+ "/n";  //     '/n' pula linha
        txt = txt + "CPF: " + this.CPF;
        
        return txt;
    } // vai retornar um texto se quiser usa em interface ele roda
    
    public String titulo() {
        return "Pessoa";
    }
} // sempre criar funções para tudo que for fazer para se der algo errado da para concertar uma parte sem deletar tudo do codigo
