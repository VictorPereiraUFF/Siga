package pessoas;

public class Disciplina {
	
	private String nome;
	private final String codigoDisciplina;
	private int creditosDisciplina;
	
	public Disciplina(String nome, String codigoDisciplina, int creditosDisciplina) {
		super();
		this.nome = nome;
		this.codigoDisciplina = codigoDisciplina;
		this.creditosDisciplina = creditosDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditosDisciplina() {
		return creditosDisciplina;
	}

	public String getCodigo() {
		return codigoDisciplina;
	}

}
