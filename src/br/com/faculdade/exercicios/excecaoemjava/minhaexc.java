package br.com.faculdade.exercicios.excecaoemjava;

public class minhaexc extends Exception {
    private String msg;
    boolean getMessage;
    
    public minhaexc() {
        this.msg = "Deu algum erro";
    }
    
    public minhaexc (String msg) {
        this.msg = msg;
    }
    
    @Override // sobreescrita
    public String getMessage() {
        return this.msg;
    }
}
// método final é aquele que nao pode ser alterado