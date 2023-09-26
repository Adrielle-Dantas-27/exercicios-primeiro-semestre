package br.com.faculdade.exercicios.excarro;

public class VendoCarro {
// variáveis || atributos do VendoCarro    
    private double preco = 0;
    private String modelo = "";
    private String cor = "";
    private int ano = 0;
    private int km = 0;
    
    public VendoCarro () { }
// tem que ensinar para o carro como muda a cor dele na classe VendoCarro
    
    public void setCor (String cor) {
        this.cor = cor;  // aqui ele já aprendeu que a cor é o que o usuário escolher.
        
        /* cor em verde (azul claro): atributo do método.
           cor em amarelo (amarelo) : argumento do parenteses eh uma variável que so existe dentro do set cor.
           quando chamar a função setCor, vai atribuir a cor para o objeto
        */
    }
    
    public String getCor(){ // vai retornar cor
        return this.cor;
    }
    
    private boolean testaModelo (String modelo) {
    
        if (modelo.equalsIgnoreCase("HB20") ||
             modelo.equalsIgnoreCase("Cadillac") ||
             modelo.equalsIgnoreCase("Mustang")) {
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setModelo (String modelo) {
        if (testaModelo (modelo)) {              
            this.modelo = modelo;
            return true;
        }else{
            return false;
        }           // desvio    ||    // modelo eh váriavel dentro do testaModelo
    }

    public int getAno() {
        return ano;
        
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void imprimir () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Km: " + this.km);
        System.out.println("preço: " + this.preco);

    }
    
}
// o getter and setter so funcionam se ambos não forem determinados anteriormente, se não será feito separadamente o insert code.
