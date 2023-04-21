package tpc5.exercicio11;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteVeiculos {
    public static void main(String[] args) {
        veiculo veiculo = new veiculo("1234", "ToyotaSUPRA", 2000, 100.0);
        VeiculoSegundaMao veiculoSegundaMao = new VeiculoSegundaMao("5678", "Honda", 2015, 8000.0, 2);

        System.out.println("Placa do Veículo: " + veiculo.getPlaca());
        System.out.println("Marca do Veículo: " + veiculo.getMarca());
        System.out.println("Ano de Fabricação do Veículo: " + veiculo.getAnoFabricacao());
        System.out.println("Valor do Veículo: " + veiculo.getValor());
        System.out.println("Idade do Veículo: " + veiculo.calcularIdade(2023));

        System.out.println("Placa do Veículo de Segunda Mão: " + veiculoSegundaMao.getPlaca());
        System.out.println("Marca do Veículo de Segunda Mão: " + veiculoSegundaMao.getMarca());
        System.out.println("Ano de Fabricação do Veículo de Segunda Mão: " + veiculoSegundaMao.getAnoFabricacao());
        System.out.println("Valor do Veículo de Segunda Mão: " + veiculoSegundaMao.getValor());
        System.out.println("Idade do Veículo de Segunda Mão: " + veiculoSegundaMao.calcularIdade(2023));
        System.out.println("Número de Donos do Veículo de Segunda Mão: " + veiculoSegundaMao.getNumeroDonos());
        System.out.println("Tem Múltiplos Donos: " + veiculoSegundaMao.temMultiplosDonos());
    }


    public static class ProgramaVeiculos {
        public static void main(String[] args) {
            ArrayList<veiculo> listaVeiculos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            int opcao;
            do {
                System.out.println("\nSelecione uma opção:");
                System.out.println("1 - Adicionar veículo");
                System.out.println("2 - Listar veículos");
                System.out.println("3 - Apagar um veículo");
                System.out.println("4 - Sair");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarVeiculo(listaVeiculos, scanner);
                        break;
                    case 2:
                        listarVeiculos(listaVeiculos);
                        break;
                    case 3:
                        apagarVeiculo(listaVeiculos, scanner);
                        break;
                    case 4:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } while (opcao != 4);

            scanner.close();
        }

        private static void apagarVeiculo(ArrayList<veiculo> listaVeiculos, Scanner scanner) {
        }

        private static void listarVeiculos(ArrayList<veiculo> listaVeiculos) {
        }

        private static void adicionarVeiculo(ArrayList<veiculo> listaVeiculos, Scanner scanner) {
        }
    }
}