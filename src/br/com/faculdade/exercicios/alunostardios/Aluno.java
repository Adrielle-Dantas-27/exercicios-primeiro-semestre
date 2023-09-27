package br.com.faculdade.exercicios.alunostardios;

public final class Aluno {
// atributos  || todos os atributos devem ser privados
    private int RA = 0;
    private String nome = "";
    private String turma = "";
    private double[] notas;
    private int numAtiv = 0;
    
// this.ra = ra; (set.RA) e setRA()RA; são todos iguais
    
    public Aluno (int ra, String nome, String turma){
        
        setRA(RA);
        setNome(nome);
        setTurma(turma);
        
        this.numAtiv = 3;
        notas = new double[numAtiv];
        /*qnd cria aluno, ele ja tem uma ativ resolvido; nao da para mudar o numero de atividades no meio do semestre. 
        Sem set.numAtiv, vi dar para mudar a quantidade de atividades a qualquer hora*/
        // get and set permitem voce alterar
   
    }
    
    public Aluno (int ra, String nome, String turma, int numAtiv){
        
        setRA(RA);
        setNome(nome);
        setTurma(turma);
        this.numAtiv = numAtiv;
        notas = new double [numAtiv];
    }
    
    public Aluno (int ra, String nome, String turma, double[]notas){
    
        setRA(RA);
        setNome (nome);
        setTurma(turma);
        
        this.numAtiv = 3;
                             // notas = new double [numAtiv]; sem esse funcionou
        
        this.notas = notas;
    }
    

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getNumAtiv() {
        return numAtiv;
    }

    public void imprime () {
        System.out.println("RA: " + RA);
        System.out.println("Nome: " + nome);
        System.out.println("Turma: " + turma);
        
        for (int i = 0; i < this.numAtiv; i++){
            System.out.println("Atividade " + (i + 1) + ": "+ this.notas[i]);
        }
        System.out.println("---------------------------------------------");
    }

    public void print() {
    }

    public void print(int i) {
    }
  
    
    
}
