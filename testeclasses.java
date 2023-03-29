
public class testeclasses {
    public static void main(String[] args) {
    funcionario f1 = new funcionario();
    f1.nome = "jose";
    f1.salario = 100;
    f1.recebeAumento(50);
    f1.dataentrada = String.valueOf(10);

    funcionario f2 = new funcionario();
    f2.nome = "Danilo";
    f2.salario = 100;
    if (f1 == f2) {
        System.out.println("iguais");
    }
    else {
        System.out.println("diferentes");
    }
        // RESPOSTA A PERGUNTA DA ALINEA 5 DA SECCAO 4.12
        // no entanto o if ira apresentar a resposta que sao diferentes

        funcionario f3 = f1;
        // Acontece e que o f3 ira receber o valor de f1 ou seja
        // todos os metodos, atributos, valores e variaveis serao
        // passados de f1 para f3 como se f3 fosse uma copia de f1...




    funcionario.Data data = new funcionario.Data();
    f1.dataentrada = data.toString();

    f3.mostra();
    }

}