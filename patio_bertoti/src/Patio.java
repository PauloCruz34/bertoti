
import java.until.LinkedList;
import java.until.List;

public class Patio {
	
	private Strings setor;
	private List<veiculo> = new LinkedList<Veiculo>();
	private List<usuario> = new LinkedList<Usuario>;
	public void cadastrarVeiculos{
		veiculos.add(veiculo);
	
	}
	
	public void cadastrarUsuario{
		usuarios.add(usuario);
		
	}
	
	public List<veiculo>buscarVeiculoPorEspecificacao(Especicacao espec){
		List<Veiculo>veiculosEncontrados = new LinkedList<Veiculo>();
		for (Veiculo veiculo:veiculos) {
			if (veiculo.getEspec().comparar(espec))veiculosEncontrados.add(veiculo);
		}
	}
		return null;
	
	public List<veiculo>buscarVeiculoPorChassis(String chassisVeiculo){
		for(Veiculo veiculo:veiculos) {
			if (veiculos.getChassisVeiculo().equals(chassisVeiculo))return veiculo;
		}	
		return null;
				
	public List<Veiculo>getVeiculos(){
			return carros;
		}		
		
		
	}

}
