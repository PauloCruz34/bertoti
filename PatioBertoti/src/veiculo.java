
public class veiculo {

	private String chassisVeiculo;
	private Especificacao espec;
	
	public Veiculo(String chassisVeiculo, Especificacao espec){
		this.chassisVeiculo = chassisVeiculo;
		this.espec = espec;
			
	}

	public String getChassisVeiculo() {
		return chassisVeiculo;
	}

	public void setChassisVeiculo(String chassisVeiculo) {
		this.chassisVeiculo = chassisVeiculo;
	}

	public Especificacao getEspec() {
		return espec;
	}

	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}

	public veiculo(String chassisVeiculo, Especificacao espec) {
		super();
		this.chassisVeiculo = chassisVeiculo;
		this.espec = espec;
	}
	
	

}
