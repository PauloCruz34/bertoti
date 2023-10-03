public class Veiculo {

    private String modelo;
    private String chassi;
    private Especificacao espec;

    
    public Veiculo(String modelo, String chassi, Especificacao espec){
        this.modelo = modelo;
        this.chassi = chassi;
        this.espec = espec;


    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public Especificacao getEspec() {
        return espec;
    }
    public void setEspec(Especificacao espec) {
        this.espec = espec;
    }


    
}