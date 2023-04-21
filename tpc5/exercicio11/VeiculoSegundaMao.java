package tpc5.exercicio11;

public class VeiculoSegundaMao extends veiculo {
    private final int numeroDonos;

    public VeiculoSegundaMao(String placa, String marca, int anoFabricacao, double valor, int numeroDonos) {
        super(placa, marca, anoFabricacao);
        this.numeroDonos = numeroDonos;
    }

    public int getNumeroDonos() {
        return numeroDonos;
    }

    public boolean temMultiplosDonos() {
        return numeroDonos > 1;
    }
}
