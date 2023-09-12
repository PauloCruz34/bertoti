
public class Usuario {

	private String nome;
	private int re;
	private String funcao;
	
	public Usuario(String nome,int re, String fucao){
		this.nome = nome;
		this.re = re;
		this.funcao = funcao;				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Usuario(String nome, int re, String funcao) {
	
		this.nome = nome;
		this.re = re;
		this.funcao = funcao;
	}
	

}
