package br.com.faculdade.exercicios.excarro;

public class ExemploClasse {

//todos os set e os get são públicos  
    public static void main(String[] args) {
      
        VendoCarro carro1 = new VendoCarro();  // criou um objeto -> "carro1" e chamou o construtor que é -> VendoCarro
// como acessar características do carro? : (manipula tudo do carro1)    // no private somente carro1 tem o acesso das suas propriedades.
// cria conjunto de métodos para que o carro fa~a a mudança com get e set.   // se para mudar cor do carro (set para mudar cor do carro) tem que criar eles.
// tem que ensinar para o carro como muda a cor dele na classe
            carro1.setCor("vermelho");
            carro1.setModelo("HB20"); // qualquer modelo que não seja HB20, Cadillac ou Mustang, não irá aparacer no terminal.
            carro1.setAno(2020);
            carro1.setKm(13000);
            carro1.setPreco(5000000);
            carro1.imprimir();
            
/* se fosse: carro1.modelo = "sdfldsfks"; ----> Se colocar o atributo públco, o objeto perde o controle sobre as características dele
            SIGNIFICA VAZAMENTO DE CÓDIGO, OU SEJA, VAI LASCAR TODO O CÓDIGO E TODOS VÃO DIGITAR O QUE QUISER
            */
    }
    
}

// contém dentro da outra -> contains
// se é exatamente igual aos objetos -> equals
// ambas funcionam.
