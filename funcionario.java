public class funcionario {
    String nome;
    String departamento;
    String dataentrada;
    String rg;
    double salario;

    static class Data {
        static int dia;
        static int mes;
        static int ano;


    }
    public String formatada(){
        System.out.print(Data.dia + "/" + Data.mes+ "/" + Data.ano);
        return null;
    }

    void recebeAumento(double aumento){
        this.salario +=aumento;
    }

    double calculaGanhoAnual() {
        double valor = 0.0;
        valor = salario *12;
        return valor;
    }


    void mostra(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Departamento:" + this.departamento);
        System.out.println("Data:" + this.dataentrada);
        System.out.println("RG:" + this.rg);
        System.out.println("salario atual:" + this.salario);
        System.out.println("ganho anual:" + this.calculaGanhoAnual());
        System.out.println("Data formatada:" + this.formatada());
    }




    //RESPOSTA a pergunta 8 do exercicio da seccao 4.12
    // estes coodigos nao fazem sentido porque o primeiro codigo tenta atribuir valor a classe funcionario
    //e isto nao e possivel ja o segundo tenta invocar a funcao classe o que nao se pode fazer

}


