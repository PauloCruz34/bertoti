import java.util.LinkedList;
import java.util.List;

public class Patio {
    private List<Veiculo> veiculos = new LinkedList<Veiculo>();

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);

    }

    public List<Veiculo> buscarVeiculoPorEspecificacao(Especificacao espec) {
        List<Veiculo> veiculosEncontrados = new LinkedList<Veiculo>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getEspec().comparar(espec))
                veiculosEncontrados.add(veiculo);
        }
        return veiculosEncontrados;

    }

    public List<Veiculo> buscarVeiculoPorModelo(String modelo) {
        List<Veiculo> veiculosEncontrados = new LinkedList<Veiculo>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equals(modelo))
                veiculosEncontrados.add(veiculo);
        }
        return veiculosEncontrados;
    }

    public List<Veiculo> buscarVeiculoPorChassi(String chassi) {
        List<Veiculo> veiculosEncontrados = new LinkedList<Veiculo>();
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getChassi().equals(chassi))
                veiculosEncontrados.add(veiculo);
        }
        return veiculosEncontrados;
    }

    public Object getVeiculos() {
        return null;
    }
}